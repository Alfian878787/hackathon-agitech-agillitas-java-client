package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NovoCartaoPortadorContato
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class NovoCartaoPortadorContato {
  @SerializedName("email")
  private String email = null;

  @SerializedName("telResidencial")
  private String telResidencial = null;

  @SerializedName("telCelular")
  private String telCelular = null;

  public NovoCartaoPortadorContato email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Endereço  de email do portador do cartão.
   * @return email
  **/
  @ApiModelProperty(example = "jose.silva@email.com", value = "Endereço  de email do portador do cartão.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public NovoCartaoPortadorContato telResidencial(String telResidencial) {
    this.telResidencial = telResidencial;
    return this;
  }

   /**
   * Telefone Residencial no formato: 01199999999. Não deve conter números sequenciais ou repetidos
   * @return telResidencial
  **/
  @ApiModelProperty(example = "01130987600", value = "Telefone Residencial no formato: 01199999999. Não deve conter números sequenciais ou repetidos")
  public String getTelResidencial() {
    return telResidencial;
  }

  public void setTelResidencial(String telResidencial) {
    this.telResidencial = telResidencial;
  }

  public NovoCartaoPortadorContato telCelular(String telCelular) {
    this.telCelular = telCelular;
    return this;
  }

   /**
   * Telefone Celular no formato: 011999999999. Não deve conter números sequenciais ou repetidos
   * @return telCelular
  **/
  @ApiModelProperty(example = "011998767654", value = "Telefone Celular no formato: 011999999999. Não deve conter números sequenciais ou repetidos")
  public String getTelCelular() {
    return telCelular;
  }

  public void setTelCelular(String telCelular) {
    this.telCelular = telCelular;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortadorContato novoCartaoPortadorContato = (NovoCartaoPortadorContato) o;
    return Objects.equals(this.email, novoCartaoPortadorContato.email) &&
        Objects.equals(this.telResidencial, novoCartaoPortadorContato.telResidencial) &&
        Objects.equals(this.telCelular, novoCartaoPortadorContato.telCelular);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, telResidencial, telCelular);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortadorContato {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    telResidencial: ").append(toIndentedString(telResidencial)).append("\n");
    sb.append("    telCelular: ").append(toIndentedString(telCelular)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

