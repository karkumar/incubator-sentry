/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.sentry.provider.db.service.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TAlterSentryRoleAddGroupsRequest implements org.apache.thrift.TBase<TAlterSentryRoleAddGroupsRequest, TAlterSentryRoleAddGroupsRequest._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TAlterSentryRoleAddGroupsRequest");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField REQUESTOR_USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorUserName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REQUESTOR_GROUP_NAMES_FIELD_DESC = new org.apache.thrift.protocol.TField("requestorGroupNames", org.apache.thrift.protocol.TType.SET, (short)3);
  private static final org.apache.thrift.protocol.TField ROLE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("roleName", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField GROUPS_FIELD_DESC = new org.apache.thrift.protocol.TField("groups", org.apache.thrift.protocol.TType.SET, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TAlterSentryRoleAddGroupsRequestStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TAlterSentryRoleAddGroupsRequestTupleSchemeFactory());
  }

  private int protocol_version; // required
  private String requestorUserName; // required
  private Set<String> requestorGroupNames; // required
  private String roleName; // required
  private Set<TSentryGroup> groups; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PROTOCOL_VERSION((short)1, "protocol_version"),
    REQUESTOR_USER_NAME((short)2, "requestorUserName"),
    REQUESTOR_GROUP_NAMES((short)3, "requestorGroupNames"),
    ROLE_NAME((short)4, "roleName"),
    GROUPS((short)5, "groups");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // REQUESTOR_USER_NAME
          return REQUESTOR_USER_NAME;
        case 3: // REQUESTOR_GROUP_NAMES
          return REQUESTOR_GROUP_NAMES;
        case 4: // ROLE_NAME
          return ROLE_NAME;
        case 5: // GROUPS
          return GROUPS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PROTOCOL_VERSION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUESTOR_USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestorUserName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUESTOR_GROUP_NAMES, new org.apache.thrift.meta_data.FieldMetaData("requestorGroupNames", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.ROLE_NAME, new org.apache.thrift.meta_data.FieldMetaData("roleName", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GROUPS, new org.apache.thrift.meta_data.FieldMetaData("groups", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TSentryGroup.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TAlterSentryRoleAddGroupsRequest.class, metaDataMap);
  }

  public TAlterSentryRoleAddGroupsRequest() {
    this.protocol_version = 1;

  }

  public TAlterSentryRoleAddGroupsRequest(
    int protocol_version,
    String requestorUserName,
    Set<String> requestorGroupNames,
    String roleName,
    Set<TSentryGroup> groups)
  {
    this();
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
    this.requestorUserName = requestorUserName;
    this.requestorGroupNames = requestorGroupNames;
    this.roleName = roleName;
    this.groups = groups;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TAlterSentryRoleAddGroupsRequest(TAlterSentryRoleAddGroupsRequest other) {
    __isset_bitfield = other.__isset_bitfield;
    this.protocol_version = other.protocol_version;
    if (other.isSetRequestorUserName()) {
      this.requestorUserName = other.requestorUserName;
    }
    if (other.isSetRequestorGroupNames()) {
      Set<String> __this__requestorGroupNames = new HashSet<String>();
      for (String other_element : other.requestorGroupNames) {
        __this__requestorGroupNames.add(other_element);
      }
      this.requestorGroupNames = __this__requestorGroupNames;
    }
    if (other.isSetRoleName()) {
      this.roleName = other.roleName;
    }
    if (other.isSetGroups()) {
      Set<TSentryGroup> __this__groups = new HashSet<TSentryGroup>();
      for (TSentryGroup other_element : other.groups) {
        __this__groups.add(new TSentryGroup(other_element));
      }
      this.groups = __this__groups;
    }
  }

  public TAlterSentryRoleAddGroupsRequest deepCopy() {
    return new TAlterSentryRoleAddGroupsRequest(this);
  }

  @Override
  public void clear() {
    this.protocol_version = 1;

    this.requestorUserName = null;
    this.requestorGroupNames = null;
    this.roleName = null;
    this.groups = null;
  }

  public int getProtocol_version() {
    return this.protocol_version;
  }

  public void setProtocol_version(int protocol_version) {
    this.protocol_version = protocol_version;
    setProtocol_versionIsSet(true);
  }

  public void unsetProtocol_version() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return EncodingUtils.testBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID);
  }

  public void setProtocol_versionIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PROTOCOL_VERSION_ISSET_ID, value);
  }

  public String getRequestorUserName() {
    return this.requestorUserName;
  }

  public void setRequestorUserName(String requestorUserName) {
    this.requestorUserName = requestorUserName;
  }

  public void unsetRequestorUserName() {
    this.requestorUserName = null;
  }

  /** Returns true if field requestorUserName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorUserName() {
    return this.requestorUserName != null;
  }

  public void setRequestorUserNameIsSet(boolean value) {
    if (!value) {
      this.requestorUserName = null;
    }
  }

  public int getRequestorGroupNamesSize() {
    return (this.requestorGroupNames == null) ? 0 : this.requestorGroupNames.size();
  }

  public java.util.Iterator<String> getRequestorGroupNamesIterator() {
    return (this.requestorGroupNames == null) ? null : this.requestorGroupNames.iterator();
  }

  public void addToRequestorGroupNames(String elem) {
    if (this.requestorGroupNames == null) {
      this.requestorGroupNames = new HashSet<String>();
    }
    this.requestorGroupNames.add(elem);
  }

  public Set<String> getRequestorGroupNames() {
    return this.requestorGroupNames;
  }

  public void setRequestorGroupNames(Set<String> requestorGroupNames) {
    this.requestorGroupNames = requestorGroupNames;
  }

  public void unsetRequestorGroupNames() {
    this.requestorGroupNames = null;
  }

  /** Returns true if field requestorGroupNames is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestorGroupNames() {
    return this.requestorGroupNames != null;
  }

  public void setRequestorGroupNamesIsSet(boolean value) {
    if (!value) {
      this.requestorGroupNames = null;
    }
  }

  public String getRoleName() {
    return this.roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public void unsetRoleName() {
    this.roleName = null;
  }

  /** Returns true if field roleName is set (has been assigned a value) and false otherwise */
  public boolean isSetRoleName() {
    return this.roleName != null;
  }

  public void setRoleNameIsSet(boolean value) {
    if (!value) {
      this.roleName = null;
    }
  }

  public int getGroupsSize() {
    return (this.groups == null) ? 0 : this.groups.size();
  }

  public java.util.Iterator<TSentryGroup> getGroupsIterator() {
    return (this.groups == null) ? null : this.groups.iterator();
  }

  public void addToGroups(TSentryGroup elem) {
    if (this.groups == null) {
      this.groups = new HashSet<TSentryGroup>();
    }
    this.groups.add(elem);
  }

  public Set<TSentryGroup> getGroups() {
    return this.groups;
  }

  public void setGroups(Set<TSentryGroup> groups) {
    this.groups = groups;
  }

  public void unsetGroups() {
    this.groups = null;
  }

  /** Returns true if field groups is set (has been assigned a value) and false otherwise */
  public boolean isSetGroups() {
    return this.groups != null;
  }

  public void setGroupsIsSet(boolean value) {
    if (!value) {
      this.groups = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((Integer)value);
      }
      break;

    case REQUESTOR_USER_NAME:
      if (value == null) {
        unsetRequestorUserName();
      } else {
        setRequestorUserName((String)value);
      }
      break;

    case REQUESTOR_GROUP_NAMES:
      if (value == null) {
        unsetRequestorGroupNames();
      } else {
        setRequestorGroupNames((Set<String>)value);
      }
      break;

    case ROLE_NAME:
      if (value == null) {
        unsetRoleName();
      } else {
        setRoleName((String)value);
      }
      break;

    case GROUPS:
      if (value == null) {
        unsetGroups();
      } else {
        setGroups((Set<TSentryGroup>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return Integer.valueOf(getProtocol_version());

    case REQUESTOR_USER_NAME:
      return getRequestorUserName();

    case REQUESTOR_GROUP_NAMES:
      return getRequestorGroupNames();

    case ROLE_NAME:
      return getRoleName();

    case GROUPS:
      return getGroups();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case REQUESTOR_USER_NAME:
      return isSetRequestorUserName();
    case REQUESTOR_GROUP_NAMES:
      return isSetRequestorGroupNames();
    case ROLE_NAME:
      return isSetRoleName();
    case GROUPS:
      return isSetGroups();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TAlterSentryRoleAddGroupsRequest)
      return this.equals((TAlterSentryRoleAddGroupsRequest)that);
    return false;
  }

  public boolean equals(TAlterSentryRoleAddGroupsRequest that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true;
    boolean that_present_protocol_version = true;
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (this.protocol_version != that.protocol_version)
        return false;
    }

    boolean this_present_requestorUserName = true && this.isSetRequestorUserName();
    boolean that_present_requestorUserName = true && that.isSetRequestorUserName();
    if (this_present_requestorUserName || that_present_requestorUserName) {
      if (!(this_present_requestorUserName && that_present_requestorUserName))
        return false;
      if (!this.requestorUserName.equals(that.requestorUserName))
        return false;
    }

    boolean this_present_requestorGroupNames = true && this.isSetRequestorGroupNames();
    boolean that_present_requestorGroupNames = true && that.isSetRequestorGroupNames();
    if (this_present_requestorGroupNames || that_present_requestorGroupNames) {
      if (!(this_present_requestorGroupNames && that_present_requestorGroupNames))
        return false;
      if (!this.requestorGroupNames.equals(that.requestorGroupNames))
        return false;
    }

    boolean this_present_roleName = true && this.isSetRoleName();
    boolean that_present_roleName = true && that.isSetRoleName();
    if (this_present_roleName || that_present_roleName) {
      if (!(this_present_roleName && that_present_roleName))
        return false;
      if (!this.roleName.equals(that.roleName))
        return false;
    }

    boolean this_present_groups = true && this.isSetGroups();
    boolean that_present_groups = true && that.isSetGroups();
    if (this_present_groups || that_present_groups) {
      if (!(this_present_groups && that_present_groups))
        return false;
      if (!this.groups.equals(that.groups))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_protocol_version = true;
    builder.append(present_protocol_version);
    if (present_protocol_version)
      builder.append(protocol_version);

    boolean present_requestorUserName = true && (isSetRequestorUserName());
    builder.append(present_requestorUserName);
    if (present_requestorUserName)
      builder.append(requestorUserName);

    boolean present_requestorGroupNames = true && (isSetRequestorGroupNames());
    builder.append(present_requestorGroupNames);
    if (present_requestorGroupNames)
      builder.append(requestorGroupNames);

    boolean present_roleName = true && (isSetRoleName());
    builder.append(present_roleName);
    if (present_roleName)
      builder.append(roleName);

    boolean present_groups = true && (isSetGroups());
    builder.append(present_groups);
    if (present_groups)
      builder.append(groups);

    return builder.toHashCode();
  }

  public int compareTo(TAlterSentryRoleAddGroupsRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    TAlterSentryRoleAddGroupsRequest typedOther = (TAlterSentryRoleAddGroupsRequest)other;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(typedOther.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, typedOther.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorUserName()).compareTo(typedOther.isSetRequestorUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorUserName, typedOther.requestorUserName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRequestorGroupNames()).compareTo(typedOther.isSetRequestorGroupNames());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestorGroupNames()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestorGroupNames, typedOther.requestorGroupNames);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRoleName()).compareTo(typedOther.isSetRoleName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoleName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.roleName, typedOther.roleName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGroups()).compareTo(typedOther.isSetGroups());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGroups()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.groups, typedOther.groups);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TAlterSentryRoleAddGroupsRequest(");
    boolean first = true;

    sb.append("protocol_version:");
    sb.append(this.protocol_version);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorUserName:");
    if (this.requestorUserName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorUserName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestorGroupNames:");
    if (this.requestorGroupNames == null) {
      sb.append("null");
    } else {
      sb.append(this.requestorGroupNames);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roleName:");
    if (this.roleName == null) {
      sb.append("null");
    } else {
      sb.append(this.roleName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("groups:");
    if (this.groups == null) {
      sb.append("null");
    } else {
      sb.append(this.groups);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetProtocol_version()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' is unset! Struct:" + toString());
    }

    if (!isSetRequestorUserName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestorUserName' is unset! Struct:" + toString());
    }

    if (!isSetRequestorGroupNames()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'requestorGroupNames' is unset! Struct:" + toString());
    }

    if (!isSetRoleName()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'roleName' is unset! Struct:" + toString());
    }

    if (!isSetGroups()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'groups' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TAlterSentryRoleAddGroupsRequestStandardSchemeFactory implements SchemeFactory {
    public TAlterSentryRoleAddGroupsRequestStandardScheme getScheme() {
      return new TAlterSentryRoleAddGroupsRequestStandardScheme();
    }
  }

  private static class TAlterSentryRoleAddGroupsRequestStandardScheme extends StandardScheme<TAlterSentryRoleAddGroupsRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TAlterSentryRoleAddGroupsRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = iprot.readI32();
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REQUESTOR_USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestorUserName = iprot.readString();
              struct.setRequestorUserNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQUESTOR_GROUP_NAMES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set32 = iprot.readSetBegin();
                struct.requestorGroupNames = new HashSet<String>(2*_set32.size);
                for (int _i33 = 0; _i33 < _set32.size; ++_i33)
                {
                  String _elem34; // required
                  _elem34 = iprot.readString();
                  struct.requestorGroupNames.add(_elem34);
                }
                iprot.readSetEnd();
              }
              struct.setRequestorGroupNamesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ROLE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.roleName = iprot.readString();
              struct.setRoleNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // GROUPS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set35 = iprot.readSetBegin();
                struct.groups = new HashSet<TSentryGroup>(2*_set35.size);
                for (int _i36 = 0; _i36 < _set35.size; ++_i36)
                {
                  TSentryGroup _elem37; // required
                  _elem37 = new TSentryGroup();
                  _elem37.read(iprot);
                  struct.groups.add(_elem37);
                }
                iprot.readSetEnd();
              }
              struct.setGroupsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TAlterSentryRoleAddGroupsRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
      oprot.writeI32(struct.protocol_version);
      oprot.writeFieldEnd();
      if (struct.requestorUserName != null) {
        oprot.writeFieldBegin(REQUESTOR_USER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestorUserName);
        oprot.writeFieldEnd();
      }
      if (struct.requestorGroupNames != null) {
        oprot.writeFieldBegin(REQUESTOR_GROUP_NAMES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, struct.requestorGroupNames.size()));
          for (String _iter38 : struct.requestorGroupNames)
          {
            oprot.writeString(_iter38);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.roleName != null) {
        oprot.writeFieldBegin(ROLE_NAME_FIELD_DESC);
        oprot.writeString(struct.roleName);
        oprot.writeFieldEnd();
      }
      if (struct.groups != null) {
        oprot.writeFieldBegin(GROUPS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, struct.groups.size()));
          for (TSentryGroup _iter39 : struct.groups)
          {
            _iter39.write(oprot);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TAlterSentryRoleAddGroupsRequestTupleSchemeFactory implements SchemeFactory {
    public TAlterSentryRoleAddGroupsRequestTupleScheme getScheme() {
      return new TAlterSentryRoleAddGroupsRequestTupleScheme();
    }
  }

  private static class TAlterSentryRoleAddGroupsRequestTupleScheme extends TupleScheme<TAlterSentryRoleAddGroupsRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TAlterSentryRoleAddGroupsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version);
      oprot.writeString(struct.requestorUserName);
      {
        oprot.writeI32(struct.requestorGroupNames.size());
        for (String _iter40 : struct.requestorGroupNames)
        {
          oprot.writeString(_iter40);
        }
      }
      oprot.writeString(struct.roleName);
      {
        oprot.writeI32(struct.groups.size());
        for (TSentryGroup _iter41 : struct.groups)
        {
          _iter41.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TAlterSentryRoleAddGroupsRequest struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = iprot.readI32();
      struct.setProtocol_versionIsSet(true);
      struct.requestorUserName = iprot.readString();
      struct.setRequestorUserNameIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set42 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.requestorGroupNames = new HashSet<String>(2*_set42.size);
        for (int _i43 = 0; _i43 < _set42.size; ++_i43)
        {
          String _elem44; // required
          _elem44 = iprot.readString();
          struct.requestorGroupNames.add(_elem44);
        }
      }
      struct.setRequestorGroupNamesIsSet(true);
      struct.roleName = iprot.readString();
      struct.setRoleNameIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set45 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.groups = new HashSet<TSentryGroup>(2*_set45.size);
        for (int _i46 = 0; _i46 < _set45.size; ++_i46)
        {
          TSentryGroup _elem47; // required
          _elem47 = new TSentryGroup();
          _elem47.read(iprot);
          struct.groups.add(_elem47);
        }
      }
      struct.setGroupsIsSet(true);
    }
  }

}

