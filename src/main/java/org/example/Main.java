package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carteira carteira = new Carteira();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("----- BEM VINDO A0 SEU APP DE FINANÇAS ----");
            System.out.println("=== MENU ===");
            System.out.println("Insira o seguinte número no menu para realizar sua opção...");
            System.out.println("Adicionar receita -------->.1");
            System.out.println("Adicionar despesa -------->.2");
            System.out.println("Listar transações -------->.3");
            System.out.println("Verificar saldo ---------->.4");
            System.out.println("Remover uma transação ---->.5");
            System.out.println("Fechar app --------------->.0");
            System.out.print("Escolha uma opção-> ");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                System.out.print("valor da receita-");
                double valor = sc.nextDouble();
                sc.nextLine();

                System.out.print("descrição-");
                String desc = sc.nextLine();

                System.out.print("Insira a data(formato-00/00/0000)-");
                String data = sc.nextLine();

                Receita receita = new Receita(valor, desc, data);
                carteira.addTransacao(receita);

                System.out.println("Receita adicionada!");
            }
            else if (opcao == 2) {
                System.out.print("valor da despesa- ");
                double valor = sc.nextDouble();
                sc.nextLine();

                System.out.print("descrição- ");
                String desc = sc.nextLine();

                System.out.print("Insira a data(formato-00/00/0000)-");
                String data = sc.nextLine();

                Despesa despesa = new Despesa(valor, desc, data);
                carteira.addTransacao(despesa);

                System.out.println("Despesa adicionada!");
            }
            else if (opcao == 3) {
                carteira.listTransacoes();
            }
            else if (opcao == 4) {
                System.out.println("Saldo atual--> R$ " + carteira.saldo());
            }
            else if (opcao == 5) {
                carteira.listTransacoes();
                System.out.print("Insira o índice da transação que deseja remover-> ");
                int indice = sc.nextInt();
                sc.nextLine();
                carteira.remTransacao(indice);
            }
            else if (opcao == 0) {
                System.out.println("Obrigado por escolher nosso app, volte sempre:)");
            }
            else {
                System.out.println("Sentimos muito, mas sua opção ainda não existe:(");
            }
        }
        sc.close();
    }
}