package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SetPagamento;

/**
 * Pagamento
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class Pagamento {
    @SerializedName("pagamento")
    private SetPagamento pagamento = null;

    public Pagamento pagamento(SetPagamento pagamento) {
        this.pagamento = pagamento;
        return this;
    }

    /**
     * Get pagamento
     *
     * @return pagamento
     **/
    @ApiModelProperty(value = "")
    public SetPagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(String idCartao, String senha, String codigoBarras) {
        SetPagamento pagamento = new SetPagamento();
        pagamento.setSenha(senha);
        pagamento.setCodigoBarras(codigoBarras);
        pagamento.setIdCartao(idCartao);
        this.pagamento = pagamento;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pagamento pagamento = (Pagamento) o;
        return Objects.equals(this.pagamento, pagamento.pagamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pagamento);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Pagamento {\n");

        sb.append("    pagamento: ").append(toIndentedString(pagamento)).append("\n");
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

