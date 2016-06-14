/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.openflamingo.remote.thrift.thriftfs.api;

import org.apache.commons.lang.builder.HashCodeBuilder;
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

public class ThriftDelegationToken implements org.apache.thrift.TBase<ThriftDelegationToken, ThriftDelegationToken._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftDelegationToken");

  private static final org.apache.thrift.protocol.TField DELEGATION_TOKEN_BYTES_FIELD_DESC = new org.apache.thrift.protocol.TField("delegationTokenBytes", org.apache.thrift.protocol.TType.STRING, (short)1);

  public ByteBuffer delegationTokenBytes;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DELEGATION_TOKEN_BYTES((short)1, "delegationTokenBytes");

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
        case 1: // DELEGATION_TOKEN_BYTES
          return DELEGATION_TOKEN_BYTES;
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
    tmpMap.put(_Fields.DELEGATION_TOKEN_BYTES, new org.apache.thrift.meta_data.FieldMetaData("delegationTokenBytes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING        , true)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftDelegationToken.class, metaDataMap);
  }

  public ThriftDelegationToken() {
  }

  public ThriftDelegationToken(
    ByteBuffer delegationTokenBytes)
  {
    this();
    this.delegationTokenBytes = delegationTokenBytes;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftDelegationToken(ThriftDelegationToken other) {
    if (other.isSetDelegationTokenBytes()) {
      this.delegationTokenBytes = org.apache.thrift.TBaseHelper.copyBinary(other.delegationTokenBytes);
;
    }
  }

  public ThriftDelegationToken deepCopy() {
    return new ThriftDelegationToken(this);
  }

  @Override
  public void clear() {
    this.delegationTokenBytes = null;
  }

  public byte[] getDelegationTokenBytes() {
    setDelegationTokenBytes(org.apache.thrift.TBaseHelper.rightSize(delegationTokenBytes));
    return delegationTokenBytes == null ? null : delegationTokenBytes.array();
  }

  public ByteBuffer bufferForDelegationTokenBytes() {
    return delegationTokenBytes;
  }

  public ThriftDelegationToken setDelegationTokenBytes(byte[] delegationTokenBytes) {
    setDelegationTokenBytes(delegationTokenBytes == null ? (ByteBuffer)null : ByteBuffer.wrap(delegationTokenBytes));
    return this;
  }

  public ThriftDelegationToken setDelegationTokenBytes(ByteBuffer delegationTokenBytes) {
    this.delegationTokenBytes = delegationTokenBytes;
    return this;
  }

  public void unsetDelegationTokenBytes() {
    this.delegationTokenBytes = null;
  }

  /** Returns true if field delegationTokenBytes is set (has been assigned a value) and false otherwise */
  public boolean isSetDelegationTokenBytes() {
    return this.delegationTokenBytes != null;
  }

  public void setDelegationTokenBytesIsSet(boolean value) {
    if (!value) {
      this.delegationTokenBytes = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DELEGATION_TOKEN_BYTES:
      if (value == null) {
        unsetDelegationTokenBytes();
      } else {
        setDelegationTokenBytes((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DELEGATION_TOKEN_BYTES:
      return getDelegationTokenBytes();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DELEGATION_TOKEN_BYTES:
      return isSetDelegationTokenBytes();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftDelegationToken)
      return this.equals((ThriftDelegationToken)that);
    return false;
  }

  public boolean equals(ThriftDelegationToken that) {
    if (that == null)
      return false;

    boolean this_present_delegationTokenBytes = true && this.isSetDelegationTokenBytes();
    boolean that_present_delegationTokenBytes = true && that.isSetDelegationTokenBytes();
    if (this_present_delegationTokenBytes || that_present_delegationTokenBytes) {
      if (!(this_present_delegationTokenBytes && that_present_delegationTokenBytes))
        return false;
      if (!this.delegationTokenBytes.equals(that.delegationTokenBytes))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_delegationTokenBytes = true && (isSetDelegationTokenBytes());
    builder.append(present_delegationTokenBytes);
    if (present_delegationTokenBytes)
      builder.append(delegationTokenBytes);

    return builder.toHashCode();
  }

  public int compareTo(ThriftDelegationToken other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ThriftDelegationToken typedOther = (ThriftDelegationToken)other;

    lastComparison = Boolean.valueOf(isSetDelegationTokenBytes()).compareTo(typedOther.isSetDelegationTokenBytes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDelegationTokenBytes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.delegationTokenBytes, typedOther.delegationTokenBytes);
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
        case 1: // DELEGATION_TOKEN_BYTES
          if (field.type == org.apache.thrift.protocol.TType.STRING) {
            this.delegationTokenBytes = iprot.readBinary();
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
    if (this.delegationTokenBytes != null) {
      oprot.writeFieldBegin(DELEGATION_TOKEN_BYTES_FIELD_DESC);
      oprot.writeBinary(this.delegationTokenBytes);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftDelegationToken(");
    boolean first = true;

    sb.append("delegationTokenBytes:");
    if (this.delegationTokenBytes == null) {
      sb.append("null");
    } else {
      org.apache.thrift.TBaseHelper.toString(this.delegationTokenBytes, sb);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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

