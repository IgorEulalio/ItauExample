package com.example.itau.entrypoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class ImovelDTO {

    @NotNull
    @JsonProperty("metros_quadrados")
    public double metrosQuadrados;

    @NotNull
    @JsonProperty("tipo_residencia")
    public TipoResidencia tipo_residencia;

    @NotNull
    public Double valor;
}
