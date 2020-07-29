package com.example.itau.entrypoint.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class ImpostoDTO {

    @JsonProperty("valor_restituido")
    public Double valorRestituido;

    public ImpostoDTO(Double valorRestituido) {
        this.valorRestituido = valorRestituido;
    }
}
