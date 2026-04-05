package FluxoExtensao;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DescricaoTest {

    @Test
    void testeErroDescricaoVazia() {

        String descInvalida = "   ";

        assertThrows(IllegalArgumentException.class, () -> {
            ConsoleUtils.validarDescricao(descInvalida);
        });
    }
}