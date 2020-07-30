package com.example.itau.usecase.adapter;

import com.example.itau.entrypoint.dto.CarroDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculaImpostoCarros {
    public Double calculaImpostoVeiculos(List<CarroDTO> carros) {

        double restituicao = carros.stream().mapToDouble(c -> (int) (c.tabelaFipe * 0.01)).sum();
        return restituicao;
    }
}
