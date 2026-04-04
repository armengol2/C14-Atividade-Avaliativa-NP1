package org.example;
public class Despesa extends Transacao {

    public Despesa(double valor, String desc, String data) {
        super(valor, desc, data);
    }

    @Override
    public double aplicarNoSaldo() {
        return -getValor();
    }
}