package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SetPagamento
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class SetPagamento {
  @SerializedName("idCartao")
  private String idCartao = null;

  @SerializedName("senha")
  private String senha = null;

  @SerializedName("codigoBarras")
  private String codigoBarras = null;

  public SetPagamento idCartao(String idCartao) {
    this.idCartao = idCartao;
    return this;
  }

   /**
   * número identificador referente ao proxy do cartão.
   * @return idCartao
  **/
  @ApiModelProperty(example = "1234555234", value = "número identificador referente ao proxy do cartão.")
  public String getIdCartao() {
    return idCartao;
  }

  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  public SetPagamento senha(String senha) {
    this.senha = senha;
    return this;
  }

   /**
   * Senha do cartão.
   * @return senha
  **/
  @ApiModelProperty(example = "123123", value = "Senha do cartão.")
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public SetPagamento codigoBarras(String codigoBarras) {
    this.codigoBarras = codigoBarras;
    return this;
  }

   /**
   * Código de pagamento identificado no documento (boleto).
   * @return codigoBarras
  **/
  @ApiModelProperty(example = "123312 3123123 123 123 123123", value = "Código de pagamento identificado no documento (boleto).")
  public String getCodigoBarras() {
    return codigoBarras;
  }

  public void setCodigoBarras(String codigoBarras) {
    this.codigoBarras = codigoBarras;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetPagamento setPagamento = (SetPagamento) o;
    return Objects.equals(this.idCartao, setPagamento.idCartao) &&
        Objects.equals(this.senha, setPagamento.senha) &&
        Objects.equals(this.codigoBarras, setPagamento.codigoBarras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, senha, codigoBarras);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetPagamento {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    codigoBarras: ").append(toIndentedString(codigoBarras)).append("\n");
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

