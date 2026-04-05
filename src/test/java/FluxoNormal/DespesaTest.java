package FluxoNormal;

import org.example.Despesa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DespesaTest {

    @Test
    void deveAplicarDespesaComoValorNegativoNoSaldo() {
        Despesa despesa = new Despesa(120.0, "Luz", "05/04/2026");

        assertEquals(-120.0, despesa.aplicarNoSaldo(), 0.001);
    }

    @Test
    void deveManterDadosInformados() {
        Despesa despesa = new Despesa(90.0, "Internet", "05/04/2026");

        assertEquals(90.0, despesa.getValor(), 0.001);
        assertEquals("Internet", despesa.getDescricao());
        assertEquals("05/04/2026", despesa.getData());
    }
}
