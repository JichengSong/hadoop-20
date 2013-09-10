/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hadoop.corona;

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

public class ActualPoolInfoResponse implements org.apache.thrift.TBase<ActualPoolInfoResponse, ActualPoolInfoResponse._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ActualPoolInfoResponse");

  private static final org.apache.thrift.protocol.TField POOL_INFO_STRING_FIELD_DESC = new org.apache.thrift.protocol.TField("poolInfoString", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField WHITELIST_FIELD_DESC = new org.apache.thrift.protocol.TField("whitelist", org.apache.thrift.protocol.TType.STRING, (short)2);

  public PoolInfoStrings poolInfoString; // required
  public String whitelist; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    POOL_INFO_STRING((short)1, "poolInfoString"),
    WHITELIST((short)2, "whitelist");

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
        case 1: // POOL_INFO_STRING
          return POOL_INFO_STRING;
        case 2: // WHITELIST
          return WHITELIST;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.POOL_INFO_STRING, new org.apache.thrift.meta_data.FieldMetaData("poolInfoString", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PoolInfoStrings.class)));
    tmpMap.put(_Fields.WHITELIST, new org.apache.thrift.meta_data.FieldMetaData("whitelist", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ActualPoolInfoResponse.class, metaDataMap);
  }

  public ActualPoolInfoResponse() {
  }

  public ActualPoolInfoResponse(
    PoolInfoStrings poolInfoString,
    String whitelist)
  {
    this();
    this.poolInfoString = poolInfoString;
    this.whitelist = whitelist;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ActualPoolInfoResponse(ActualPoolInfoResponse other) {
    if (other.isSetPoolInfoString()) {
      this.poolInfoString = new PoolInfoStrings(other.poolInfoString);
    }
    if (other.isSetWhitelist()) {
      this.whitelist = other.whitelist;
    }
  }

  public ActualPoolInfoResponse deepCopy() {
    return new ActualPoolInfoResponse(this);
  }

  @Override
  public void clear() {
    this.poolInfoString = null;
    this.whitelist = null;
  }

  public PoolInfoStrings getPoolInfoString() {
    return this.poolInfoString;
  }

  public ActualPoolInfoResponse setPoolInfoString(PoolInfoStrings poolInfoString) {
    this.poolInfoString = poolInfoString;
    return this;
  }

  public void unsetPoolInfoString() {
    this.poolInfoString = null;
  }

  /** Returns true if field poolInfoString is set (has been assigned a value) and false otherwise */
  public boolean isSetPoolInfoString() {
    return this.poolInfoString != null;
  }

  public void setPoolInfoStringIsSet(boolean value) {
    if (!value) {
      this.poolInfoString = null;
    }
  }

  public String getWhitelist() {
    return this.whitelist;
  }

  public ActualPoolInfoResponse setWhitelist(String whitelist) {
    this.whitelist = whitelist;
    return this;
  }

  public void unsetWhitelist() {
    this.whitelist = null;
  }

  /** Returns true if field whitelist is set (has been assigned a value) and false otherwise */
  public boolean isSetWhitelist() {
    return this.whitelist != null;
  }

  public void setWhitelistIsSet(boolean value) {
    if (!value) {
      this.whitelist = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case POOL_INFO_STRING:
      if (value == null) {
        unsetPoolInfoString();
      } else {
        setPoolInfoString((PoolInfoStrings)value);
      }
      break;

    case WHITELIST:
      if (value == null) {
        unsetWhitelist();
      } else {
        setWhitelist((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case POOL_INFO_STRING:
      return getPoolInfoString();

    case WHITELIST:
      return getWhitelist();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case POOL_INFO_STRING:
      return isSetPoolInfoString();
    case WHITELIST:
      return isSetWhitelist();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ActualPoolInfoResponse)
      return this.equals((ActualPoolInfoResponse)that);
    return false;
  }

  public boolean equals(ActualPoolInfoResponse that) {
    if (that == null)
      return false;

    boolean this_present_poolInfoString = true && this.isSetPoolInfoString();
    boolean that_present_poolInfoString = true && that.isSetPoolInfoString();
    if (this_present_poolInfoString || that_present_poolInfoString) {
      if (!(this_present_poolInfoString && that_present_poolInfoString))
        return false;
      if (!this.poolInfoString.equals(that.poolInfoString))
        return false;
    }

    boolean this_present_whitelist = true && this.isSetWhitelist();
    boolean that_present_whitelist = true && that.isSetWhitelist();
    if (this_present_whitelist || that_present_whitelist) {
      if (!(this_present_whitelist && that_present_whitelist))
        return false;
      if (!this.whitelist.equals(that.whitelist))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ActualPoolInfoResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ActualPoolInfoResponse typedOther = (ActualPoolInfoResponse)other;

    lastComparison = Boolean.valueOf(isSetPoolInfoString()).compareTo(typedOther.isSetPoolInfoString());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoolInfoString()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.poolInfoString, typedOther.poolInfoString);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetWhitelist()).compareTo(typedOther.isSetWhitelist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetWhitelist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.whitelist, typedOther.whitelist);
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
    org.apache.thrift.protocol.TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == org.apache.thrift.protocol.TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // POOL_INFO_STRING
          if (field.type == org.apache.thrift.protocol.TType.STRUCT) {
            this.poolInfoString = new PoolInfoStrings();
            this.poolInfoString.read(iprot);
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // WHITELIST
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.whitelist = iprot.readString();
          } else { 
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.poolInfoString != null) {
      oprot.writeFieldBegin(POOL_INFO_STRING_FIELD_DESC);
      this.poolInfoString.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.whitelist != null) {
      oprot.writeFieldBegin(WHITELIST_FIELD_DESC);
      oprot.writeString(this.whitelist);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ActualPoolInfoResponse(");
    boolean first = true;

    sb.append("poolInfoString:");
    if (this.poolInfoString == null) {
      sb.append("null");
    } else {
      sb.append(this.poolInfoString);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("whitelist:");
    if (this.whitelist == null) {
      sb.append("null");
    } else {
      sb.append(this.whitelist);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (poolInfoString == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'poolInfoString' was not present! Struct: " + toString());
    }
    if (whitelist == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'whitelist' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

}
