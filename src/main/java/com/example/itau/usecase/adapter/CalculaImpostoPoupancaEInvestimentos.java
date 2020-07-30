package com.example.itau.usecase.adapter;

import org.springframework.stereotype.Service;

@Service
public class CalculaImpostoPoupancaEInvestimentos {

    public Double calculaInvestimentos(double dinheiroInvestido, double dinheiroPoupanca) {

        double restituicao;

        if(dinheiroInvestido > dinheiroPoupanca){
            restituicao = (dinheiroInvestido + dinheiroPoupanca) * 0.01;
            return restituicao;
        }
        restituicao = (dinheiroInvestido + dinheiroPoupanca) * 0.02;

        return restituicao;
    }
}
