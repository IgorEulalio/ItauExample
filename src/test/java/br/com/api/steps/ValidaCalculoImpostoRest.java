package br.com.api.steps;


import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ValidaCalculoImpostoRest {
    private  String bodyResponse = "{\n" +
            "    \"carros\": [\n" +
            "        {\n" +
            "            \"ano_modelo\": \"2015\",\n" +
            "            \"quilometragem\": 83000,\n" +
            "            \"marca\": \"volkswagen\",\n" +
            "            \"modelo\": \"golf\",\n" +
            "            \"tabela_fipe\": 100000\n" +
            "        }\n" +
            "    ],\n" +
            "    \"dinheiro_investido\": 9000,\n" +
            "    \"dinheiro_poupanca\": 27000,\n" +
            "    \"imoveis\": [\n" +
            "        {\n" +
            "            \"metros_quadrados\": 328,\n" +
            "            \"tipo_residencia\": \"C\",\n" +
            "            \"valor\": 300000\n" +
            "        }\n" +
            "    ]\n" +
            "}";


    @Test
    public void deveValidarCalculo() {
        given()
                .log().all()
                .header("Content-Type", "application/json")
                .body(bodyResponse)
                .when()
                .post("http://localhost:8080/calcula_imposto_renda")
                .then()
                .log().all()
                .statusCode(200)
        ;
    }

}
