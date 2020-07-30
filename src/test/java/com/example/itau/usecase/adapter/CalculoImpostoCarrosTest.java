package com.example.itau.usecase.adapter;
import com.example.itau.entrypoint.dto.CarroDTO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class CalculoImpostoCarrosTest {

    @Mock
    private CalculaImpostoCarros teste;

    @Test
    public void deveRetornar300QuandoTiverCarroComTabelaFipe30000(){


        var carroParaTeste = CarroDTO.builder()
                .anoModelo("2015")
                .tabelaFipe(Double.valueOf(30000))
                .quilometragem(Double.valueOf(5000))
                .marca("vw")
                .modelo("polo")
                .build();

        Double aDouble = teste.calculaImpostoVeiculos(Arrays.asList(carroParaTeste));

        Assert.assertEquals(aDouble, Double.valueOf(300));

    }
}
