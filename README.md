# Teste para recrutamento - JAVA

  ## Objetivo do teste:  Efetuar uma consulta no site receita (via código), exibir o status da situação cadastral  e salvar o html em banco

    ### Execução do teste
      1. Automatizar a extração da consulta à página: (https://servicos.receita.fazenda.gov.br/servicos/cpf/consultasituacao/ConsultaPublicaSonoro.asp?CPF=&NASCIMENTO=) 
      2. Trabalhar o Html, removendo todas as tags (somente as tags, não o texto dentro delas). Usar expressões regulares;
      3. Salvar o conteúdo do html na tabela tb_html (esta tabela tem 2 colunas: id int auto_increment e html varchar).
      4. Exibir a situação cadastral em um **JOptionPane** 

### Recomendações
* Utilizar um proxy para interceptar as cominucações entre o servidor (https://www.telerik.com/download/fiddler)
* Já esta incluso no código o servidor de banco de dados H2, que é iniciado junto com a aplicação;
* É possível acessar o banco de dados via browser pelo endereço: http://localhost:9099 (somente enquanto a aplicação estiver em execução), usando a string de conexão: **jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1**
* Utilizar biblioteca do apache hc: (https://hc.apache.org/httpcomponents-client-4.5.x/index.html), para efetuar as requisições http
* Utilizar a biblioteca jsoup: (https://jsoup.org/), para manipular o código html


### Observações:
* O banco de dados é em memória. Sempre que a aplicação terminar, os dados serão perdidos. 
* Não é nesessario resolver o captcha, apenas exibí-lo em um JOptionPane (inputDialog)
