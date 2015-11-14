package mysqlDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Devolucao;
import Model.Locacao;
import TO.LocacaoTO;

public class MysqlDevolucaoDAO {
	public void inserirDevolucao(Devolucao dev) {
		String query = "insert into devolucao(id_locacao,estado_dev,cidade_dev,total)values(?,?,?,?);";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setInt(1, dev.getCodigoLocacao());
			pst.setString(2, dev.getEstado());
			pst.setString(3, dev.getCidade());
			pst.setDouble(4, dev.getTotal());
			pst.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public LocacaoTO consultarLocaoNumero(int id) {
		String query = "select * from locacao where id_locacao = ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		LocacaoTO to = new LocacaoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Locacao loc = new Locacao();
				loc.setId_locacao(rs.getInt(1));
				loc.setId_cliente(rs.getInt(2));
				loc.setId_veiculo(rs.getInt(3));
				loc.setTarifa_locacao(rs.getString(4));
				loc.setEstado_locacao(rs.getString(5));
				loc.setCidade_locacao(rs.getString(6));
				loc.setEstado_devolucao(rs.getString(7));
				loc.setCidade_devolucao(rs.getString(8));
				loc.setData_horalocacao(rs.getString(20));
				loc.setData_devo(rs.getString(21));
				to.add(loc);
			}
		} catch (SQLException sqe) {
			sqe.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					ConexaoBDMysql.desconectar(conn);
				} catch (SQLException sqe) {
					sqe.printStackTrace();
				}
			}

		}
		return to;
	}
	
	public void alterarVeiculoIndisponivel(int id) {
		try {

			
			String sql = "update veiculo set status_veiculo = 'Nao Disponivel' where id_veiculo = ?;";
			Connection conn = null;
			PreparedStatement pst = null;
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(sql);

			pst.setInt(1, id);
			
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("seu mané !! fez bobagem ! erro !! -->");
			e.printStackTrace();

		}
	}
	
	public void alterarVeiculoDisponivel(int id) {
		try {

			
			String sql = "update veiculo set status_veiculo = 'Disponivel' where id_veiculo = ?;";
			Connection conn = null;
			PreparedStatement pst = null;
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(sql);

			pst.setInt(1, id);
			
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("seu mané !! fez bobagem ! erro !! -->");
			e.printStackTrace();

		}
	}
	
}
