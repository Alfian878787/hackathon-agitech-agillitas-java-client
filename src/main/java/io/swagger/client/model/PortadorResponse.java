package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Portador;

/**
 * PortadorResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class PortadorResponse {
  @SerializedName("portador")
  private Portador portador = null;

  public PortadorResponse portador(Portador portador) {
    this.portador = portador;
    return this;
  }

   /**
   * Get portador
   * @return portador
  **/
  @ApiModelProperty(value = "")
  public Portador getPortador() {
    return portador;
  }

  public void setPortador(Portador portador) {
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
    PortadorResponse portadorResponse = (PortadorResponse) o;
    return Objects.equals(this.portador, portadorResponse.portador);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portador);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortadorResponse {\n");
    
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

