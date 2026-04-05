package FluxoNormal;

import org.example.Carteira;
import org.example.Despesa;
import org.example.Receita;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarteiraTest {

    @Test
    public void deveCalcularSaldoCorretamente() {
        Carteira carteira = new Carteira();

        Receita receita = new Receita(1000, "Salário", "01/04/2026");
        Despesa despesa = new Despesa(200, "Mercado", "02/04/2026");

        carteira.addTransacao(receita);
        carteira.addTransacao(despesa);

        double saldoEsperado = 800;
        double saldoObtido = carteira.saldo();
        assertEquals(saldoEsperado, saldoObtido);
    }

    @Test
    public void deveCalcularSaldoCorretamenteApenasReceitas() {
        Carteira carteira = new Carteira();

        Receita receita1 = new Receita(1000, "Salario", "01/04/2026");
        Receita receita2 = new Receita(500, "Freelance", "03/04/2026");

        carteira.addTransacao(receita1);
        carteira.addTransacao(receita2);

        double saldoObtido = carteira.saldo();

        assertEquals(1500, saldoObtido);
    }
}
