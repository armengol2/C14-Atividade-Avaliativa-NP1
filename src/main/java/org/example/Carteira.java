package org.example;

import java.util.ArrayList;

public class Carteira {
    private ArrayList<Transacao> transacoes;

    public Carteira() {
        transacoes = new ArrayList<>();
    }

    public ArrayList<Transacao> getTransacoes() {
        return this.transacoes;
    }

    public void addTransacao(Transacao t) {
        if (t instanceof Despesa && (saldo() - t.getValor() < 0)) {
            throw new IllegalStateException("Saldo insuficiente para esta despesa!");
        }

        if (!transacoes.isEmpty()) {
            Transacao ultima = transacoes.get(transacoes.size() - 1);
            if (ultima.getDescricao().equals(t.getDescricao()) &&
                    ultima.getValor() == t.getValor() &&
                    ultima.getData().equals(t.getData())) {
                throw new IllegalStateException("Esta transação parece ser duplicada!");
            }
        }

        transacoes.add(t);
    }

    public void remTransacao(int indice) {
        if (this.transacoes.isEmpty()) {
            throw new IllegalStateException("A carteira está vazia! Não há o que remover.");
        }

        if (indice < 0 || indice >= transacoes.size()) {
            throw new IndexOutOfBoundsException("Índice inexistente!");
        }

        this.transacoes.remove(indice);
    }

    public void listTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("Nenhuma transação cadastrada.");
            return;
        }

        for (int i = 0; i < transacoes.size(); i++) {
            Transacao t = transacoes.get(i);
            System.out.println(i + " - " + t.getDescricao() + " - R$ " + t.getValor() + " - " + t.getData());
        }
    }

    public double saldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            saldo += t.aplicarNoSaldo();
        }
        return saldo;
    }
}