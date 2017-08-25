package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * MsgErro
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class MsgErro {
  @SerializedName("mensagem")
  private String mensagem = null;

  public MsgErro mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

   /**
   * Mensagem com descrição do erro.
   * @return mensagem
  **/
  @ApiModelProperty(value = "Mensagem com descrição do erro.")
  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgErro msgErro = (MsgErro) o;
    return Objects.equals(this.mensagem, msgErro.mensagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mensagem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgErro {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

