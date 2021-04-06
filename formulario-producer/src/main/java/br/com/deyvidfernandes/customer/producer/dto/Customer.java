/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package br.com.deyvidfernandes.customer.producer.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3481409119513646852L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"br.com.deyvidfernandes.customer.producer.dto\",\"fields\":[{\"name\":\"nome\",\"type\":\"string\"},{\"name\":\"idade\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Customer> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Customer to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Customer from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Customer instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence nome;
   private java.lang.Integer idade;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param nome The new value for nome
   * @param idade The new value for idade
   */
  public Customer(java.lang.CharSequence nome, java.lang.Integer idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nome;
    case 1: return idade;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nome = (java.lang.CharSequence)value$; break;
    case 1: idade = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.CharSequence getNome() {
    return nome;
  }


  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.CharSequence value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'idade' field.
   * @return The value of the 'idade' field.
   */
  public java.lang.Integer getIdade() {
    return idade;
  }


  /**
   * Sets the value of the 'idade' field.
   * @param value the value to set.
   */
  public void setIdade(java.lang.Integer value) {
    this.idade = value;
  }

  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static br.com.deyvidfernandes.customer.producer.dto.Customer.Builder newBuilder() {
    return new br.com.deyvidfernandes.customer.producer.dto.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static br.com.deyvidfernandes.customer.producer.dto.Customer.Builder newBuilder(br.com.deyvidfernandes.customer.producer.dto.Customer.Builder other) {
    if (other == null) {
      return new br.com.deyvidfernandes.customer.producer.dto.Customer.Builder();
    } else {
      return new br.com.deyvidfernandes.customer.producer.dto.Customer.Builder(other);
    }
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static br.com.deyvidfernandes.customer.producer.dto.Customer.Builder newBuilder(br.com.deyvidfernandes.customer.producer.dto.Customer other) {
    if (other == null) {
      return new br.com.deyvidfernandes.customer.producer.dto.Customer.Builder();
    } else {
      return new br.com.deyvidfernandes.customer.producer.dto.Customer.Builder(other);
    }
  }

  /**
   * RecordBuilder for Customer instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    private java.lang.CharSequence nome;
    private java.lang.Integer idade;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(br.com.deyvidfernandes.customer.producer.dto.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.idade)) {
        this.idade = data().deepCopy(fields()[1].schema(), other.idade);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(br.com.deyvidfernandes.customer.producer.dto.Customer other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.idade)) {
        this.idade = data().deepCopy(fields()[1].schema(), other.idade);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.CharSequence getNome() {
      return nome;
    }


    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public br.com.deyvidfernandes.customer.producer.dto.Customer.Builder setNome(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.nome = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public br.com.deyvidfernandes.customer.producer.dto.Customer.Builder clearNome() {
      nome = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'idade' field.
      * @return The value.
      */
    public java.lang.Integer getIdade() {
      return idade;
    }


    /**
      * Sets the value of the 'idade' field.
      * @param value The value of 'idade'.
      * @return This builder.
      */
    public br.com.deyvidfernandes.customer.producer.dto.Customer.Builder setIdade(java.lang.Integer value) {
      validate(fields()[1], value);
      this.idade = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'idade' field has been set.
      * @return True if the 'idade' field has been set, false otherwise.
      */
    public boolean hasIdade() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'idade' field.
      * @return This builder.
      */
    public br.com.deyvidfernandes.customer.producer.dto.Customer.Builder clearIdade() {
      idade = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.nome = fieldSetFlags()[0] ? this.nome : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.idade = fieldSetFlags()[1] ? this.idade : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.nome);

    if (this.idade == null) {
      out.writeIndex(1);
      out.writeNull();
    } else {
      out.writeIndex(0);
      out.writeInt(this.idade);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);

      if (in.readIndex() != 0) {
        in.readNull();
        this.idade = null;
      } else {
        this.idade = in.readInt();
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.nome = in.readString(this.nome instanceof Utf8 ? (Utf8)this.nome : null);
          break;

        case 1:
          if (in.readIndex() != 0) {
            in.readNull();
            this.idade = null;
          } else {
            this.idade = in.readInt();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










