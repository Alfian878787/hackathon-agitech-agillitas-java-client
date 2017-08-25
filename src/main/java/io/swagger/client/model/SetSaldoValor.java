package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SetSaldoValor
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class SetSaldoValor {
  @SerializedName("valor")
  private Double valor = null;

  public SetSaldoValor valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor monetário  a ser creditado (valor positivo) ou debitado (valor negativo) na conta do cartão.
   * @return valor
  **/
  @ApiModelProperty(example = "-99.9", value = "Valor monetário  a ser creditado (valor positivo) ou debitado (valor negativo) na conta do cartão.")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetSaldoValor setSaldoValor = (SetSaldoValor) o;
    return Objects.equals(this.valor, setSaldoValor.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetSaldoValor {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

