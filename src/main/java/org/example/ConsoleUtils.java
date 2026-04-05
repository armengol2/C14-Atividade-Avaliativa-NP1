package org.example;

import java.util.Scanner;

public class ConsoleUtils {


    public static void esperarEnter(Scanner sc) {
        System.out.println("\n[ Pressione ENTER para continuar... ]");
        sc.nextLine();

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}