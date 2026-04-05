package FluxoExtensao;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValorExcessivoTest {

    @Test
    void testeErroValorAcimaDoLimite() {
        double valorMuitoAlto = 2000000.0;

        assertThrows(IllegalArgumentException.class, () -> {
            ConsoleUtils.validarValor(valorMuitoAlto);
        });
    }
}