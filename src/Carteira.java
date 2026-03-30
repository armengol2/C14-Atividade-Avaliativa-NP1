import java.util.ArrayList;

public class Carteira {
    private ArrayList<Transacao> transacoes;

    public Carteira() {
        transacoes = new ArrayList<>();
    }

    public void addTransacao(Transacao transacao) {
        if (transacao.getValor() > 0) {
            transacoes.add(transacao);
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void remTransacao(int indice) {
        if (indice >= 0 && indice < transacoes.size()) {
            transacoes.remove(indice);
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void listTransacoes() {
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