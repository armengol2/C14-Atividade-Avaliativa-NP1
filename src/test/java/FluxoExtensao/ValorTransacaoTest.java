package FluxoExtensao;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValorTransacaoTest {

    @Test
    void testeErroValorNegativo() {
        double valorInvalido = -50.0;

        assertThrows(IllegalArgumentException.class, () -> {
            ConsoleUtils.validarValor(valorInvalido);
        }, "O sistema não deve aceitar valores negativos ou zero!");
    }
}