package br.ifpr;

public class CalculadoraFinanceira extends Calculadora {
    public double calcularJuroSimples(double valor, double taxa, int periodo ) {
        return valor * taxa * periodo;
    }

    public double calcularJurosCompostos(double valor, double taxa, int perdiodo) {
        return valor * Math.pow(1 + taxa, perdiodo);
    }
    
}
