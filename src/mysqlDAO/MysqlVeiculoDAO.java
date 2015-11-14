package mysqlDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Veiculo;
import TO.VeiculoTO;

public class MysqlVeiculoDAO implements DAO.VeiculoDAO {

	public void inserirVeiculo(Veiculo veiculo) {
		String query = "insert into veiculo(grupo_veiculo,acessorios_veiculo,chassi_veiculo,"
				+ "placa_veiculo,cidade_veiculo,km_veiculo,estado_veiculo,modelo_veiculo,fabricante_veiculo,km_livre_veiculo,"
				+ "km_controlado_veiculo,status_veiculo,agencia_veiculo) values (?,?,?,?,?,?,?,?,?,?,?,?,?);";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, veiculo.getGrupo());
			pst.setString(2, veiculo.getAcessorio());
			pst.setString(3, veiculo.getChassi());
			pst.setString(4, veiculo.getPlaca());
			pst.setString(5, veiculo.getCidade());
			pst.setDouble(6, veiculo.getKm());
			pst.setString(7, veiculo.getEstado());
			pst.setString(8, veiculo.getModelo());
			pst.setString(9, veiculo.getFabricante());
			pst.setDouble(10, veiculo.getKm_livre());
			pst.setDouble(11, veiculo.getKm_controlado());
			pst.setString(12, veiculo.getStatus());
			pst.setString(13, veiculo.getAgencia());
			pst.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public VeiculoTO consultarVeiculoPlaca(String placa) {
		String query = "select * from veiculo where status_veiculo='Disponivel' and placa_veiculo like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, placa);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigo(rs.getInt(1));
				veiculo.setGrupo(rs.getString(2));
				veiculo.setAcessorio(rs.getString(3));
				veiculo.setChassi(rs.getString(4));
				veiculo.setPlaca(rs.getString(5));
				veiculo.setCidade(rs.getString(6));
				veiculo.setKm(rs.getDouble(7));
				veiculo.setEstado(rs.getString(8));
				veiculo.setModelo(rs.getString(9));
				veiculo.setFabricante(rs.getString(10));
				veiculo.setKm_livre(rs.getDouble(11));
				veiculo.setKm_controlado(rs.getDouble(12));
				veiculo.setStatus(rs.getString(13));
				veiculo.setAgencia(rs.getString(14));
				to.add(veiculo);
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

	public VeiculoTO consultarVeiculoFabricante(String fabricante) {
		String query = "select * from veiculo where status_veiculo='Disponivel' and fabricante_veiculo like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, fabricante);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigo(rs.getInt(1));
				veiculo.setGrupo(rs.getString(2));
				veiculo.setAcessorio(rs.getString(3));
				veiculo.setChassi(rs.getString(4));
				veiculo.setPlaca(rs.getString(5));
				veiculo.setCidade(rs.getString(6));
				veiculo.setKm(rs.getDouble(7));
				veiculo.setEstado(rs.getString(8));
				veiculo.setModelo(rs.getString(9));
				veiculo.setFabricante(rs.getString(10));
				veiculo.setKm_livre(rs.getDouble(11));
				veiculo.setKm_controlado(rs.getDouble(12));
				veiculo.setStatus(rs.getString(13));
				veiculo.setAgencia(rs.getString(14));
				to.add(veiculo);
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

	public VeiculoTO consultarVeiculoPreco(double preco) {
		String query = "select * from veiculo where status_veiculo='Disponivel' and km_veiculo = ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setDouble(1, preco);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigo(rs.getInt(1));
				veiculo.setGrupo(rs.getString(2));
				veiculo.setAcessorio(rs.getString(3));
				veiculo.setChassi(rs.getString(4));
				veiculo.setPlaca(rs.getString(5));
				veiculo.setCidade(rs.getString(6));
				veiculo.setKm(rs.getDouble(7));
				veiculo.setEstado(rs.getString(8));
				veiculo.setModelo(rs.getString(9));
				veiculo.setFabricante(rs.getString(10));
				veiculo.setKm_livre(rs.getDouble(11));
				veiculo.setKm_controlado(rs.getDouble(12));
				veiculo.setStatus(rs.getString(13));
				veiculo.setAgencia(rs.getString(14));
				to.add(veiculo);
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

	public VeiculoTO consultarVeiculoModelo(String modelo) {
		String query = "select * from veiculo where status_veiculo='Disponivel' and modelo_veiculo like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, modelo);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigo(rs.getInt(1));
				veiculo.setGrupo(rs.getString(2));
				veiculo.setAcessorio(rs.getString(3));
				veiculo.setChassi(rs.getString(4));
				veiculo.setPlaca(rs.getString(5));
				veiculo.setCidade(rs.getString(6));
				veiculo.setKm(rs.getDouble(7));
				veiculo.setEstado(rs.getString(8));
				veiculo.setModelo(rs.getString(9));
				veiculo.setFabricante(rs.getString(10));
				veiculo.setKm_livre(rs.getDouble(11));
				veiculo.setKm_controlado(rs.getDouble(12));
				veiculo.setStatus(rs.getString(13));
				veiculo.setAgencia(rs.getString(14));
				to.add(veiculo);
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

	public VeiculoTO consultarVeiculoId(int id) {
		String query = "select * from veiculo where id_veiculo = ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setCodigo(rs.getInt(1));
				veiculo.setGrupo(rs.getString(2));
				veiculo.setAcessorio(rs.getString(3));
				veiculo.setChassi(rs.getString(4));
				veiculo.setPlaca(rs.getString(5));
				veiculo.setCidade(rs.getString(6));
				veiculo.setKm(rs.getDouble(7));
				veiculo.setEstado(rs.getString(8));
				veiculo.setModelo(rs.getString(9));
				veiculo.setFabricante(rs.getString(10));
				veiculo.setKm_livre(rs.getDouble(11));
				veiculo.setKm_controlado(rs.getDouble(12));
				veiculo.setStatus(rs.getString(13));
				veiculo.setAgencia(rs.getString(14));
				to.add(veiculo);
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

	public void alterarVeiculo(Veiculo veiculo, int id) {
		try {

			String sql = "update veiculo set grupo_veiculo =?,acessorios_veiculo =?,"
					+ "chassi_veiculo =?,placa_veiculo =?,cidade_veiculo = ?,"
					+ "km_veiculo = ?,estado_veiculo = ?,modelo_veiculo =?,fabricante_veiculo = ?,"
					+ "km_livre_veiculo =?,km_controlado_veiculo = ?,"
					+ "status_veiculo = ?,agencia_veiculo =? where id_veiculo = ?;";
			Connection conn = null;
			PreparedStatement pst = null;
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(sql);

			pst.setString(1, veiculo.getGrupo());
			pst.setString(2, veiculo.getAcessorio());
			pst.setString(3, veiculo.getChassi());
			pst.setString(4, veiculo.getPlaca());
			pst.setString(5, veiculo.getCidade());
			pst.setDouble(6, veiculo.getKm());
			pst.setString(7, veiculo.getEstado());
			pst.setString(8, veiculo.getModelo());
			pst.setString(9, veiculo.getFabricante());
			pst.setDouble(10, veiculo.getKm_livre());
			pst.setDouble(11, veiculo.getKm_controlado());
			pst.setString(12, veiculo.getStatus());
			pst.setString(13, veiculo.getAgencia());
			pst.setInt(14, id);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("seu mané !! fez bobagem ! erro !! -->");
			e.printStackTrace();

		}
	}

	public void excluirVeiculo(int id) {
		String sqlDelete = "DELETE FROM veiculo WHERE id_veiculo = ?";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(sqlDelete);
			pst.setInt(1, id);
			pst.execute();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				System.out.print(e1.getStackTrace());
			}
		} finally {
			if (pst != null) {
				try {
					pst.close();
				} catch (SQLException e1) {
					System.out.print(e1.getStackTrace());
				}
			}
		}
	}

	// ----------------------------------------------------------------------
	// buscar veiculo por fabricante, modelo, cidade
	public VeiculoTO consultarVeiculoAndroid(String fabricante, String modelo,
			String cidade) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where fabricante_veiculo=? and modelo_veiculo=? and cidade_veiculo=? ;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, fabricante);
			pst.setString(2, modelo);
			pst.setString(3, cidade);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por fabricante, modelo
	public VeiculoTO consultarVeiculoAndroidFabricanteModelo(String fabricante,
			String modelo) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where fabricante_veiculo=? and modelo_veiculo=?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, fabricante);
			pst.setString(2, modelo);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// listar todos

	public VeiculoTO consultarVeiculoAndroidTodos() {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por fabricante, cidade
	public VeiculoTO consultarVeiculoAndroidFabricanteCidade(String fabricante,
			String cidade) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where fabricante_veiculo=? and cidade_veiculo=?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, fabricante);
			pst.setString(2, cidade);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por modelo, cidade
	public VeiculoTO consultarVeiculoAndroidModeloCidade(String modelo,
			String cidade) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where modelo_veiculo=? and cidade_veiculo=? ;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, modelo);
			pst.setString(2, cidade);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por cidade
	public VeiculoTO consultarVeiculoAndroidCidade(String cidade) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where cidade_veiculo=? ;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, cidade);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por modelo
	public VeiculoTO consultarVeiculoAndroidModelo(String modelo) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where modelo_veiculo=? ;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, modelo);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// buscar veiculo por fabricante
	public VeiculoTO consultarVeiculoAndroidFabricante(String fabricante) {
		String query = "select fabricante_veiculo, modelo_veiculo, cidade_veiculo, km_livre_veiculo, km_controlado_veiculo from veiculo where fabricante_veiculo=? ;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		VeiculoTO to = new VeiculoTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, fabricante);
			rs = pst.executeQuery();
			while (rs.next()) {
				Veiculo veiculo = new Veiculo();
				veiculo.setFabricante(rs.getString(1));
				veiculo.setModelo(rs.getString(2));
				veiculo.setCidade(rs.getString(3));
				veiculo.setKm_livre(rs.getDouble(4));
				veiculo.setKm_controlado(rs.getDouble(5));
				to.add(veiculo);
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

	// ----------------------------------------------------------------------

}
