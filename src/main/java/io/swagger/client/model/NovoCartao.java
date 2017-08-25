package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NovoCartaoPortador;

/**
 * NovoCartao
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class NovoCartao {
  @SerializedName("idCartao")
  private String idCartao = null;

  @SerializedName("valor")
  private Double valor = null;

  @SerializedName("contrasenha")
  private String contrasenha = null;

  @SerializedName("portador")
  private NovoCartaoPortador portador = null;

  public NovoCartao idCartao(String idCartao) {
    this.idCartao = idCartao;
    return this;
  }

   /**
   * Número identificador referente ao proxy do cartão.
   * @return idCartao
  **/
  @ApiModelProperty(example = "3321876998", value = "Número identificador referente ao proxy do cartão.")
  public String getIdCartao() {
    return idCartao;
  }

  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  public NovoCartao valor(Double valor) {
    this.valor = valor;
    return this;
  }

   /**
   * Valor monetário  a ser creditado na conta do cartão.
   * @return valor
  **/
  @ApiModelProperty(example = "80.5", value = "Valor monetário  a ser creditado na conta do cartão.")
  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }

  public NovoCartao contrasenha(String contrasenha) {
    this.contrasenha = contrasenha;
    return this;
  }

   /**
   * Contrassenha do cartão
   * @return contrasenha
  **/
  @ApiModelProperty(example = "12345", value = "Contrassenha do cartão")
  public String getContrasenha() {
    return contrasenha;
  }

  public void setContrasenha(String contrasenha) {
    this.contrasenha = contrasenha;
  }

  public NovoCartao portador(NovoCartaoPortador portador) {
    this.portador = portador;
    return this;
  }

   /**
   * Get portador
   * @return portador
  **/
  @ApiModelProperty(value = "")
  public NovoCartaoPortador getPortador() {
    return portador;
  }

  public void setPortador(NovoCartaoPortador portador) {
    this.portador = portador;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartao novoCartao = (NovoCartao) o;
    return Objects.equals(this.idCartao, novoCartao.idCartao) &&
        Objects.equals(this.valor, novoCartao.valor) &&
        Objects.equals(this.contrasenha, novoCartao.contrasenha) &&
        Objects.equals(this.portador, novoCartao.portador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, valor, contrasenha, portador);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartao {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    contrasenha: ").append(toIndentedString(contrasenha)).append("\n");
    sb.append("    portador: ").append(toIndentedString(portador)).append("\n");
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

