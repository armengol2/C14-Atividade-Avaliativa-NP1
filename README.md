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
Durante o desenvolvimento deste projeto, Inteligências Artificiais, como ChatGPT, Gemini e outros, foram utilizadas como apoio para tirar dúvidas, estruturar testes, revisar partes da documentação e sugerir melhorias em boas práticas de desenvolvimento. Abaixo estão registrados os prompts utilizados e uma avaliação breve dos resultados.

### Registro de Prompts

#### Prompt 1
- **Objetivo:** Trocar a lógica do menu de if-else para switch.
- **Prompt utilizado:**
  ```text
  Gemini, temos esse código de menu do nosso app de finanças e eu gostaria de mudar a lógica dele, transformando-a em uma estrutura switch. Também seria bom dar uma pequena modificada para deixá-lo mais ornamentado e polido em relação ao visual.
  ```
- **Conclusão:** O Gemini trocou corretamente a lógica, que antes era baseada em if-else, para switch, sem apresentar problemas. Além disso, também deixou a parte visual mais bonita do que estava anteriormente. Alguns detalhes adicionados por nós foram mantidos, mas, no geral, o resultado ficou mais interessante e polido.
  
