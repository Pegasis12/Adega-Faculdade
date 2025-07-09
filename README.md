# AdegaPP - Sistema de Vendas com Interface Gráfica (Java + Swing)

Projeto desenvolvido como trabalho final da disciplina de **Desenvolvimento Orientado a Objetos** na faculdade.  
O sistema simula o processo de cadastro de cliente e venda de bebidas alcoólicas com interface gráfica usando Java e Swing.

---

## Funcionalidades

- Cadastro completo de cliente com validação de campos:
  - Nome, CPF, RG, data de nascimento, telefone, endereço (bairro, rua, número, complemento, CEP)
- Interface gráfica interativa com botões:
  - `Começar`: inicia o processo de cadastro e compra
  - `Sair`: encerra o sistema
- Simulação de venda com as seguintes opções de bebidas:
  - Heineken (R$2,50)
  - Budweiser (R$2,00)
  - Kaiser (R$3,00)
  - Petra (R$2,15)
- Pagamento com escolha de método:
  - Cartão (até 4x sem juros)
  - Boleto (geração de código aleatório)
  - Pix (simulado)

---

## Tecnologias Utilizadas

- Java SE
- Swing (JOptionPane e JFrame)
- POO (Herança, Encapsulamento, Instanciação)

---

## Estrutura de Classes

| Classe    | Função Principal |
|-----------|------------------|
| `Main`    | Classe principal que cria a interface gráfica e controla o fluxo |
| `cliente` | Armazena os dados do cliente |
| `venda`   | Lida com os dados da compra e pagamento |
| `bebidas` | Define os preços de cada bebida |

---

## Como Executar

1. Clone o repositório ou copie os arquivos `.java` para sua IDE Java (ex: Eclipse, IntelliJ ou NetBeans).
2. Compile os arquivos.
3. Execute a classe `Main.java`.
4. Utilize a interface gráfica que será exibida.

---

## Conceitos Trabalhados

- Programação Orientada a Objetos (POO)
- Encapsulamento de dados
- Interface gráfica com Swing
- Validação de entrada de dados
- Simulação de carrinho e cálculo de total
- Lógica de pagamento

---

## Desenvolvido por

Trabalho acadêmico desenvolvido na disciplina de **Desenvolvimento Orientado a Objetos**  
Instituição: *FUMEC*  
Alunos: *Pablo e Pedro*

