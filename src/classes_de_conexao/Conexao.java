package classes_de_conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	
	public static Connection fazConexao() throws SQLException {
		
		
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
				
		return DriverManager.getConnection("jdbc:mysql://localhost/db_senhas","root", "!g81306748");
		
		
		} catch (ClassNotFoundException e) {
			
			throw new SQLException(e.getException());
			
		}
	}

}
