package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.CadastroBenificiario;

/**
 * TransferenciaCadastroBenificiario
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class TransferenciaCadastroBenificiario {
  @SerializedName("beneficiario")
  private CadastroBenificiario beneficiario = null;

  public TransferenciaCadastroBenificiario beneficiario(CadastroBenificiario beneficiario) {
    this.beneficiario = beneficiario;
    return this;
  }

   /**
   * Get beneficiario
   * @return beneficiario
  **/
  @ApiModelProperty(value = "")
  public CadastroBenificiario getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(CadastroBenificiario beneficiario) {
    this.beneficiario = beneficiario;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferenciaCadastroBenificiario transferenciaCadastroBenificiario = (TransferenciaCadastroBenificiario) o;
    return Objects.equals(this.beneficiario, transferenciaCadastroBenificiario.beneficiario);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiario);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaCadastroBenificiario {\n");
    
    sb.append("    beneficiario: ").append(toIndentedString(beneficiario)).append("\n");
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

