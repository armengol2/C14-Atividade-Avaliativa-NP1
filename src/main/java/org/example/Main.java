package org.example;

import java.util.Scanner;
import java.time.format.DateTimeParseException;

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

            try {
                String entradaMenu = sc.nextLine();
                opcao = Integer.parseInt(entradaMenu);
                ConsoleUtils.validarOpcaoMenu(opcao);
            } catch (NumberFormatException e) {
                System.out.println("\n[!] ERRO: Digite apenas números no menu.");
                opcao = -1;
                continue;
            } catch (IllegalArgumentException e) {
                System.out.println("\n[!] ERRO: " + e.getMessage());
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1: {
                    try {
                        System.out.print("Insira o valor da receita: ");
                        double valor = Double.parseDouble(sc.nextLine());
                        ConsoleUtils.validarValor(valor);

                        System.out.print("Insira a descrição da receita: ");
                        String desc = sc.nextLine();
                        ConsoleUtils.validarDescricao(desc);

                        System.out.print("Insira a data (dd/mm/aaaa): ");
                        String dataInput = sc.nextLine();
                        ConsoleUtils.validarData(dataInput);

                        Receita receita = new Receita(valor, desc, dataInput);
                        carteira.addTransacao(receita);
                        System.out.println("\n[OK] Receita adicionada com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("\n[!] ERRO: O valor deve ser um número.");
                    } catch (IllegalStateException | IllegalArgumentException | DateTimeParseException e) {
                        System.out.println("\n[!] ERRO DE VALIDAÇÃO: " + e.getMessage());
                    }
                    ConsoleUtils.esperarEnter(sc);
                    break;
                }

                case 2: {
                    try {
                        System.out.print("Insira o valor da despesa: ");
                        double valor = Double.parseDouble(sc.nextLine());
                        ConsoleUtils.validarValor(valor);

                        System.out.print("Insira a descrição da despesa: ");
                        String desc = sc.nextLine();
                        ConsoleUtils.validarDescricao(desc);

                        System.out.print("Insira a data da despesa (dd/mm/aaaa): ");
                        String dataInput = sc.nextLine();
                        ConsoleUtils.validarData(dataInput);

                        Despesa despesa = new Despesa(valor, desc, dataInput);
                        carteira.addTransacao(despesa);
                        System.out.println("\n[OK] Despesa adicionada com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("\n[!] ERRO: O valor deve ser um número válido.");
                    } catch (IllegalStateException | IllegalArgumentException | DateTimeParseException e) {
                        System.out.println("\n[!] ERRO: " + e.getMessage());
                    }
                    ConsoleUtils.esperarEnter(sc);
                    break;
                }

                case 3:
                    carteira.listTransacoes();
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 4:
                    System.out.println("Seu saldo atual é de: R$ " + String.format("%.2f", carteira.saldo()));
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 5:
                    if (carteira.getTransacoes().isEmpty()) {
                        System.out.println("\n[!] AVISO: A carteira está vazia! Não há o que remover.");
                    } else {
                        try {
                            carteira.listTransacoes();
                            System.out.print("Insira o índice da transação que deseja remover: ");
                            int indice = Integer.parseInt(sc.nextLine());
                            carteira.remTransacao(indice);
                            System.out.println("\n[OK] Transação removida!");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("\n[!] ERRO: Esse índice não existe na lista.");
                        } catch (NumberFormatException e) {
                            System.out.println("\n[!] ERRO: Digite um número válido para o índice.");
                        } catch (IllegalStateException e) {
                            System.out.println("\n[!] AVISO: " + e.getMessage());
                        }
                    }
                    ConsoleUtils.esperarEnter(sc);
                    break;

                case 0:
                    System.out.println("\nObrigado por escolher nosso app, volte sempre :)");
                    break;
            }
        }
        sc.close();
    }
}