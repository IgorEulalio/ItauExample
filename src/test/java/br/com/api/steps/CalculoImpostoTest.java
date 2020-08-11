package br.com.api.steps;

import br.com.api.body.BodyCalculoImposto;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.Matchers.equalTo;

public class CalculoImpostoTest {
    public RequestSpecification httpRequest;
    public Response response;
    BodyCalculoImposto camposObrigatorios;

    @Dado("que tenho os seguintes bens {double} , {string} , {double}, {double}, {double}")
    public void que_tenho_os_seguintes_bens(Double tabelaFipe, String residencia, Double valorResidencia, Double valorInvestimento, Double valorPoupanca) {
        camposObrigatorios = new BodyCalculoImposto();

        camposObrigatorios.setTabelaFipeCarro(tabelaFipe);
        camposObrigatorios.setTipoResidencia(residencia);
        camposObrigatorios.setValorResidencia(valorResidencia);
        camposObrigatorios.setValorInvestimento(valorInvestimento);
        camposObrigatorios.setValorPoupanca(valorPoupanca);
    }

    @Quando("submeto os meus bens para cálculo do imposto")
    public void submetoOsMeusBensParaCálculoDoImposto() {
        //Montando a requisição
        RestAssured.baseURI = "http://localhost:8080";
        httpRequest = RestAssured.given().contentType(ContentType.JSON);
        httpRequest.body(retornaBody());

        //Chamando a rota POST
        response = httpRequest.post("/calcula_imposto_renda");
    }

    @Então("devo obter o valor de imposto equivalente a R$ {double}")
    public void devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double resultadoEsperado) {
        response.then().body("valor_restituido", equalTo((float)resultadoEsperado));
    }
    public String retornaBody(){
        String bodyResponse = "{\n" +
                "    \"carros\": [\n" +
                "        {\n" +
                "            \"ano_modelo\": \"2015\",\n" +
                "            \"quilometragem\": 83000,\n" +
                "            \"marca\": \"volkswagen\",\n" +
                "            \"modelo\": \"golf\",\n" +
                "            \"tabela_fipe\":"+camposObrigatorios.tabelaFipeCarro+"\n"+
                "        }\n" +
                "    ],\n" +
                "    \"dinheiro_investido\":"+camposObrigatorios.valorInvestimento+",\n"+
                "    \"dinheiro_poupanca\":"+camposObrigatorios.valorPoupanca+",\n"+
                "    \"imoveis\": [\n" +
                "        {\n" +
                "            \"metros_quadrados\": 328,\n" +
                "            \"tipo_residencia\":"+"\""+camposObrigatorios.tipoResidencia+"\""+",\n"+
                "            \"valor\":"+camposObrigatorios.valorResidencia+
                "        }\n" +
                "    ]\n" +
                "}";

        return  bodyResponse;
    }
}
