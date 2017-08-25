package io.swagger.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SetSaldoValor;

/**
 * SetSaldo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-22T20:46:46.763Z")
public class SetSaldo {
    @SerializedName("saldo")
    private SetSaldoValor saldo = null;

    public SetSaldo saldo(SetSaldoValor saldo) {
        this.saldo = saldo;
        return this;
    }

    /**
     * Get saldo
     *
     * @return saldo
     **/
    @ApiModelProperty(value = "")
    public SetSaldoValor getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        SetSaldoValor valor = new SetSaldoValor();
        valor.setValor(saldo);
        this.saldo = valor;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetSaldo setSaldo = (SetSaldo) o;
        return Objects.equals(this.saldo, setSaldo.saldo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(saldo);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetSaldo {\n");

        sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
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

