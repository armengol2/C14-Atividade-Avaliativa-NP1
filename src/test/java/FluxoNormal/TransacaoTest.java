package FluxoNormal;

import org.example.Transacao;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransacaoTest {

    @Test
    void deveArmazenarValorDescricaoEDataInformadosNoConstrutor() {
        FakeTransacao transacao = new FakeTransacao(250.0, "Teste", "05/04/2026", 250.0);

        assertEquals(250.0, transacao.getValor(), 0.001);
        assertEquals("Teste", transacao.getDescricao());
        assertEquals("05/04/2026", transacao.getData());
    }

    @Test
    void deveRetornarValorDefinidoNaSubclasseAoAplicarNoSaldo() {
        FakeTransacao transacao = new FakeTransacao(100.0, "Ajuste", "05/04/2026", 450.0);

        assertEquals(450.0, transacao.aplicarNoSaldo(), 0.001);
    }

    private static class FakeTransacao extends Transacao {
        private final double retornoNoSaldo;

        FakeTransacao(double valor, String descricao, String data, double retornoNoSaldo) {
            super(valor, descricao, data);
            this.retornoNoSaldo = retornoNoSaldo;
        }

        @Override
        public double aplicarNoSaldo() {
            return retornoNoSaldo;
        }
    }
}
