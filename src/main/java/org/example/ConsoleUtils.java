package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ConsoleUtils {

    public static void esperarEnter(Scanner sc) {
        System.out.println("\n[ Pressione ENTER para continuar... ]");
        sc.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static LocalDate validarData(String dataTexto) throws DateTimeParseException {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dataTexto, formato);
    }

    public static void validarValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor deve ser maior que zero!");
        }
        if (valor > 1000000) {
            throw new IllegalArgumentException("Valor muito alto! O limite por transação é R$ 1.000.000,00.");
        }
    }

    public static void validarDescricao(String desc) {
        if (desc == null || desc.trim().length() < 3) {
            throw new IllegalArgumentException("A descrição deve ter pelo menos 3 caracteres!");
        }
    }

    public static void validarOpcaoMenu(int opcao) {
        if (opcao < 0 || opcao > 5) {
            throw new IllegalArgumentException("Opção inválida! Escolha um número entre 0 e 5.");
        }
    }
}