package com.example.itau.entrypoint.dto;

public enum TipoResidencia {

    A("Apartamento", 1), C("Casa", 2), CF("Condominio fechado", 3);

    private String descricao;
    private Integer id;

    TipoResidencia(String descricao, Integer id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getValue() {
        return this.descricao;
    }
}
