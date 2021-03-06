#!/usr/local/bin/thrift -java

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#
# Thrift Service that the MetaStore is built on
#

include "share/fb303/if/fb303.thrift"
include "sentry_common_service.thrift"

namespace java org.apache.sentry.provider.db.service.thrift
namespace php sentry.provider.db.service.thrift
namespace cpp Apache.Sentry.Provider.Db.Service.Thrift


# Represents a Privilege in transport from the client to the server
struct TSentryPrivilege {
1: required string privilegeScope, # Valid values are SERVER, DATABASE, TABLE
2: optional string privilegeName, # Generated on server side
3: required string serverName,
4: optional string dbName,
5: optional string tableName,
6: optional string URI,
7: required string action,
8: optional i64 createTime, # Set on server side
9: optional string grantorPrincipal # Set on server side
}

# TODO can this be deleted? it's not adding value to TAlterSentryRoleAddGroupsRequest
struct TSentryGroup {
1: required string groupName
}

# CREATE ROLE r1
struct TCreateSentryRoleRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName, # TSentryRole is not required for this request
}
struct TCreateSentryRoleResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# DROP ROLE r1
struct TDropSentryRoleRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName # role to drop
}
struct TDropSentryRoleResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# TODO what is this implementing SHOW GRANT/SHOW ROLE GRANT?
# We should have seperate requests for those commands
struct TListSentryRolesRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: optional string rolerequestorGroupNames, # list roles for this group
4: required string roleName # role get prirvilges for
}
# used only for TListSentryRolesResponse
struct TSentryRole {
1: required string roleName,
2: required set<TSentryPrivilege> privileges,
3: required string grantorPrincipal
}
struct TListSentryRolesResponse {
1: required sentry_common_service.TSentryResponseStatus status
2: required set<TSentryRole> roles
}

# GRANT ROLE r1 TO GROUP g1
struct TAlterSentryRoleAddGroupsRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName,
5: required set<TSentryGroup> groups
}

struct TAlterSentryRoleAddGroupsResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# REVOLE ROLE r1 FROM GROUP g1
struct TAlterSentryRoleDeleteGroupsRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName,
5: required set<TSentryGroup> groups
}
struct TAlterSentryRoleDeleteGroupsResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# GRANT ... ON ... TO ROLE ...
struct TAlterSentryRoleGrantPrivilegeRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName,
5: required TSentryPrivilege privilege
}
struct TAlterSentryRoleGrantPrivilegeResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# REVOKE ... ON ... FROM ROLE ...
struct TAlterSentryRoleRevokePrivilegeRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required string requestorUserName, # user on whose behalf the request is issued
3: required set<string> requestorGroupNames # groups the requesting user belongs to
4: required string roleName,
5: required TSentryPrivilege privilege
}
struct TAlterSentryRoleRevokePrivilegeResponse {
1: required sentry_common_service.TSentryResponseStatus status
}

# This API was created specifically for ProviderBackend.getPrivileges
# and is not mean for general purpose privilege retrieval.
# This request/response pair are created specifically so we can
# efficiently obtain the specific privilges for a user query
struct TSentryActiveRoleSet {
1: required bool all,
2: required set<string> roles,
}
struct TListSentryPrivilegesForProviderRequest {
1: required i32 protocol_version = sentry_common_service.TSENTRY_SERVICE_V1,
2: required set<string> groups,
3: required TSentryActiveRoleSet roleSet,
}
struct TListSentryPrivilegesForProviderResponse {
1: required sentry_common_service.TSentryResponseStatus status
2: required set<string> privileges
}

service SentryPolicyService
{
  TCreateSentryRoleResponse create_sentry_role(1:TCreateSentryRoleRequest request)
  TDropSentryRoleResponse drop_sentry_role(1:TDropSentryRoleRequest request)

  TAlterSentryRoleGrantPrivilegeResponse alter_sentry_role_grant_privilege(1:TAlterSentryRoleGrantPrivilegeRequest request)
  TAlterSentryRoleRevokePrivilegeResponse alter_sentry_role_revoke_privilege(1:TAlterSentryRoleRevokePrivilegeRequest request)

  TAlterSentryRoleAddGroupsResponse alter_sentry_role_add_groups(1:TAlterSentryRoleAddGroupsRequest request)
  TAlterSentryRoleDeleteGroupsResponse alter_sentry_role_delete_groups(1:TAlterSentryRoleDeleteGroupsRequest request)

  TListSentryRolesResponse list_sentry_roles_by_group(1:TListSentryRolesRequest request)
  TListSentryRolesResponse list_sentry_roles_by_role_name(1:TListSentryRolesRequest request)

  # For use with ProviderBackend.getPrivileges only
  TListSentryPrivilegesForProviderResponse list_sentry_privileges_for_provider(1:TListSentryPrivilegesForProviderRequest request)
}
