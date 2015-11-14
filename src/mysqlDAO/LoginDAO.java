package mysqlDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import Model.Login;

public class LoginDAO {
	public LoginDAO(){
		
	}
	public int validarLogin(Login usuario) {
		String query = "select `fun_valida_usuario`(?,?) as validou";
		Connection conn = null;
		int validou = 0;
		PreparedStatement pst = null;
		java.sql.ResultSet rs = null;
		
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, usuario.getLogin());
			pst.setString(2, usuario.getSenha());
			rs = pst.executeQuery();
			while (rs.next()) {
				validou = (rs.getInt(1));
			}

			return validou;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return validou;
	}
}
