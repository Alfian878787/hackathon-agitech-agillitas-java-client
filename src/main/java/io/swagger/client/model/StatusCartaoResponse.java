package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * StatusCartaoResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class StatusCartaoResponse {
  @SerializedName("status")
  private String status = null;

  public StatusCartaoResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status relacionado a um cartão (bloqueado, desbloqueadoReativo ou cancelado)
   * @return status
  **/
  @ApiModelProperty(example = "bloqueado", value = "Status relacionado a um cartão (bloqueado, desbloqueadoReativo ou cancelado)")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCartaoResponse statusCartaoResponse = (StatusCartaoResponse) o;
    return Objects.equals(this.status, statusCartaoResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCartaoResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

