package com.example.itau.usecase;

import com.example.itau.entrypoint.dto.InsumoParaCalculoDTO;
import com.example.itau.entrypoint.dto.ImpostoDTO;
import com.example.itau.usecase.adapter.CalculaImpostoCarros;
import com.example.itau.usecase.adapter.CalculaImpostoImoveis;
import com.example.itau.usecase.adapter.CalculaImpostoPoupancaEInvestimentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculoImpostoUseCase {

    @Autowired
    private CalculaImpostoCarros calculaCarros;

    @Autowired
    private CalculaImpostoImoveis calculaImoveis;

    @Autowired
    private CalculaImpostoPoupancaEInvestimentos calculaInvestimentos;

    public ImpostoDTO calculaImposto(InsumoParaCalculoDTO dto) {
        
        Double restituicaoCarros = calculaCarros.calculaImpostoVeiculos(dto.carros);
        Double restituicaoImoveis = calculaImoveis.calculaImpostoImoveis(dto.imoveis);
        Double restituicaoPoupancaEInvestimentos = calculaInvestimentos.calculaInvestimentos(dto.dinheiroInvestido, dto.dinheiroPoupanca);

        var restituicaoFinal = restituicaoCarros + restituicaoImoveis + restituicaoPoupancaEInvestimentos;
        ImpostoDTO imposto = new ImpostoDTO(restituicaoFinal);
        return imposto;
    };
}
