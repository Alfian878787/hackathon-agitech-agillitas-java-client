package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * NovoCartaoPortadorEndereco
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class NovoCartaoPortadorEndereco {
  @SerializedName("logradouro")
  private String logradouro = null;

  @SerializedName("complemento")
  private String complemento = null;

  @SerializedName("cidade")
  private String cidade = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("pais")
  private String pais = null;

  @SerializedName("codigoPostal")
  private String codigoPostal = null;

  public NovoCartaoPortadorEndereco logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

   /**
   * Nome Endereço  do portador do cartão.
   * @return logradouro
  **/
  @ApiModelProperty(example = "Av. das Nações Unidas", value = "Nome Endereço  do portador do cartão.")
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public NovoCartaoPortadorEndereco complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

   /**
   * Complemento do logradouro do portador do cartão.
   * @return complemento
  **/
  @ApiModelProperty(example = "Número 8501", value = "Complemento do logradouro do portador do cartão.")
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public NovoCartaoPortadorEndereco cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

   /**
   * Nome cidade do portador do cartão.
   * @return cidade
  **/
  @ApiModelProperty(example = "Pinheiros", value = "Nome cidade do portador do cartão.")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public NovoCartaoPortadorEndereco estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Sigla do estado do portador do cartão.
   * @return estado
  **/
  @ApiModelProperty(example = "SP", value = "Sigla do estado do portador do cartão.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public NovoCartaoPortadorEndereco pais(String pais) {
    this.pais = pais;
    return this;
  }

   /**
   * País do portador = \"Brasil\"
   * @return pais
  **/
  @ApiModelProperty(example = "Brasil", value = "País do portador = \"Brasil\"")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public NovoCartaoPortadorEndereco codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

   /**
   * Código de endereçamento postal do portador do cartão (CEP). Não deve conter pontos ou hífen.
   * @return codigoPostal
  **/
  @ApiModelProperty(example = "05425070", value = "Código de endereçamento postal do portador do cartão (CEP). Não deve conter pontos ou hífen.")
  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortadorEndereco novoCartaoPortadorEndereco = (NovoCartaoPortadorEndereco) o;
    return Objects.equals(this.logradouro, novoCartaoPortadorEndereco.logradouro) &&
        Objects.equals(this.complemento, novoCartaoPortadorEndereco.complemento) &&
        Objects.equals(this.cidade, novoCartaoPortadorEndereco.cidade) &&
        Objects.equals(this.estado, novoCartaoPortadorEndereco.estado) &&
        Objects.equals(this.pais, novoCartaoPortadorEndereco.pais) &&
        Objects.equals(this.codigoPostal, novoCartaoPortadorEndereco.codigoPostal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, complemento, cidade, estado, pais, codigoPostal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortadorEndereco {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
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

