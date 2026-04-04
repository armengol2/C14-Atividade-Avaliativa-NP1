package org.example;
public abstract class Transacao {
    private double valor;
    private String desc;
    private String data;

    public Transacao(double valor, String desc, String data) {
        this.valor = valor;
        this.desc = desc;
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return desc;
    }

    public String getData() {
        return data;
    }

    public abstract double aplicarNoSaldo();
}