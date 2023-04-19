package br.ifpr;

public class CalculadoraCientifica extends Calculadora {
    public double calcularLogaritmo(double valor, double base) {
        return Math.log(valor) / Math.log(base);
    }

    @Override
    public double somar(double a, double b) {
        double resultado = super.somar(a, b);
        return Math.round(resultado * 100.0) / 100.0;
    }
     
}
