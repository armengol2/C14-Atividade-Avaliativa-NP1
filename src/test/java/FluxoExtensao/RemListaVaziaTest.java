package FluxoExtensao;

import org.example.Carteira;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RemListaVaziaTest {

    @Test
    void testeErroRemoverComCarteiraVazia() {
        // Criamos uma carteira nova (sem transações)
        Carteira carteira = new Carteira();

        int qualquerIndice = 0;


        assertThrows(IllegalStateException.class, () -> {
            carteira.remTransacao(qualquerIndice);
        });
    }
}