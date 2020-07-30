package com.example.itau.entrypoint;

import com.example.itau.entrypoint.dto.InsumoParaCalculoDTO;
import com.example.itau.entrypoint.dto.ImpostoDTO;
import com.example.itau.usecase.CalculoImpostoUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CalculoImpostoController {

    private CalculoImpostoUseCase useCase;

    public CalculoImpostoController(CalculoImpostoUseCase usecase) {
        this.useCase = usecase;
    };

    @PostMapping("/calcula_imposto_renda")
    public ResponseEntity<ImpostoDTO> calculaImposto(@RequestBody @Valid InsumoParaCalculoDTO dto) {
        return ResponseEntity.ok().body(useCase.calculaImposto(dto));
    };
}
