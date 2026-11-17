# Relatório de Utilização de Inteligência Artificial

## 1. Objetivo
Este documento detalha o processo de utilização de Inteligência Artificial (IA) como ferramenta de apoio para a resolução da questão **Logística**, sobre o padrão de projeto **Facade**. A IA atuou como assistente técnico (tutoria e *pair programming*): em vez de entregar a solução pronta, foi pedido um passo a passo, e cada etapa sugerida virou um commit correspondente no repositório.

## 2. Etapas de Desenvolvimento com Suporte da IA

### 2.1. Organização do repositório e plano de commits
- **Apoio da IA:** A IA analisou a estrutura do repositório da Lista 1 (`src`, `README.md`, `USO_IA.md`, `.gitignore` e commits com prefixos `docs`, `feat`, `test` e `fix`) e propôs a mesma organização para a Lista 2, dividindo a questão em passos, cada um com sua mensagem de commit.
- **Prompts utilizados:** "vamos nos basear na organização desse meu repositório passado: [link do repositório da Lista 1] vamos separar em passos para eu fazer o committ"

### 2.2. Validação da própria solução
Antes de commitar, a primeira versão escrita da fachada por nós foi submetida à IA para verificar se funcionaria. A IA apontou problemas que impediriam a compilação ou quebrariam a lógica do pedido:
- **Métodos `static`:** os serviços do enunciado são estáticos e devem ser chamados pela classe (`ServicoEstoque.isAvailable(...)`), sem instanciar objetos.
- **Retorno ignorado:** `isAvailable` e `makePayment` retornam `boolean`, mas a primeira versão não verificava esses retornos. Mesmo com estoque vazio ou pagamento recusado, o produto seria enviado.
- **Prompt utilizado:** "esse facade tambem funcion?" (seguido do código da nossa fachada)
- **Ajuste nosso:** A fachada final passou a verificar o retorno de cada serviço, usar chamadas estáticas e retornar `boolean` indicando se o pedido foi concluído. O padrão foi mantido (o cliente conhece só a fachada), e a lógica do pedido passou a fazer sentido.

### 2.3. Correção do versionamento (`.gitignore`)
- **Problema:** Mesmo com `.idea`, `out/` e `*.class` listados no `.gitignore`, esses arquivos continuaram aparecendo no GitHub.
- **Apoio da IA:** A IA explicou que o `.gitignore` só vale para arquivos ainda não rastreados. Como os arquivos já tinham sido commitados antes de o `.gitignore` ser atualizado, o Git continuava rastreando. A solução foi removê-los do índice com `git rm -r --cached .idea out`, sem apagar os arquivos locais, e commitar a correção.
- **Prompt utilizado:** "meu gitignore ta assim pq que ainda ta aparecendo no github?" (com a captura de tela do GitHub e o conteúdo do `.gitignore`)
- **Ajuste nosso:** Executamos a remoção do índice e criamos um commit de `fix`. Os arquivos continuam no histórico antigo, o que não atrapalha a leitura da evolução da solução. Nas próximas questões, o `.gitignore` será criado antes do primeiro commit (obs: o repositorio original com os erros de versionamento ainda existe mas esse foi criado de forma mais limpa para facilitar a leitura da evolução da solução via o histórico de commits).

### 2.4. Elaboração da Documentação
- **Apoio da IA:** Geração dos modelos de `README.md` (descrição do problema, mapeamento do padrão Facade e instruções de execução) e deste relatório.
- **Prompts utilizados:** "me ajude a criar o doc falando do uso da ia com base na nossa conversa real e Naquele modelO que usei na lista anterior"
