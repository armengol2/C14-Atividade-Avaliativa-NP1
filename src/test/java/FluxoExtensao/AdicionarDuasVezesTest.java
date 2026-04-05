package FluxoExtensao;

import org.example.Carteira;
import org.example.Receita;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AdicionarDuasVezesTest {
    @Test
    void testeErroAdicionarMesmaCoisaDuasVezes() {
        Carteira carteira = new Carteira();
        Receita r = new Receita(50, "Teste", "05/04/2026");
        carteira.addTransacao(r);
        assertThrows(IllegalStateException.class, () -> {
            carteira.addTransacao(r);
        });
    }
}