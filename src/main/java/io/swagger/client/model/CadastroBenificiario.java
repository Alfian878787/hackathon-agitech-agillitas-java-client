package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CadastroBenificiario
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class CadastroBenificiario {
  @SerializedName("idCartao")
  private String idCartao = null;

  @SerializedName("idCartaoDestino")
  private String idCartaoDestino = null;

  @SerializedName("nome")
  private String nome = null;

  @SerializedName("cpf")
  private String cpf = null;

  public CadastroBenificiario idCartao(String idCartao) {
    this.idCartao = idCartao;
    return this;
  }

   /**
   * número identificador referente ao proxy do cartão origem de transferência.
   * @return idCartao
  **/
  @ApiModelProperty(example = "123123123", value = "número identificador referente ao proxy do cartão origem de transferência.")
  public String getIdCartao() {
    return idCartao;
  }

  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  public CadastroBenificiario idCartaoDestino(String idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
    return this;
  }

   /**
   * número identificador referente ao proxy do cartão destino de transferência.
   * @return idCartaoDestino
  **/
  @ApiModelProperty(example = "1231231231", value = "número identificador referente ao proxy do cartão destino de transferência.")
  public String getIdCartaoDestino() {
    return idCartaoDestino;
  }

  public void setIdCartaoDestino(String idCartaoDestino) {
    this.idCartaoDestino = idCartaoDestino;
  }

  public CadastroBenificiario nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome completo do beneficiário da transferência.
   * @return nome
  **/
  @ApiModelProperty(example = "Maria da SIlva", value = "Nome completo do beneficiário da transferência.")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public CadastroBenificiario cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Numero do cadastro de pessoas física do beneficiário da transferência.  Não deve conter pontos ou hífen.
   * @return cpf
  **/
  @ApiModelProperty(example = "12312312312", value = "Numero do cadastro de pessoas física do beneficiário da transferência.  Não deve conter pontos ou hífen.")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CadastroBenificiario cadastroBenificiario = (CadastroBenificiario) o;
    return Objects.equals(this.idCartao, cadastroBenificiario.idCartao) &&
        Objects.equals(this.idCartaoDestino, cadastroBenificiario.idCartaoDestino) &&
        Objects.equals(this.nome, cadastroBenificiario.nome) &&
        Objects.equals(this.cpf, cadastroBenificiario.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCartao, idCartaoDestino, nome, cpf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadastroBenificiario {\n");
    
    sb.append("    idCartao: ").append(toIndentedString(idCartao)).append("\n");
    sb.append("    idCartaoDestino: ").append(toIndentedString(idCartaoDestino)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

