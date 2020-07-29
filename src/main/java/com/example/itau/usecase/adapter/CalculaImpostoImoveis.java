package com.example.itau.usecase.adapter;

import com.example.itau.entrypoint.dto.ImovelDTO;
import com.example.itau.entrypoint.dto.TipoResidencia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculaImpostoImoveis {
    public Double calculaImpostoImoveis(List<ImovelDTO> imoveis) {

        double restituicao = imoveis.stream().mapToDouble(i -> {
          if(i.tipo_residencia.equals(TipoResidencia.A)){
              return i.valor * 0.01;
          }
          else if(i.tipo_residencia.equals(TipoResidencia.C)){
              return i.valor * 0.015;
          }
          return i.valor * 0.02;
        }).sum();

        return restituicao;
    }
}
