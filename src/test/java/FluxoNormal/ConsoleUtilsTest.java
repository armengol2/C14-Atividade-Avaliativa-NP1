package FluxoNormal;

import org.example.ConsoleUtils;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConsoleUtilsTest {

    @Test
    public void deveExibirMensagemParaEnter() {
        String saida = executarEsperarEnter();

        assertTrue(saida.contains("[ Pressione ENTER para continuar... ]"));
    }

    @Test
    public void deveExibirComandoDeLimpeza() {
        String saida = executarEsperarEnter();

        assertTrue(saida.contains("\033[H\033[2J"));
    }

    private String executarEsperarEnter() {
        Scanner scanner = new Scanner("\n");
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream saidaOriginal = System.out;

        try {
            System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
            ConsoleUtils.esperarEnter(scanner);
            return buffer.toString(StandardCharsets.UTF_8);
        } finally {
            System.setOut(saidaOriginal);
            scanner.close();
        }
    }
}
