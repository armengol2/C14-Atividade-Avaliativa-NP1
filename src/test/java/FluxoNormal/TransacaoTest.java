package FluxoNormal;

import org.example.Transacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransacaoTest {

    @Test
    public void deveRetornarDadosDefinidos() {
        Transacao transacao = new TransacaoFake(450, "Projeto", "06/04/2026");

        assertEquals(450, transacao.getValor());
        assertEquals("Projeto", transacao.getDescricao());
        assertEquals("06/04/2026", transacao.getData());
    }

    @Test
    public void deveAplicarNoSaldoConformeImplementacaoDeSubclasse() {
        Transacao transacao = new TransacaoFake(450, "Projeto", "06/04/2026");

        double valorAplicado = transacao.aplicarNoSaldo();

        assertEquals(450, valorAplicado);
    }

    private static class TransacaoFake extends Transacao {

        public TransacaoFake(double valor, String desc, String data) {
            super(valor, desc, data);
        }

        @Override
        public double aplicarNoSaldo() {
            return getValor();
        }
    }
}
