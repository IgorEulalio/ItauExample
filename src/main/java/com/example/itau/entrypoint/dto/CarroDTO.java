package com.example.itau.entrypoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@Data
@Builder
public class CarroDTO {

    @NotNull
    @JsonProperty("ano_modelo")
    public String anoModelo;

    @NotNull
    public Double quilometragem;

    @NotNull
    public String marca;

    @NotNull
    public String modelo;

    @NotNull
    @JsonProperty("tabela_fipe")
    public Double tabelaFipe;
}
