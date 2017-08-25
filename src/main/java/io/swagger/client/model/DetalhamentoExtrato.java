package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DetalhamentoExtrato
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class DetalhamentoExtrato {
  @SerializedName("dataHora")
  private String dataHora = null;

  @SerializedName("estabelecimento")
  private String estabelecimento = null;

  @SerializedName("tipo")
  private String tipo = null;

  @SerializedName("valor")
  private Double valor = null;

  public DetalhamentoExtrato dataHora(String dataHora) {
    this.dataHora = dataHora;
    return this;
  }

   /**
   * Data e hora da transação do cartão. (DD/MM/YYYY HH:mm:SS)
   * @return dataHora
  **/
  @ApiModelProperty(example = "12/12/2012 12:12:12", value = "Data e hora da transação do cartão. (DD/MM/YYYY HH:mm:SS)")
  public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public DetalhamentoExtrato estabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
    return this;
  }

   /**
   * Estabelecimento onde ocorreu a transação do cartão.
   * @return estabelecimento
  **/
  @ApiModelProperty(example = "Super Mercado do João", value = "Estabelecimento onde ocorreu a transação do cartão.")
  public String getEstabelecimento() {
    return estabelecimento;
  }

  public void setEstabelecimento(String estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  public DetalhamentoExtrato tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

   /**
   * Tipo da transação do cartão.
   * @return tipo
  **/
  @ApiModelProperty(example = "CARGA", value = "Tipo da transação do cartão.")
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public DetalhamentoExtrato valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor monetário  da transação do cartão.
   * @return valor
  **/
  @ApiModelProperty(example = "100.1", value = "Valor monetário  da transação do cartão.")
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
    DetalhamentoExtrato detalhamentoExtrato = (DetalhamentoExtrato) o;
    return Objects.equals(this.dataHora, detalhamentoExtrato.dataHora) &&
        Objects.equals(this.estabelecimento, detalhamentoExtrato.estabelecimento) &&
        Objects.equals(this.tipo, detalhamentoExtrato.tipo) &&
        Objects.equals(this.valor, detalhamentoExtrato.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataHora, estabelecimento, tipo, valor);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhamentoExtrato {\n");
    
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
    sb.append("    estabelecimento: ").append(toIndentedString(estabelecimento)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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

