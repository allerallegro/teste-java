package br.com.partnergroup.robo.test.app;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.partnergroup.robo.test.bd.H2Server;

public class App {
	
	
	/*
	 * Objetivo do teste:  obter o html de uma página, manipulá-lo e salvá-lo no banco de dados
	 * 
	 * 1) Obter o Html da página http://www.solhorticenter.com.br/ofertas/' e armazenar em variável
	 * 2) Trabalhar o Html, removendo todas as tags (somente as tags, não o texto dentro delas). Usar expressões regulares
	 * 3) Salvar o conteúdo do html na tabela tb_html (esta tabela tem 2 colunas: id int auto_increment e html varchar)
	 */
	
	/*
	 * Já esta incluso no código o servidor de banco de dados H2, que é iniciado junto com a aplicação;
	 * É possível acessar o banco de dados via browser pelo endereço: http://localhost:9099 (somente enquanto a aplicação estiver
	 * em execução), usando a string de conexão: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
	 * É recomendável obter a pagina usando a biblioteca do apache hc: https://hc.apache.org/httpcomponents-client-4.5.x/index.html
	 * Obs.: O banco de dados é em memória. Sempre que a aplicação terminar, os dados serão perdidos. 
	 */
	

	public static void main(String[] args) throws SQLException, Exception {
		try(H2Server server=new H2Server()){
			server.start();
			/*
			 * String de conexão com o banco de dados: jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1
			 * (Usuário 'sa' sem senha 
			 */
			
			/*
			 * 
			 * Implementar a partir daqui!
			 * 
			 */
			
			
			
			
			
			
			
			JOptionPane.showMessageDialog(null, "Clique em ok para finalizar");
		}

	}

}
