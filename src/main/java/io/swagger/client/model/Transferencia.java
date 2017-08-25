package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SetTransferencia;

/**
 * Transferencia
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class Transferencia {
  @SerializedName("transferencia")
  private SetTransferencia transferencia = null;

  public Transferencia transferencia(SetTransferencia transferencia) {
    this.transferencia = transferencia;
    return this;
  }

   /**
   * Get transferencia
   * @return transferencia
  **/
  @ApiModelProperty(value = "")
  public SetTransferencia getTransferencia() {
    return transferencia;
  }

  public void setTransferencia(SetTransferencia transferencia) {
    this.transferencia = transferencia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transferencia transferencia = (Transferencia) o;
    return Objects.equals(this.transferencia, transferencia.transferencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferencia);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transferencia {\n");
    
    sb.append("    transferencia: ").append(toIndentedString(transferencia)).append("\n");
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

