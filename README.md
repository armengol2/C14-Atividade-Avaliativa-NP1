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
- **Sistema Blindado:** Tratamento completo de exceções para evitar crashes.

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
Este projeto foi desenvolvido com suporte do **Google Gemini** para a arquitetura de QA e lógica de validação.

### Como a IA foi utilizada:
- **Design de Casos de Teste:** Colaboração para identificar os 10 fluxos de extensão.
- **Estruturação de Testes:** Implementação de classes JUnit 5 seguindo padrões de Clean Code.
- **Tratamento de Exceções:** Refinamento dos blocos `try-catch` na classe `Main`.
- **Boas Práticas de Versionamento:** Orientação para uso de **Conventional Commits** e Git Flow.
- **Edição do README: ** Conclusão do **README** do projeto.

### Exemplos de Prompts utilizados:
> "Quais os fluxos de extensão mais comuns em um app de finanças para garantir dados limpos?"
> "Como criar um teste unitário que valide se o usuário está tentando remover um índice inexistente?"
> "Como implementar um método de busca de transações duplicadas para evitar cliques duplos?"
> "Atualize o README do projeto."

## 🛠️ Tecnologias
- **Java 17+**
- **JUnit 5** (Testes Unitários)
- **Maven** (Gerenciamento de dependências)
- **Git/GitHub**
