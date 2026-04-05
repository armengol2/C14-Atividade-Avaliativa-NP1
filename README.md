# 💰 FinanceApp - Gestão de Finanças Pessoais
### Disciplina: C14-Atividade-Avaliativa-NP1

**Desenvolvedores:**
* Rodrigo Armengol de Oliveira
* Pedro Henrique Oliveira Costa (Pedroca)

## 📋 Sobre o Projeto
Este projeto é um aplicativo de finanças desenvolvido em Java com foco no controle básico de entradas e saídas de dinheiro via terminal. A proposta principal é permitir o registro de receitas e despesas, consulta de saldo e gestão de movimentações com foco em **estabilidade e robustez de código**.

## 🚀 Funcionalidades
- **Adicionar Receita/Despesa:** Registro de entradas e saídas.
- **Listagem de Transações:** Visualização detalhada do histórico.
- **Consulta de Saldo:** Cálculo automático em tempo real.
- **Remoção de Transação:** Exclusão baseada em índice.
- **Sistema Blindado:** Tratamento de exceções para evitar crashes.

## ✅ Testes de Fluxo Normal
O projeto conta com **10 testes unitários (JUnit 5)** focados em cenários esperados de funcionamento, validando o comportamento correto das principais classes do sistema:

1. **CarteiraTest - Saldo com receita e despesa:** Valida se uma carteira com uma receita de 1000 e uma despesa de 200 retorna saldo final igual a 800.
2. **CarteiraTest - Saldo com apenas receitas:** Valida se duas receitas de 1000 e 500 resultam em saldo final igual a 1500.
3. **ReceitaTest - Aplicação no saldo:** Verifica se `aplicarNoSaldo()` retorna o valor positivo da receita.
4. **ReceitaTest - Armazenamento de dados:** Verifica se valor, descrição e data informados no construtor são mantidos corretamente.
5. **DespesaTest - Aplicação no saldo:** Verifica se `aplicarNoSaldo()` retorna o valor negativo da despesa.
6. **DespesaTest - Armazenamento de dados:** Verifica se valor, descrição e data informados no construtor são mantidos corretamente.
7. **TransacaoTest - Dados do construtor:** Valida se uma subclasse de `Transacao` armazena corretamente valor, descrição e data.
8. **TransacaoTest - Implementação da subclasse:** Valida se o método `aplicarNoSaldo()` de uma subclasse simples retorna o valor esperado.
9. **ConsoleUtilsTest - Mensagem de pausa:** Verifica se o método `esperarEnter()` exibe a mensagem para pressionar ENTER.
10. **ConsoleUtilsTest - Limpeza de tela:** Verifica se o método `esperarEnter()` envia o comando de limpeza da tela após a pausa.

## 🧪 Testes de Fluxo de Extensão (Garantia de Qualidade)
O projeto conta com **10 testes unitários (JUnit 5)** focados em fluxos de exceção, garantindo que o sistema não falhe diante de entradas inesperadas:

1. **Data Inválida:** Valida o formato `dd/mm/aaaa`.
2. **Índice Inexistente:** Bloqueia remoção de itens fora do intervalo da lista.
3. **Valor Negativo/Zero:** Impede registros financeiros inválidos.
4. **Descrição Insuficiente:** Exige descrições claras (mínimo 3 caracteres).
5. **Menu Inválido:** Valida se a opção escolhida está entre 0 e 5.
6. **Saldo Insuficiente:** Impede que despesas superem o saldo disponível na carteira.
7. **Remoção em Lista Vazia:** Bloqueia a tentativa de exclusão quando não há dados.
8. **Tipo de Dado Incorreto:** Trata entradas de texto (String) em campos numéricos.
9. **Limite de Segurança:** Define um teto máximo de R$ 1.000.000,00 por operação.
10. **Prevenção de Duplicidade:** Detecta e bloqueia transações idênticas em sequência (Anti-Spam).

## 🤖 Uso de Inteligência Artificial (IA)
Este projeto foi desenvolvido com suporte de IA para apoio na arquitetura de QA, estruturação de testes e documentação.

### Como a IA foi utilizada:
- **Design de Casos de Teste:** Colaboração para identificar fluxos normais e fluxos de extensão.
- **Estruturação de Testes:** Implementação de classes JUnit 5 seguindo boas práticas.
- **Tratamento de Exceções:** Apoio na validação de cenários inválidos.
- **Boas Práticas de Versionamento:** Orientação para uso de **Conventional Commits** e Git Flow.
- **Edição do README:** Organização e refinamento da documentação do projeto.

### Exemplos de Prompts utilizados:
> "Quais os fluxos de extensão mais comuns em um app de finanças para garantir dados limpos?"
> "Como criar um teste unitário que valide se o usuário está tentando remover um índice inexistente?"
> "Como estruturar testes de fluxo normal para Carteira, Receita, Despesa e Transação?"
> "Atualize o README do projeto."

## 🛠️ Tecnologias
- **Java 17+**
- **JUnit 5** (Testes Unitários)
- **Maven** (Gerenciamento de dependências)
- **Git/GitHub**
