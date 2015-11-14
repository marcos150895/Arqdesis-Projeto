package mysqlDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Cliente;
import TO.ClienteTO;

public class MysqlClienteDAO implements DAO.ClienteDAO {

	public void inserirCliente(Cliente cli) {
		String query = "insert into cliente (nome_cliente,email_cliente,cpf_cliente,validade_cnh_cliente,datanasc_cliente,genero_cliente,"
				+ "ee_cliente,telefone_res,telefone_com,telefone_cel,rg_cliente) values(?,?,?,?,?,?,?,?,?,?,?);";
		Connection conn = null;
		PreparedStatement pst = null;
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);
			pst.setString(1, cli.getNome());
			pst.setString(2, cli.getEmail());
			pst.setString(3, cli.getCpf());
			pst.setString(4, cli.getValidade_cnh());
			pst.setString(5, cli.getData_nasc());
			pst.setString(6, cli.getGenero());
			pst.setString(7, cli.getEe());
			pst.setString(8, cli.getTelefone());
			pst.setString(9, cli.getComercial());
			pst.setString(10, cli.getCelular());
			pst.setString(11, cli.getRg());
			pst.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	public void excluirCliente(int id) {
		String sqlDelete = "DELETE FROM cliente WHERE id_cliente = ?";
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


	public ClienteTO consultarClienteCpf(String busca) {
		String query = "select * from cliente where cpf_cliente like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ClienteTO to = new ClienteTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, busca);
			rs = pst.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setEmail(rs.getString(3));
				cliente.setCpf(rs.getString(4));
				cliente.setValidade_cnh(rs.getString(5));
				cliente.setData_nasc(rs.getString(6));
				cliente.setGenero(rs.getString(7));
				cliente.setEe(rs.getString(8));
				cliente.setTelefone(rs.getString(9));
				cliente.setCelular(rs.getString(10));
				cliente.setComercial(rs.getString(11));
				cliente.setRg(rs.getString(12));
				to.add(cliente);
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

	public ClienteTO consultarClienteNome(String busca) {
		String query = "select * from cliente where nome_cliente like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ClienteTO to = new ClienteTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, busca);
			rs = pst.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setEmail(rs.getString(3));
				cliente.setCpf(rs.getString(4));
				cliente.setValidade_cnh(rs.getString(5));
				cliente.setData_nasc(rs.getString(6));
				cliente.setGenero(rs.getString(7));
				cliente.setEe(rs.getString(8));
				cliente.setTelefone(rs.getString(9));
				cliente.setCelular(rs.getString(10));
				cliente.setComercial(rs.getString(11));
				cliente.setRg(rs.getString(12));
				to.add(cliente);
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

	public ClienteTO consultarClienteRg(String busca) {
		String query = "select * from cliente where rg_cliente like ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ClienteTO to = new ClienteTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setString(1, busca);
			rs = pst.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setEmail(rs.getString(3));
				cliente.setCpf(rs.getString(4));
				cliente.setValidade_cnh(rs.getString(5));
				cliente.setData_nasc(rs.getString(6));
				cliente.setGenero(rs.getString(7));
				cliente.setEe(rs.getString(8));
				cliente.setTelefone(rs.getString(9));
				cliente.setCelular(rs.getString(10));
				cliente.setComercial(rs.getString(11));
				cliente.setRg(rs.getString(12));
				to.add(cliente);
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

	public ClienteTO consultarClienteId(int id) {
		String query = "select * from cliente where id_cliente = ?;";

		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		ClienteTO to = new ClienteTO();
		try {
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(query);

			// pst.setString(1, parametro);
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setCodigoCliente(rs.getInt(1));
				cliente.setNome(rs.getString(2));
				cliente.setEmail(rs.getString(3));
				cliente.setCpf(rs.getString(4));
				cliente.setValidade_cnh(rs.getString(5));
				cliente.setData_nasc(rs.getString(6));
				cliente.setGenero(rs.getString(7));
				cliente.setEe(rs.getString(8));
				cliente.setTelefone(rs.getString(9));
				cliente.setCelular(rs.getString(10));
				cliente.setComercial(rs.getString(11));
				cliente.setRg(rs.getString(12));
				to.add(cliente);
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

	public void alterarCliente(Cliente cliente, int id) {
		try {

			
			String sql = "update cliente set nome_cliente =?,email_cliente =?,"
					+ "cpf_cliente =?,validade_cnh_cliente =?,datanasc_cliente = ?,"
					+ "genero_cliente = ?,ee_cliente = ?,telefone_res =?,telefone_cel = ?,"
					+ "telefone_com = ?,rg_cliente =? where id_cliente = ?;";
			Connection conn = null;
			PreparedStatement pst = null;
			conn = ConexaoBDMysql.conectar();
			pst = conn.prepareStatement(sql);

			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getEmail());
			pst.setString(3, cliente.getCpf());
			pst.setString(4, cliente.getValidade_cnh());
			pst.setString(5, cliente.getData_nasc());
			pst.setString(6, cliente.getGenero());
			pst.setString(7, cliente.getEe());
			pst.setString(8, cliente.getTelefone());
			pst.setString(9, cliente.getCelular());
			pst.setString(10, cliente.getComercial());
			pst.setString(11, cliente.getRg());
			pst.setInt(12, id);
			pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("seu mané !! fez bobagem ! erro !! -->");
			e.printStackTrace();

		}
	}

}