package mysqlDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Model.Locacao;
import TO.LocacaoTO;

public class MysqlLocacaoDAO implements DAO.LocacaoDAO{

	public void inserirLocacao(Locacao loc) {
		String query = "INSERT INTO `locacao`"
				+ "(`id_cliente`,`id_veiculo`,`tarifa_locacao`,"
				+ "`estado_locacao`,`cidade_locacao`,`estado_devolucao`,`cidade_devolucao`,`pag_deb_banco`,`pag_deb_agencia`,`pag_deb_titular`,`pag_deb_cpf`,`pag_deb_conta`,"
				+ "`pag_cred_titular`,`pag_cred_cpf`,`pag_cred_n_cartao`,`pag_cred_cod_seguranca`,`pag_cred_data_validade`,"
				+ "`pag_cred_bandeira`,`data_horalocacao`,`data_devo`)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,"
				+ "?,?,?,?,?,?,CURDATE(),?);";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setInt(1, loc.getId_cliente());
			pst.setInt(2, loc.getId_veiculo());
			pst.setString(3, loc.getTarifa_locacao());
			pst.setString(4, loc.getEstado_locacao());
			pst.setString(5, loc.getCidade_locacao());
			pst.setString(6, loc.getEstado_devolucao());
			pst.setString(7, loc.getCidade_devolucao());
			pst.setString(8, loc.getPag_deb_banco());
			pst.setString(9, loc.getPag_deb_agencia());
			pst.setString(10, loc.getPag_deb_titular());
			pst.setString(11, loc.getPag_deb_cpf());
			pst.setString(12, loc.getPag_deb_conta());
			pst.setString(13, loc.getPag_cred_titular());
			pst.setString(14, loc.getPag_cred_cpf());
			pst.setString(15, loc.getPag_cred_n_cartao());
			pst.setString(16, loc.getPag_cred_cod_seguranca());
			pst.setString(17, loc.getPag_cred_data_validade());
			pst.setString(18, loc.getPag_cred_bandeira());
			pst.setString(19, loc.getData_devo());
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
	
	public LocacaoTO consultarLocaoCpf(String cpf) {
		String query = "select  l.id_locacao, l.id_cliente, l.id_veiculo, v.km_veiculo, l.estado_locacao, l.cidade_locacao,l.estado_devolucao, l.cidade_devolucao, l.data_horalocacao, l.data_devo, c.cpf_cliente from locacao l inner join cliente c on l.id_cliente=c.id_cliente inner join veiculo v on l.id_veiculo=v.id_veiculo where cpf_cliente= ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		LocacaoTO to = new LocacaoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, cpf);
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
				loc.setData_horalocacao(rs.getString(9));
				loc.setData_devo(rs.getString(10));
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

	public LocacaoTO consultarLocacaoData(String busca) {
		String query = "select l.id_locacao, l.id_veiculo, l.id_cliente, l.data_horalocacao, c.nome_cliente, c.cpf_cliente, v.modelo_veiculo, v.placa_veiculo, v.fabricante_veiculo from locacao l inner join cliente c on l.id_cliente=c.id_cliente inner join veiculo v on l.id_veiculo=v.id_veiculo where data_horalocacao like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		LocacaoTO to = new LocacaoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, busca);
			rs = pst.executeQuery();
			while (rs.next()) {
				Locacao locacao = new Locacao();
				locacao.setId_locacao(rs.getInt(1));
				locacao.setModelo_veiculo(rs.getString(7
						));
				locacao.setPlaca_veiculo(rs.getString(8));
				locacao.setFabricante_veiculo(rs.getString(9));
				locacao.setNome_cliente(rs.getString(5));
				locacao.setCpf_cliente(rs.getString(6));
				locacao.setData_horalocacao(rs.getString(4));
				to.add(locacao);
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
	


}
