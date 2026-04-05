package FluxoNormal;

import org.example.Carteira;
import org.example.Despesa;
import org.example.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteiraTest {

    @Test
    void deveCalcularSaldoComUmaReceitaeDespesa() {
        Carteira carteira = new Carteira();

        carteira.addTransacao(new Receita(1000.0, "Salario", "05/04/2026"));
        carteira.addTransacao(new Despesa(200.0, "Mercado", "05/04/2026"));

        assertEquals(800.0, carteira.saldo(), 0.001);
    }

    @Test
    void deveCalcularSaldoQuandoReceitas() {
        Carteira carteira = new Carteira();

        carteira.addTransacao(new Receita(1000.0, "Salario", "05/04/2026"));
        carteira.addTransacao(new Receita(500.0, "Freela", "05/04/2026"));

        assertEquals(1500.0, carteira.saldo(), 0.001);
    }
}
