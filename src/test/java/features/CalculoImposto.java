package features;

import com.example.itau.entrypoint.dto.*;
import com.example.itau.usecase.CalculoImpostoUseCase;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.List;

public class CalculoImposto {

    private StepData data;

    public CalculoImposto(StepData data) {
        this.data = data;
    }

    private InsumoParaCalculoDTO insumoParaCalculoDTO;
    private ImpostoDTO impostoDTO;

    @Dado("que tenho os seguintes bens {double} , {string} , {double}, {double}, {double}")
    public void que_tenho_os_seguintes_bens(Double double1, String string, Double double2, Double double3, Double double4) {
        CarroDTO carroDTO = CarroDTO.builder()
                .tabelaFipe(double1)
                .build();

        ImovelDTO imovelDTO = ImovelDTO.builder()
                .tipo_residencia(TipoResidencia.valueOf(string))
                .valor(double2)
                .build();

        insumoParaCalculoDTO = InsumoParaCalculoDTO.builder()
                .carros(Arrays.asList(carroDTO))
                .imoveis(Arrays.asList(imovelDTO))
                .dinheiroInvestido(double3)
                .dinheiroPoupanca(double4)
                .build();
    }

    @Quando("submeto os meus bens para cálculo do imposto")
    public void submetoOsMeusBensParaCálculoDoImposto() {
        impostoDTO = data.useCase.calculaImposto(insumoParaCalculoDTO);
    }

    @Então("devo obter o valor de imposto equivalente a R$ {double}")
    public void devoObterOValorDeImpostoEquivalenteAR$ResultadoEsperado(double resultadoEsperado) {
        Assert.assertEquals(java.util.Optional.of(resultadoEsperado), java.util.Optional.of(impostoDTO.valorRestituido));
    }
}
