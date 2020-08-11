package br.com.api.body;

public class BodyCalculoImposto {
    public Double tabelaFipeCarro;
    public Double valorInvestimento;
    public Double valorPoupanca;
    public String tipoResidencia;
    public Double valorResidencia;

    public Double getTabelaFipeCarro() {
        return tabelaFipeCarro;
    }
    public void setTabelaFipeCarro(Double tabelaFipeCarro) {
        this.tabelaFipeCarro = tabelaFipeCarro;
    }

    public Double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(Double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public Double getValorPoupanca() {
        return valorPoupanca;
    }

    public void setValorPoupanca(Double valorPoupanca) {
        this.valorPoupanca = valorPoupanca;
    }

    public String getTipoResidencia() {
        return tipoResidencia;
    }

    public void setTipoResidencia(String tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public Double getValorResidencia() {
        return valorResidencia;
    }

    public void setValorResidencia(Double valorResidencia) {
        this.valorResidencia = valorResidencia;
    }


}
