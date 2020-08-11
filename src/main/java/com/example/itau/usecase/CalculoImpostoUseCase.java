package com.example.itau.usecase;

import com.example.itau.entrypoint.dto.InsumoParaCalculoDTO;
import com.example.itau.entrypoint.dto.ImpostoDTO;
import com.example.itau.usecase.adapter.CalculaImpostoCarros;
import com.example.itau.usecase.adapter.CalculaImpostoImoveis;
import com.example.itau.usecase.adapter.CalculaImpostoPoupancaEInvestimentos;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculoImpostoUseCase {

    private CalculaImpostoCarros calculaCarros;

    private CalculaImpostoImoveis calculaImoveis;

    private CalculaImpostoPoupancaEInvestimentos calculaInvestimentos;

    public CalculoImpostoUseCase(CalculaImpostoCarros calculaCarros, CalculaImpostoImoveis calculaImoveis, CalculaImpostoPoupancaEInvestimentos calculaInvestimentos) {
        this.calculaCarros = calculaCarros;
        this.calculaImoveis = calculaImoveis;
        this.calculaInvestimentos = calculaInvestimentos;
    }

    public ImpostoDTO calculaImposto(InsumoParaCalculoDTO dto) {

        Double restituicaoCarros = calculaCarros.calculaImpostoVeiculos(dto.carros);
        Double restituicaoImoveis = calculaImoveis.calculaImpostoImoveis(dto.imoveis);
        Double restituicaoPoupancaEInvestimentos = calculaInvestimentos.calculaInvestimentos(dto.dinheiroInvestido, dto.dinheiroPoupanca);

        var restituicaoFinal = restituicaoCarros + restituicaoImoveis + restituicaoPoupancaEInvestimentos;
        ImpostoDTO imposto = new ImpostoDTO(restituicaoFinal);
        return imposto;
    }
}
