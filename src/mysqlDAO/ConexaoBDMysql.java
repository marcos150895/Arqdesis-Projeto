package mysqlDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBDMysql {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection conectar() throws SQLException {
		
		return DriverManager
				.getConnection("jdbc:mysql://localhost:3306/bdprojeto?user=root&password=marcos");
	}

	public static void desconectar(Connection conn) throws SQLException {
		conn.close();
	}
}
