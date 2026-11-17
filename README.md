# Questão 4 - Lista 2 Padrões de Projeto OO
**Alunos:** Maria Letícia de Sousa Barboza e Caio Vinícius de Santana Gomes

Solução da questão **Logística**, aplicando o padrão **Facade**.

## O Problema
Ao fazer um pedido numa loja virtual, três serviços independentes precisam ser chamados na ordem certa:
estoque, pagamento e remessa. O cliente não deveria conhecer nem coordenar cada subsistema.

## Mapeamento do Padrão
- **Facade (`PedidoFacade`):** oferece uma interface simples, `fazerPedido(Produto)`, e coordena os subsistemas.
- **Subsistemas (`ServicoEstoque`, `ServicoPagamento`, `ServicoRemessa`):** executam o trabalho real. Não sabem da existência da fachada.
- **Cliente (`FacadeTestDrive`):** usa apenas a fachada, sem acessar os serviços diretamente.
- **Classe de apoio (`Produto`):** representa o item do pedido.

## Fluxo do pedido
1. Verifica o estoque. Se indisponível, cancela.
2. Processa o pagamento. Se recusado, cancela.
3. Envia o produto.

## Como Executar
```bash
cd src
javac *.java
java FacadeTestDrive