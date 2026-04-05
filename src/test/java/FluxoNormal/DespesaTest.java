package FluxoNormal;

import org.example.Despesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DespesaTest {

    @Test
    public void deveRetornarValorNegativoAoAplicarNoSaldo() {
        Despesa despesa = new Despesa(120, "Transporte", "04/04/2026");

        double valorAplicado = despesa.aplicarNoSaldo();

        assertEquals(-120, valorAplicado);
    }

    @Test
    public void deveManterDadosInformadosNaCriacaoDaDespesa() {
        Despesa despesa = new Despesa(90, "Internet", "05/04/2026");

        assertEquals(90, despesa.getValor());
        assertEquals("Internet", despesa.getDescricao());
        assertEquals("05/04/2026", despesa.getData());
    }
}
