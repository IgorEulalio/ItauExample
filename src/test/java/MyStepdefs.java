import com.example.itau.entrypoint.dto.InsumoParaCalculoDTO;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class MyStepdefs {
    @Dado("@\"que tenho os seguintes bens (.*    ) , (.*) , (.*), (.*), (.*)\"")
    public void queTenhoOsSeguintesBensTabelaFipeTipoResidenciaValorResidenciaValorInvestimentoValorPoupanca(double tabelaFipe, String tipoResidencia, double valorResidencia, double investimento, double poupanca) {
        InsumoParaCalculoDTO calculoImposto = new InsumoParaCalculoDTO();
        
    }

    @Quando("submeto os meus bens para cálculo do imposto")
    public void submetoOsMeusBensParaCálculoDoImposto() {
    }

    @Então("devo obter o valor de imposto equivalente a R$ <ResultadoEsperado>")
    public void devoObterOValorDeImpostoEquivalenteAR$ResultadoEsperado() {
    }

    @Dado("que tenho os seguintes bens")
    public void queTenhoOsSeguintesBens() {
    }

    @Então("devo obter o valor de imposto equivalente a R$ {double}")
    public void devoObterOValorDeImpostoEquivalenteAR$(int arg0, int arg1) {
    }
}
