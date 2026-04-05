package FluxoNormal;

import org.example.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReceitaTest {

    @Test
    public void deveRetornarValorPositivoAoAplicarNoSaldo() {
        Receita receita = new Receita(750, "Bônus", "04/04/2026");

        double valorAplicado = receita.aplicarNoSaldo();

        assertEquals(750, valorAplicado);
    }

    @Test
    public void deveManterDadosInformadosNaCriacaoDaReceita() {
        Receita receita = new Receita(300, "Venda", "05/04/2026");

        assertEquals(300, receita.getValor());
        assertEquals("Venda", receita.getDescricao());
        assertEquals("05/04/2026", receita.getData());
    }
}
