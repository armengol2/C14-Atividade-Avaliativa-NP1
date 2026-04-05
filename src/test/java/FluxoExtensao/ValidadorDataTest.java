package FluxoExtensao; // O nome deve ser igual à sua pasta

import org.example.ConsoleUtils; // Importa sua classe original
import org.junit.jupiter.api.Test;
import java.time.format.DateTimeParseException;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidadorDataTest {

    @Test
    void testeErroDataSemBarras() {

        String dataInvalida = "05042026";

        assertThrows(DateTimeParseException.class, () -> {
            ConsoleUtils.validarData(dataInvalida);
        }, "Deveria ter lançado erro por falta de barras!");
    }
}