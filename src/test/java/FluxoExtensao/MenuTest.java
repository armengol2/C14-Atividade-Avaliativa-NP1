package FluxoExtensao;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MenuTest {

    @Test
    void testeErroOpcaoForaDoIntervalo() {
        int opcaoInexistente = 9;

        assertThrows(IllegalArgumentException.class, () -> {
            ConsoleUtils.validarOpcaoMenu(opcaoInexistente);
        });
    }
}