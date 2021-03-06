package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.DetalhamentoExtrato;
import java.util.ArrayList;
import java.util.List;

/**
 * ExtratoResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class ExtratoResponse {
  @SerializedName("extrato")
  private List<DetalhamentoExtrato> extrato = new ArrayList<DetalhamentoExtrato>();

  public ExtratoResponse extrato(List<DetalhamentoExtrato> extrato) {
    this.extrato = extrato;
    return this;
  }

  public ExtratoResponse addExtratoItem(DetalhamentoExtrato extratoItem) {
    this.extrato.add(extratoItem);
    return this;
  }

   /**
   * Get extrato
   * @return extrato
  **/
  @ApiModelProperty(value = "")
  public List<DetalhamentoExtrato> getExtrato() {
    return extrato;
  }

  public void setExtrato(List<DetalhamentoExtrato> extrato) {
    this.extrato = extrato;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtratoResponse extratoResponse = (ExtratoResponse) o;
    return Objects.equals(this.extrato, extratoResponse.extrato);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extrato);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResponse {\n");
    
    sb.append("    extrato: ").append(toIndentedString(extrato)).append("\n");
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

