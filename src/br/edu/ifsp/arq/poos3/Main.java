package br.edu.ifsp.arq.poos3;

public class Main {

    public static void main(String[] args) {
        CalcularImposto calculadora = new CalcularImposto();
        ICMS icms = new ICMS(1000.0);
        IPI ipi = new IPI(2000.0);
        System.out.println(calculadora.calcular(icms));
        System.out.println(calculadora.calcular(ipi));
    }
}
