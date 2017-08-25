package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.NovoCartao;

/**
 * SetNovoCartao
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class SetNovoCartao {
  @SerializedName("cartao")
  private NovoCartao cartao = null;

  public SetNovoCartao cartao(NovoCartao cartao) {
    this.cartao = cartao;
    return this;
  }

   /**
   * Get cartao
   * @return cartao
  **/
  @ApiModelProperty(value = "")
  public NovoCartao getCartao() {
    return cartao;
  }

  public void setCartao(NovoCartao cartao) {
    this.cartao = cartao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetNovoCartao setNovoCartao = (SetNovoCartao) o;
    return Objects.equals(this.cartao, setNovoCartao.cartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetNovoCartao {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
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

