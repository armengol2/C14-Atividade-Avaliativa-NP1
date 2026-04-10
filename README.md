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
  Gemini, temos esse código de menu do nosso app de finanças e eu gostaria de mudar a lógica dele, transformando-a em uma estrutura switch. Também seria bom dar uma pequena modificada para deixá-lo mais ornamentado e polido em relação ao visual
  ```
- **Conclusão:** O Gemini trocou corretamente a lógica, que antes era baseada em if-else, para switch, sem apresentar problemas. Além disso, também deixou a parte visual mais bonita do que estava anteriormente. Alguns detalhes adicionados por nós foram mantidos, mas, no geral, o resultado ficou mais interessante e pólido.

#### Prompt 2
- **Objetivo:** Instalar as dependências corretas para o uso do Junit.
- **Prompt utilizado:**
  ```text
  Chat, baseado no nosso código, eu preciso alterar esse POM.XML para que possamos rodar testes unitários nesse projeto java
  ```
- **Conclusão:** Sem gerar nenhum tipo de dúvida, o ChatGPT rapidamente reconheceu todo o POM.xml e alterou oque era necessário para que os testes pudessem rodar sem problema.

#### Prompt 3
- **Objetivo:** Ajuda para começar os testes de fluxo e teste de extensão.
- **Prompt utilizado:**
  ```text
  Chat, agora que temos esse código, precisamos criar testes de fluxo e de extensão, me explique exatamente oque são cada um deles e diga alguns casos que você pensa ser pertinente testar. Com isso, faça um exemplo de como eles são feitos em Java(seu formato e características) para que possamos criar outros baseados nesses
  ```
- **Conclusão:** O ChatGPT foi bem direto nesse caso, ele separou uma parte inteira explicando apenas sobre os testes e então formulou 3 exemplos de cada um deles em seu formato Java, nos ajudando a entender rapidamente oque deveria ser feito e nos possibilitando usar o formato para criar os demais testes, com algumas ajudas posteriores.

#### Prompt 4
- **Objetivo:** Auxiliar da indentação e criação do pipeline.
- **Prompt utilizado:**
  ```text
  Gemini, preciso de ajuda para criar um pipeline de CI/CD no GitHub Actions para um projeto Java/Maven. Baseado no pipeline base que temos aqui e que já está fazendo a build e teste, oque mais precisamos rodar para que  2 dos Jobs executem em paralelo, com o deploy sendo feito de forma automática.
  ```
- **Conclusão:** Essa se tornou uma das partes mais complicadas, até então todo o pipeline estava rodando como deveria, ainda não sabíamos que o deploy não estava sendo realizado como deveria, mas resolvemos pular para a próxima etapa, apôs ver que na aba "actions" tudo estava correndo como deveria e que estava sendo gerado o relatório dos testes e .jar.

#### Prompt 5
- **Objetivo:** Notificação por Email.
- **Prompt utilizado:**
  ```text
  Como configurar o envio de e-mail na pipeline sem deixar o endereço de e-mail e a senha fixados (hardcoded) no código? Preciso usar variáveis de ambiente ou Secrets do GitHub.
  ```
- **Conclusão:** Para essa tarefa, usamos a extensão paga do Gemini, ele identificou o pipeline já funcional que mostramos para ele, e com uma modificação rápida e sutíl, programou toda a parte do código sobre o Email Hardcode, ainda viemos a demorar um bom tempo para configurar a parte do Actions no GitHub para que pudéssemos receber as notificações por Email.

#### Prompt 6
- **Objetivo:** Erros posteriores com a pipeline e o deploy.
- **Prompt utilizado:**
  ```text
  O build falhou com exit code 1 e o GitHub não encontrou os arquivos para os Artifacts. Como ajustar o working-directory e garantir que o relatório de testes e o arquivo .jar sejam armazenados corretamente, além disso, recebemos um feedback que o deploy precisa ser acessível, ele não está correto seguindo os padrões desse PDF"
  ```
- **Conclusão:** Usando a extensão do ChatGPT(códex) e oferencendo o feedback  com o PDF, o problema foi encontrado e resolvido, com novas linhas na parte do deploy sendo adicionados, apesar de alguns warnings que ainda não foram resolvidos, pois a IA não conseguiu resolve-los sem acabar quebrando alguma parte já funcional do código, estamos tentando resolver até o presente momento.
 
#### Prompt 7
- **Objetivo:** Criar um README condizente com o trabalho e com as estruturas para escrever os prompts.
- **Prompt utilizado:**
  ```text
  Chat, baseado no nosso projeto atual, precisamos de um README informativo e relevante sobre o projeto, com informações como utilidades do código, testes realizados, ambiente e ainda com uma estrutura no final dele sobre o uso de IA, não precisa colocar nada nele, apenas certifique-se que exista uma estrutura com os seguintes campos, algo como objetivo, prompt utilizado(deve ser em formato de text) e conclusão
  ```
- **Conclusão:** Com alguns defeitos e posteriormente foram reparados, o ChatGPT entregou um arquivo README até que muito satisfatório, colocando emojis, indentando e colocando tudo oque foi pedido de forma bem detalhada.
