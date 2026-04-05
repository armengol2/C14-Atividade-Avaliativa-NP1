package FluxoExtensao;

import org.example.Carteira;
import org.example.Despesa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SaldoInsuficienteTest {

    @Test
    void testeErroGastarMaisDoQueTem() {
        Carteira carteira = new Carteira();

        Despesa contaCara = new Despesa(500.0, "Aluguel", "05/04/2026");

        assertThrows(IllegalStateException.class, () -> {
            carteira.addTransacao(contaCara);
        });
    }
}