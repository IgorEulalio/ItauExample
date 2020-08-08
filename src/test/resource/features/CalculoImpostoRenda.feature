#language: pt
Funcionalidade: Calculo do Imposto de Renda
  Eu como pessoa física
  Desejo declarar os meus bens
  Para que eu possa saber qual o valor do imposto que eu tenho a restituir ou a pagar

  Esquema do Cenario: Verificar se o imposto é calculado corretamente pela API
    Dado que tenho os seguintes bens <TabelaFipe> , <TipoResidencia> , <ValorResidencia>, <ValorInvestimento>, <ValorPoupanca>
    Quando submeto os meus bens para cálculo do imposto
    Então devo obter o valor de imposto equivalente a R$ <ResultadoEsperado>

    Exemplos:
      | TabelaFipe | TipoResidencia | ValorResidencia | ValorInvestimento | ValorPoupanca | ResultadoEsperado |
      | 100000     | "C"            | 150000          | 9000              | 250000        | 8430.0            |
      | 55500,0    | "A"            | 3000000         | 7000              | 450000        | 40140.0           |
      | 100000     | "C"            | 10              | 9000              | 250000        | 6180.15           |
      | 55500,0    | "A"            | 20              | 7000              | 450000        | 10140.2           |
      | 100000     | "C"            | 1000            | 9000              | 250000        | 6195.0            |
      | 55500,0    | "A"            | 5000            | 7000              | 450000        | 10190.0           |
      | 100000     | "C"            | 9999            | 9000              | 250000        | 6329.985          |
      | 55500,0    | "A"            | 15555           | 7000              | 450000        | 10295.55          |