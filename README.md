# Teste para recrutamento


## Objetivo do teste:  obter o html de uma página, manipulá-lo e salvá-lo no banco de dados

### Execução do teste
1. Obter o Html da página (http://help.websiteos.com/websiteos_br/example_of_a_simple_html_page.htm) e armazenar em variável;
2. Trabalhar o Html, removendo todas as tags (somente as tags, não o texto dentro delas). Usar expressões regulares;
3. Salvar o conteúdo do html na tabela tb_html (esta tabela tem 2 colunas: id int auto_increment e html varchar).

### Observações
* Já esta incluso no código o servidor de banco de dados H2, que é iniciado junto com a aplicação;
* É possível acessar o banco de dados via browser pelo endereço: http://localhost:9099 (somente enquanto a aplicação estiver em execução), usando a string de conexão: **jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1**
* É recomendável obter a pagina usando a biblioteca do apache hc: https://hc.apache.org/httpcomponents-client-4.5.x/index.html
* Obs.: O banco de dados é em memória. Sempre que a aplicação terminar, os dados serão perdidos. 
