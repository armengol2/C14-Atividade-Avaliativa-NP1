package FluxoExtensao;

import org.example.Carteira;
import org.example.Receita;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CarteiraTest {

    @Test
    void testeErroRemoverIndiceInexistente() {
        Carteira carteira = new Carteira();
        carteira.addTransacao(new Receita(100.0, "Teste", "05/04/2026"));


        int indiceInvalido = 5;
        assertThrows(IndexOutOfBoundsException.class, () -> {
            carteira.remTransacao(indiceInvalido);
        });
    }
}