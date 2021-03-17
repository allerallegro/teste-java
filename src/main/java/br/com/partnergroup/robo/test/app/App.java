package br.com.partnergroup.robo.test.app;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.partnergroup.robo.test.bd.H2Server;

public class App {
	
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
