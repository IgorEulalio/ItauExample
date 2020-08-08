package br.com.api.steps;

import com.example.itau.entrypoint.dto.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;


import java.util.Arrays;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.stringContainsInOrder;

public class CalculoImposto {

    private StepData data;
    private Double tabelaFipe, valorResidencia, valorInvestimento, valorPoupanca;
    private String tipoResidencia;
    private Double double1;

    public CalculoImposto(StepData data) {
        this.data = data;
    }

    private InsumoParaCalculoDTO insumoParaCalculoDTO;
    private ImpostoDTO impostoDTO;

    @Dado("que tenho os seguintes bens {double} , {string} , {double}, {double}, {double}")
    public void que_tenho_os_seguintes_bens(Double double1, String residencia, Double double2, Double double3, Double double4) {
        tabelaFipe = double1;
        tipoResidencia = residencia;
        valorResidencia = double2;
        valorInvestimento = double3;
        valorPoupanca = double4;

        CarroDTO carroDTO = CarroDTO.builder()
                .tabelaFipe(double1)
                .build();

        ImovelDTO imovelDTO = ImovelDTO.builder()
                .tipo_residencia(TipoResidencia.valueOf(residencia))
                .valor(double2)
                .build();

        insumoParaCalculoDTO = InsumoParaCalculoDTO.builder()
                .carros(Arrays.asList(carroDTO))
                .imoveis(Arrays.asList(imovelDTO))
                .dinheiroInvestido(double3)
                .dinheiroPoupanca(double4)
                .build();

    }

    @Quando("submeto os meus bens para cálculo do imposto")
    public void submetoOsMeusBensParaCálculoDoImposto() {
        impostoDTO = data.useCase.calculaImposto(insumoParaCalculoDTO);
    }

    @Então("devo obter o valor de imposto equivalente a R$ {double}")
    public void devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double resultadoEsperado) {

        given()
                .contentType(ContentType.JSON)
                .log().all()
                .body(retornaBody())
            .when()
                .post("http://localhost:8080/calcula_imposto_renda")
        .then()
                .log().all()
                .statusCode(200)
                .body("valor_restituido", equalTo((float)resultadoEsperado))
        ;
    }

    public String retornaBody(){
       String bodyResponse = "{\n" +
                "    \"carros\": [\n" +
                "        {\n" +
                "            \"ano_modelo\": \"2015\",\n" +
                "            \"quilometragem\": 83000,\n" +
                "            \"marca\": \"volkswagen\",\n" +
                "            \"modelo\": \"golf\",\n" +
                "            \"tabela_fipe\": 100000\n" +
                "        }\n" +
                "    ],\n" +
                "    \"dinheiro_investido\":"+valorInvestimento+",\n"+
                "    \"dinheiro_poupanca\":"+valorPoupanca+",\n"+
                "    \"imoveis\": [\n" +
                "        {\n" +
                "            \"metros_quadrados\": 328,\n" +
                "            \"tipo_residencia\":"+"\""+tipoResidencia+"\""+",\n"+
                "            \"valor\":"+valorResidencia+
                "        }\n" +
                "    ]\n" +
                "}";
        return bodyResponse;
    }
}
