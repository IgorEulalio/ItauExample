$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/features/CalculoImpostoRenda.feature");
formatter.feature({
  "name": "Calculo do Imposto de Renda",
  "description": "  Eu como pessoa física\n  Desejo declarar os meus bens\n  Para que eu possa saber qual o valor do imposto que eu tenho a restituir ou a pagar",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens \u003cTabelaFipe\u003e , \u003cTipoResidencia\u003e , \u003cValorResidencia\u003e, \u003cValorInvestimento\u003e, \u003cValorPoupanca\u003e",
  "keyword": "Dado "
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ \u003cValorRestituido\u003e",
  "keyword": "Então "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "TabelaFipe",
        "TipoResidencia",
        "ValorResidencia",
        "ValorInvestimento",
        "ValorPoupanca",
        "ValorRestituido"
      ]
    },
    {
      "cells": [
        "100000",
        "\"C\"",
        "150000",
        "9000",
        "250000",
        "11.0"
      ]
    },
    {
      "cells": [
        "55500,0",
        "\"A\"",
        "3000000",
        "7000",
        "450000",
        "44690.0"
      ]
    },
    {
      "cells": [
        "100000",
        "\"C\"",
        "10",
        "9000",
        "250000",
        "6180.15"
      ]
    },
    {
      "cells": [
        "55500,0",
        "\"A\"",
        "20",
        "7000",
        "450000",
        "14690.2"
      ]
    },
    {
      "cells": [
        "100000",
        "\"C\"",
        "1000",
        "9000",
        "250000",
        "6195.0"
      ]
    },
    {
      "cells": [
        "55500,0",
        "\"A\"",
        "5000",
        "7000",
        "450000",
        "14740.0"
      ]
    },
    {
      "cells": [
        "100000",
        "\"C\"",
        "9999",
        "9000",
        "250000",
        "5"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 100000 , \"C\" , 150000, 9000, 250000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 11.0",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nJSON path valor_restituido doesn\u0027t match.\nExpected: \u003c11.0F\u003e\n  Actual: 8430.0\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:80)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:74)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallConstructor(CallSiteArray.java:59)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:237)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:249)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:492)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:115)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:127)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:655)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.runtime.callsite.PlainObjectMetaMethodSite.doInvoke(PlainObjectMetaMethodSite.java:43)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:190)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:58)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:156)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:168)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:260)\r\n\tat io.restassured.specification.ResponseSpecification$body$0.callCurrent(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:156)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:192)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:107)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.body(ValidatableResponseOptionsImpl.java:244)\r\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$body(ValidatableResponseImpl.groovy)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\r\n\tat io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy:298)\r\n\tat io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy)\r\n\tat br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(CalculoImpostoTest.java:44)\r\n\tat ✽.devo obter o valor de imposto equivalente a R$ 11.0(file:///C:/Users/Leonardo/workspace/ItauExample/src/test/resource/features/CalculoImpostoRenda.feature:10)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 55500,0 , \"A\" , 3000000, 7000, 450000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 44690.0",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 100000 , \"C\" , 10, 9000, 250000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 6180.15",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 55500,0 , \"A\" , 20, 7000, 450000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 14690.2",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 100000 , \"C\" , 1000, 9000, 250000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 6195.0",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 55500,0 , \"A\" , 5000, 7000, 450000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 14740.0",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verificar se o imposto é calculado corretamente pela API",
  "description": "",
  "keyword": "Esquema do Cenario"
});
formatter.step({
  "name": "que tenho os seguintes bens 100000 , \"C\" , 9999, 9000, 250000",
  "keyword": "Dado "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.que_tenho_os_seguintes_bens(java.lang.Double,java.lang.String,java.lang.Double,java.lang.Double,java.lang.Double)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto os meus bens para cálculo do imposto",
  "keyword": "Quando "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.submetoOsMeusBensParaCálculoDoImposto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "devo obter o valor de imposto equivalente a R$ 5",
  "keyword": "Então "
});
formatter.match({
  "location": "br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(double)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: 1 expectation failed.\nJSON path valor_restituido doesn\u0027t match.\nExpected: \u003c5.0F\u003e\n  Actual: 6329.985\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.invoke(CachedConstructor.java:80)\r\n\tat org.codehaus.groovy.reflection.CachedConstructor.doConstructorInvoke(CachedConstructor.java:74)\r\n\tat org.codehaus.groovy.runtime.callsite.ConstructorSite$ConstructorSiteNoUnwrap.callConstructor(ConstructorSite.java:84)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callConstructor(AbstractCallSite.java:249)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure.validate(ResponseSpecificationImpl.groovy:492)\r\n\tat io.restassured.internal.ResponseSpecificationImpl$HamcrestAssertionClosure$validate$1.call(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.validateResponseIfRequired(ResponseSpecificationImpl.groovy:655)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.runtime.callsite.PlainObjectMetaMethodSite.doInvoke(PlainObjectMetaMethodSite.java:43)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite$PogoCachedMethodSiteNoUnwrapNoCoerce.invoke(PogoMetaMethodSite.java:190)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoMetaMethodSite.callCurrent(PogoMetaMethodSite.java:58)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:168)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:260)\r\n\tat io.restassured.specification.ResponseSpecification$body$0.callCurrent(Unknown Source)\r\n\tat io.restassured.internal.ResponseSpecificationImpl.body(ResponseSpecificationImpl.groovy:107)\r\n\tat io.restassured.internal.ValidatableResponseOptionsImpl.body(ValidatableResponseOptionsImpl.java:244)\r\n\tat io.restassured.internal.ValidatableResponseImpl.super$2$body(ValidatableResponseImpl.groovy)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:101)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1217)\r\n\tat org.codehaus.groovy.runtime.ScriptBytecodeAdapter.invokeMethodOnSuperN(ScriptBytecodeAdapter.java:144)\r\n\tat io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy:298)\r\n\tat io.restassured.internal.ValidatableResponseImpl.body(ValidatableResponseImpl.groovy)\r\n\tat br.com.api.steps.CalculoImpostoTest.devoObterOValorDeImpostoEquivalenteAoResultadoEsperado(CalculoImpostoTest.java:44)\r\n\tat ✽.devo obter o valor de imposto equivalente a R$ 5(file:///C:/Users/Leonardo/workspace/ItauExample/src/test/resource/features/CalculoImpostoRenda.feature:10)\r\n",
  "status": "failed"
});
});