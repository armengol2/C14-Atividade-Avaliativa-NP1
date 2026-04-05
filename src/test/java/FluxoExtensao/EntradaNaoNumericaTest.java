package FluxoExtensao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EntradaNaoNumericaTest {

    @Test
    void testeErroEntradaTextoEmCampoNumerico() {
        String entradaInvalida = "abc";

        assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(entradaInvalida);
        });
    }
}