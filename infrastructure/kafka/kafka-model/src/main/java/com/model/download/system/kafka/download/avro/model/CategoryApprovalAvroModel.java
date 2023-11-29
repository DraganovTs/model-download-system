/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.model.download.system.kafka.download.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CategoryApprovalAvroModel extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7216706879616710421L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CategoryApprovalAvroModel\",\"namespace\":\"com.model.download.system.kafka.download.avro.model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"sagaId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"categoryId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"downloadId\",\"type\":{\"type\":\"string\",\"logicalType\":\"uuid\"}},{\"name\":\"downloadApprovalStatus\",\"type\":{\"type\":\"enum\",\"name\":\"DownloadApprovalStatus\",\"symbols\":[\"PAID\"]}},{\"name\":\"models\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Model\",\"fields\":[{\"name\":\"id\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"logicalType\":\"uuid\"},{\"name\":\"quantity\",\"type\":\"int\"}]}}},{\"name\":\"price\",\"type\":{\"type\":\"bytes\",\"logicalType\":\"decimal\",\"precision\":10,\"scale\":2}},{\"name\":\"createdAt\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();
  static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.UUIDConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.Conversions.DecimalConversion());
  }

  private static final BinaryMessageEncoder<CategoryApprovalAvroModel> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CategoryApprovalAvroModel> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CategoryApprovalAvroModel> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CategoryApprovalAvroModel> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CategoryApprovalAvroModel> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CategoryApprovalAvroModel to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CategoryApprovalAvroModel from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CategoryApprovalAvroModel instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CategoryApprovalAvroModel fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.util.UUID id;
  private java.util.UUID sagaId;
  private java.util.UUID categoryId;
  private java.util.UUID downloadId;
  private com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus downloadApprovalStatus;
  private java.util.List<com.model.download.system.kafka.download.avro.model.Model> models;
  private java.math.BigDecimal price;
  private java.time.Instant createdAt;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CategoryApprovalAvroModel() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param sagaId The new value for sagaId
   * @param categoryId The new value for categoryId
   * @param downloadId The new value for downloadId
   * @param downloadApprovalStatus The new value for downloadApprovalStatus
   * @param models The new value for models
   * @param price The new value for price
   * @param createdAt The new value for createdAt
   */
  public CategoryApprovalAvroModel(java.util.UUID id, java.util.UUID sagaId, java.util.UUID categoryId, java.util.UUID downloadId, com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus downloadApprovalStatus, java.util.List<com.model.download.system.kafka.download.avro.model.Model> models, java.math.BigDecimal price, java.time.Instant createdAt) {
    this.id = id;
    this.sagaId = sagaId;
    this.categoryId = categoryId;
    this.downloadId = downloadId;
    this.downloadApprovalStatus = downloadApprovalStatus;
    this.models = models;
    this.price = price;
    this.createdAt = createdAt.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return sagaId;
    case 2: return categoryId;
    case 3: return downloadId;
    case 4: return downloadApprovalStatus;
    case 5: return models;
    case 6: return price;
    case 7: return createdAt;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  private static final org.apache.avro.Conversion<?>[] conversions =
      new org.apache.avro.Conversion<?>[] {
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      new org.apache.avro.Conversions.UUIDConversion(),
      null,
      null,
      new org.apache.avro.Conversions.DecimalConversion(),
      new org.apache.avro.data.TimeConversions.TimestampMillisConversion(),
      null
  };

  @Override
  public org.apache.avro.Conversion<?> getConversion(int field) {
    return conversions[field];
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.util.UUID)value$; break;
    case 1: sagaId = (java.util.UUID)value$; break;
    case 2: categoryId = (java.util.UUID)value$; break;
    case 3: downloadId = (java.util.UUID)value$; break;
    case 4: downloadApprovalStatus = (com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus)value$; break;
    case 5: models = (java.util.List<com.model.download.system.kafka.download.avro.model.Model>)value$; break;
    case 6: price = (java.math.BigDecimal)value$; break;
    case 7: createdAt = (java.time.Instant)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.UUID getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.UUID value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'sagaId' field.
   * @return The value of the 'sagaId' field.
   */
  public java.util.UUID getSagaId() {
    return sagaId;
  }


  /**
   * Sets the value of the 'sagaId' field.
   * @param value the value to set.
   */
  public void setSagaId(java.util.UUID value) {
    this.sagaId = value;
  }

  /**
   * Gets the value of the 'categoryId' field.
   * @return The value of the 'categoryId' field.
   */
  public java.util.UUID getCategoryId() {
    return categoryId;
  }


  /**
   * Sets the value of the 'categoryId' field.
   * @param value the value to set.
   */
  public void setCategoryId(java.util.UUID value) {
    this.categoryId = value;
  }

  /**
   * Gets the value of the 'downloadId' field.
   * @return The value of the 'downloadId' field.
   */
  public java.util.UUID getDownloadId() {
    return downloadId;
  }


  /**
   * Sets the value of the 'downloadId' field.
   * @param value the value to set.
   */
  public void setDownloadId(java.util.UUID value) {
    this.downloadId = value;
  }

  /**
   * Gets the value of the 'downloadApprovalStatus' field.
   * @return The value of the 'downloadApprovalStatus' field.
   */
  public com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus getDownloadApprovalStatus() {
    return downloadApprovalStatus;
  }


  /**
   * Sets the value of the 'downloadApprovalStatus' field.
   * @param value the value to set.
   */
  public void setDownloadApprovalStatus(com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus value) {
    this.downloadApprovalStatus = value;
  }

  /**
   * Gets the value of the 'models' field.
   * @return The value of the 'models' field.
   */
  public java.util.List<com.model.download.system.kafka.download.avro.model.Model> getModels() {
    return models;
  }


  /**
   * Sets the value of the 'models' field.
   * @param value the value to set.
   */
  public void setModels(java.util.List<com.model.download.system.kafka.download.avro.model.Model> value) {
    this.models = value;
  }

  /**
   * Gets the value of the 'price' field.
   * @return The value of the 'price' field.
   */
  public java.math.BigDecimal getPrice() {
    return price;
  }


  /**
   * Sets the value of the 'price' field.
   * @param value the value to set.
   */
  public void setPrice(java.math.BigDecimal value) {
    this.price = value;
  }

  /**
   * Gets the value of the 'createdAt' field.
   * @return The value of the 'createdAt' field.
   */
  public java.time.Instant getCreatedAt() {
    return createdAt;
  }


  /**
   * Sets the value of the 'createdAt' field.
   * @param value the value to set.
   */
  public void setCreatedAt(java.time.Instant value) {
    this.createdAt = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
  }

  /**
   * Creates a new CategoryApprovalAvroModel RecordBuilder.
   * @return A new CategoryApprovalAvroModel RecordBuilder
   */
  public static com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder newBuilder() {
    return new com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder();
  }

  /**
   * Creates a new CategoryApprovalAvroModel RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CategoryApprovalAvroModel RecordBuilder
   */
  public static com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder newBuilder(com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder other) {
    if (other == null) {
      return new com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder();
    } else {
      return new com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder(other);
    }
  }

  /**
   * Creates a new CategoryApprovalAvroModel RecordBuilder by copying an existing CategoryApprovalAvroModel instance.
   * @param other The existing instance to copy.
   * @return A new CategoryApprovalAvroModel RecordBuilder
   */
  public static com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder newBuilder(com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel other) {
    if (other == null) {
      return new com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder();
    } else {
      return new com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder(other);
    }
  }

  /**
   * RecordBuilder for CategoryApprovalAvroModel instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CategoryApprovalAvroModel>
    implements org.apache.avro.data.RecordBuilder<CategoryApprovalAvroModel> {

    private java.util.UUID id;
    private java.util.UUID sagaId;
    private java.util.UUID categoryId;
    private java.util.UUID downloadId;
    private com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus downloadApprovalStatus;
    private java.util.List<com.model.download.system.kafka.download.avro.model.Model> models;
    private java.math.BigDecimal price;
    private java.time.Instant createdAt;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[2].schema(), other.categoryId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.downloadId)) {
        this.downloadId = data().deepCopy(fields()[3].schema(), other.downloadId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.downloadApprovalStatus)) {
        this.downloadApprovalStatus = data().deepCopy(fields()[4].schema(), other.downloadApprovalStatus);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.models)) {
        this.models = data().deepCopy(fields()[5].schema(), other.models);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.price)) {
        this.price = data().deepCopy(fields()[6].schema(), other.price);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[7].schema(), other.createdAt);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
    }

    /**
     * Creates a Builder by copying an existing CategoryApprovalAvroModel instance
     * @param other The existing instance to copy.
     */
    private Builder(com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.sagaId)) {
        this.sagaId = data().deepCopy(fields()[1].schema(), other.sagaId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.categoryId)) {
        this.categoryId = data().deepCopy(fields()[2].schema(), other.categoryId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.downloadId)) {
        this.downloadId = data().deepCopy(fields()[3].schema(), other.downloadId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.downloadApprovalStatus)) {
        this.downloadApprovalStatus = data().deepCopy(fields()[4].schema(), other.downloadApprovalStatus);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.models)) {
        this.models = data().deepCopy(fields()[5].schema(), other.models);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.price)) {
        this.price = data().deepCopy(fields()[6].schema(), other.price);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.createdAt)) {
        this.createdAt = data().deepCopy(fields()[7].schema(), other.createdAt);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.UUID getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setId(java.util.UUID value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'sagaId' field.
      * @return The value.
      */
    public java.util.UUID getSagaId() {
      return sagaId;
    }


    /**
      * Sets the value of the 'sagaId' field.
      * @param value The value of 'sagaId'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setSagaId(java.util.UUID value) {
      validate(fields()[1], value);
      this.sagaId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'sagaId' field has been set.
      * @return True if the 'sagaId' field has been set, false otherwise.
      */
    public boolean hasSagaId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'sagaId' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearSagaId() {
      sagaId = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'categoryId' field.
      * @return The value.
      */
    public java.util.UUID getCategoryId() {
      return categoryId;
    }


    /**
      * Sets the value of the 'categoryId' field.
      * @param value The value of 'categoryId'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setCategoryId(java.util.UUID value) {
      validate(fields()[2], value);
      this.categoryId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'categoryId' field has been set.
      * @return True if the 'categoryId' field has been set, false otherwise.
      */
    public boolean hasCategoryId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'categoryId' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearCategoryId() {
      categoryId = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'downloadId' field.
      * @return The value.
      */
    public java.util.UUID getDownloadId() {
      return downloadId;
    }


    /**
      * Sets the value of the 'downloadId' field.
      * @param value The value of 'downloadId'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setDownloadId(java.util.UUID value) {
      validate(fields()[3], value);
      this.downloadId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'downloadId' field has been set.
      * @return True if the 'downloadId' field has been set, false otherwise.
      */
    public boolean hasDownloadId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'downloadId' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearDownloadId() {
      downloadId = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'downloadApprovalStatus' field.
      * @return The value.
      */
    public com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus getDownloadApprovalStatus() {
      return downloadApprovalStatus;
    }


    /**
      * Sets the value of the 'downloadApprovalStatus' field.
      * @param value The value of 'downloadApprovalStatus'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setDownloadApprovalStatus(com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus value) {
      validate(fields()[4], value);
      this.downloadApprovalStatus = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'downloadApprovalStatus' field has been set.
      * @return True if the 'downloadApprovalStatus' field has been set, false otherwise.
      */
    public boolean hasDownloadApprovalStatus() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'downloadApprovalStatus' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearDownloadApprovalStatus() {
      downloadApprovalStatus = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'models' field.
      * @return The value.
      */
    public java.util.List<com.model.download.system.kafka.download.avro.model.Model> getModels() {
      return models;
    }


    /**
      * Sets the value of the 'models' field.
      * @param value The value of 'models'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setModels(java.util.List<com.model.download.system.kafka.download.avro.model.Model> value) {
      validate(fields()[5], value);
      this.models = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'models' field has been set.
      * @return True if the 'models' field has been set, false otherwise.
      */
    public boolean hasModels() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'models' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearModels() {
      models = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'price' field.
      * @return The value.
      */
    public java.math.BigDecimal getPrice() {
      return price;
    }


    /**
      * Sets the value of the 'price' field.
      * @param value The value of 'price'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setPrice(java.math.BigDecimal value) {
      validate(fields()[6], value);
      this.price = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'price' field has been set.
      * @return True if the 'price' field has been set, false otherwise.
      */
    public boolean hasPrice() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'price' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearPrice() {
      price = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'createdAt' field.
      * @return The value.
      */
    public java.time.Instant getCreatedAt() {
      return createdAt;
    }


    /**
      * Sets the value of the 'createdAt' field.
      * @param value The value of 'createdAt'.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder setCreatedAt(java.time.Instant value) {
      validate(fields()[7], value);
      this.createdAt = value.truncatedTo(java.time.temporal.ChronoUnit.MILLIS);
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'createdAt' field has been set.
      * @return True if the 'createdAt' field has been set, false otherwise.
      */
    public boolean hasCreatedAt() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'createdAt' field.
      * @return This builder.
      */
    public com.model.download.system.kafka.download.avro.model.CategoryApprovalAvroModel.Builder clearCreatedAt() {
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CategoryApprovalAvroModel build() {
      try {
        CategoryApprovalAvroModel record = new CategoryApprovalAvroModel();
        record.id = fieldSetFlags()[0] ? this.id : (java.util.UUID) defaultValue(fields()[0]);
        record.sagaId = fieldSetFlags()[1] ? this.sagaId : (java.util.UUID) defaultValue(fields()[1]);
        record.categoryId = fieldSetFlags()[2] ? this.categoryId : (java.util.UUID) defaultValue(fields()[2]);
        record.downloadId = fieldSetFlags()[3] ? this.downloadId : (java.util.UUID) defaultValue(fields()[3]);
        record.downloadApprovalStatus = fieldSetFlags()[4] ? this.downloadApprovalStatus : (com.model.download.system.kafka.download.avro.model.DownloadApprovalStatus) defaultValue(fields()[4]);
        record.models = fieldSetFlags()[5] ? this.models : (java.util.List<com.model.download.system.kafka.download.avro.model.Model>) defaultValue(fields()[5]);
        record.price = fieldSetFlags()[6] ? this.price : (java.math.BigDecimal) defaultValue(fields()[6]);
        record.createdAt = fieldSetFlags()[7] ? this.createdAt : (java.time.Instant) defaultValue(fields()[7]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CategoryApprovalAvroModel>
    WRITER$ = (org.apache.avro.io.DatumWriter<CategoryApprovalAvroModel>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CategoryApprovalAvroModel>
    READER$ = (org.apache.avro.io.DatumReader<CategoryApprovalAvroModel>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









