package br.ifpr;

public class TesteCalculadora {
    public static void main (String[] args) {
        CalculadoraCientifica calcCient = new CalculadoraCientifica();
        double resultadoLog = calcCient.calcularLogaritmo(100, 10);
        System.out.println("Logaritmo de 100 na base 10: " + resultadoLog);

        CalculadoraFinanceira calcFin = new CalculadoraFinanceira();
        double resultadoJurosSimples = calcFin.calcularJuroSimples(1000, 0.05, 12);
        System.out.println("Juros simples sobre R$ 1000,00 por 1 ano a 5% ao mês:" + resultadoJurosSimples);

        CalculadoraProgramadora calcProg = new CalculadoraProgramadora();
        int resultadoBinario = calcProg.converterBinarioParaDecimal("1010");
        System.out.println("Conversão de binário para decimal: " + resultadoBinario);


    }
}
