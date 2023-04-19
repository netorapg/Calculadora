package br.ifpr;

public class CalculadoraProgramadora extends Calculadora{
    public int converterBinarioParaDecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }

    public String converterDecimalParaBinario(int decimal) {
        return Integer.toBinaryString(decimal);
    }
    
}
