package FluxoNormal;

import org.example.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceitaTest {

    @Test
    void deveAplicarReceitaComoValorPositivoNoSaldo() {
        Receita receita = new Receita(750.0, "Bonus", "05/04/2026");

        assertEquals(750.0, receita.aplicarNoSaldo(), 0.001);
    }

    @Test
    void deveManterDadosInformadosNosGetters() {
        Receita receita = new Receita(300.0, "Venda", "05/04/2026");

        assertEquals(300.0, receita.getValor(), 0.001);
        assertEquals("Venda", receita.getDescricao());
        assertEquals("05/04/2026", receita.getData());
    }
}
