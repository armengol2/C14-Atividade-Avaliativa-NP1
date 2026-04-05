package FluxoNormal;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsoleUtilsTest {

    @Test
    void deveExibirMensagemAoEnter() {
        String saida = executarEsperarEnter();

        assertTrue(saida.contains("[ Pressione ENTER para continuar... ]"));
    }

    @Test
    void deveEnviaLimpezaDeTelaAposReceberEnter() {
        String saida = executarEsperarEnter();

        assertTrue(saida.contains("\033[H\033[2J"));
    }

    private String executarEsperarEnter() {
        ByteArrayInputStream entrada = new ByteArrayInputStream("\n".getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream bufferSaida = new ByteArrayOutputStream();
        PrintStream saidaOriginal = System.out;

        try (Scanner scanner = new Scanner(entrada, StandardCharsets.UTF_8)) {
            System.setOut(new PrintStream(bufferSaida, true, StandardCharsets.UTF_8));
            ConsoleUtils.esperarEnter(scanner);
            return bufferSaida.toString(StandardCharsets.UTF_8);
        } finally {
            System.setOut(saidaOriginal);
        }
    }
}
