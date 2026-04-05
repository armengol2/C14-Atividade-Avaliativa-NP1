package org.example;
import java.util.Scanner;

import static org.example.ConsoleUtils.esperarEnter;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carteira carteira = new Carteira();
        int opcao = -1;

        System.out.println("==========================================");
        System.out.println("     BEM-VINDO AO SEU APP DE FINANÇAS      ");
        System.out.println("==========================================");

        while (opcao != 0) {
            System.out.println("\n      === MENU ===    ");
            System.out.println("[1] Adicionar Receita");
            System.out.println("[2] Adicionar Despesa");
            System.out.println("[3] Listar Transações");
            System.out.println("[4] Verificar Saldo");
            System.out.println("[5] Remover uma Transação");
            System.out.println("[0] Sair do App");
            System.out.println("-----------------------------");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1: {
                    System.out.print("Insira o valor da receita: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Insira a descrição da receita: ");
                    String desc = sc.nextLine();

                    System.out.print("Insira a data da receita(formato: 00/00/0000): ");
                    String data = sc.nextLine();

                    Receita receita = new Receita(valor, desc, data);
                    carteira.addTransacao(receita);

                    System.out.println("Receita adicionada!");
                    ConsoleUtils.esperarEnter(sc);
                    break;
                }

                case 2: {
                    System.out.print("Insira o valor da despesa: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Insira o valor da despesa:  ");
                    String desc = sc.nextLine();

                    System.out.print("Insira a data da despesa(formato: 00/00/0000): ");
                    String data = sc.nextLine();

                    Despesa despesa = new Despesa(valor, desc, data);
                    carteira.addTransacao(despesa);

                    System.out.println("Despesa adicionada!");
                    ConsoleUtils.esperarEnter(sc);
                    break;
                }

                case 3:
                    carteira.listTransacoes();
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 4:
                    System.out.println("Seu saldo atual é de: R$" + carteira.saldo());
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 5:
                    carteira.listTransacoes();
                    System.out.print("Insira o índice de transação que deseja remover: ");
                    int indice = sc.nextInt();
                    sc.nextLine();
                    carteira.remTransacao(indice);
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("Obrigado por escolher nosso app, volte sempre:)");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente!");
                    ConsoleUtils.esperarEnter(sc);
                    break;
            }
        }
        sc.close();
    }
}