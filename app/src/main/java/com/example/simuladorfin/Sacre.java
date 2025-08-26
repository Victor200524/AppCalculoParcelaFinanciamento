package com.example.simuladorfin;

public class Sacre {
    public static double calcParcelaSACRE(double valor, double juros, int prazo) {
        double amortizacao = valor / prazo;
        double saldo = valor;

        double somaParcelas = 0.0;

        for (int i = 0; i < prazo; i++) {
            double jurosParcela = saldo * (juros / 100);
            double prestacao = amortizacao + jurosParcela;
            somaParcelas += prestacao;
            saldo -= amortizacao;
        }

        return somaParcelas / prazo;
    }

}
