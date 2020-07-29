package com.example.itau.dto;

import com.example.itau.entrypoint.dto.CarroDTO;
import com.example.itau.entrypoint.dto.ImovelDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class InsumoParaCalculoDTO {

    @NotNull
    public List<CarroDTO> carros;

    @NotNull
    @JsonProperty("dinheiro_investido")
    public double dinheiroInvestido;

    @NotNull
    @JsonProperty("dinheiro_poupanca")
    public double dinheiroPoupanca;

    @NotNull
    public List<ImovelDTO> imoveis;
}
