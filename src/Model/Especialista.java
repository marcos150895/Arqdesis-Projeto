package Model;

import mysqlDAO.MysqlClienteDAO;
import mysqlDAO.MysqlDevolucaoDAO;
import mysqlDAO.MysqlLocacaoDAO;
import mysqlDAO.MysqlVeiculoDAO;
import DAO.DAOFactory;
import DAO.LocacaoDAO;
import TO.ClienteTO;
import TO.LocacaoTO;
import TO.VeiculoTO;

public class Especialista {
	private static final int MYSQL = 1;
	
	// ----------------------------------------------------------------------
	public VeiculoTO condicaoVeiculoAndroid(String fabricante, String modelo, String cidade) {
		VeiculoTO to = null;
		if (fabricante.length() > 0 && modelo.length() > 0 && cidade.length() > 0) {
			to = listarVeiculoAndroid(fabricante, modelo, cidade);
			
		} else if (fabricante.length() > 0 && modelo.length() > 0) {
			to = listarVeiculoAndroidFabricanteModelo(fabricante, modelo);
			
		} else if (fabricante.length() > 0 && cidade.length() > 0) {
			to = listarVeiculoAndroidFabricanteCidade(fabricante, cidade);
			
		} else if (modelo.length() > 0 && cidade.length() > 0) {
			to = listarVeiculoAndroidModeloCidade(modelo, cidade);
			
		} else if (fabricante.length() > 0) {
			to = listarVeiculoAndroidFabricante(fabricante);
			
		} else if (modelo.length() > 0) {
			to = listarVeiculoAndroidModelo(modelo);
			
		} else if (cidade.length() > 0) {
			to = listarVeiculoAndroidCidade(cidade);
		} else {
			to = listarVeiculoAndroidTodos();
		}
		return to;
	}
	
	public VeiculoTO listarVeiculoAndroidTodos() {
		VeiculoTO to = null;
		to = buscarVeiculoAndroidTodos();
		return to;
	}

	private VeiculoTO buscarVeiculoAndroidTodos() {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoAndroidTodos();
	}
	
	// buscar veiculo por fabricante, modelo, cidade
		public VeiculoTO listarVeiculoAndroid(String fabricante, String modelo, String cidade) {
			VeiculoTO to = null;
			to = buscarVeiculoAndroid(fabricante, modelo, cidade);
			return to;
		}

		private VeiculoTO buscarVeiculoAndroid(String fabricante, String modelo, String cidade) {
			MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
			return dao.consultarVeiculoAndroid(fabricante, modelo, cidade);
		}
		
	// buscar veiculo por fabricante, modelo
		public VeiculoTO listarVeiculoAndroidFabricanteModelo(String fabricante, String modelo) {
			VeiculoTO to = null;
			to = buscarVeiculoAndroidFabricanteModelo(fabricante, modelo);
			return to;
		}

		private VeiculoTO buscarVeiculoAndroidFabricanteModelo(String fabricante, String modelo) {
			MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
			return dao.consultarVeiculoAndroidFabricanteModelo(fabricante, modelo);
		}
		
	// buscar veiculo por fabricante, cidade
		public VeiculoTO listarVeiculoAndroidFabricanteCidade(String fabricante, String cidade) {
			VeiculoTO to = null;
			to = buscarVeiculoAndroidFabricanteCidade(fabricante, cidade);
			return to;
		}

		private VeiculoTO buscarVeiculoAndroidFabricanteCidade(String fabricante, String cidade) {
			MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
			return dao.consultarVeiculoAndroidFabricanteCidade(fabricante, cidade);
		}
		
	// buscar veiculo por modelo, cidade
		public VeiculoTO listarVeiculoAndroidModeloCidade(String modelo, String cidade) {
			VeiculoTO to = null;
			to = buscarVeiculoAndroidModeloCidade(modelo, cidade);
			return to;
		}

		private VeiculoTO buscarVeiculoAndroidModeloCidade(String modelo, String cidade) {
			MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
			return dao.consultarVeiculoAndroidModeloCidade(modelo, cidade);
		}
		
		// buscar veiculo por cidade
				public VeiculoTO listarVeiculoAndroidCidade(String cidade) {
					VeiculoTO to = null;
					to = buscarVeiculoAndroidCidade(cidade);
					return to;
				}

				private VeiculoTO buscarVeiculoAndroidCidade(String cidade) {
					MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
					return dao.consultarVeiculoAndroidCidade(cidade);
				}

				// buscar veiculo por modelo
				public VeiculoTO listarVeiculoAndroidModelo(String modelo) {
					VeiculoTO to = null;
					to = buscarVeiculoAndroidModelo(modelo);
					return to;
				}

				private VeiculoTO buscarVeiculoAndroidModelo(String modelo) {
					MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
					return dao.consultarVeiculoAndroidModelo(modelo);
				}
				
				// buscar veiculo por fabricante
				public VeiculoTO listarVeiculoAndroidFabricante(String fabricante) {
					VeiculoTO to = null;
					to = buscarVeiculoAndroidFabricante(fabricante);
					return to;
				}

				private VeiculoTO buscarVeiculoAndroidFabricante(String fabricante) {
					MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
					return dao.consultarVeiculoAndroidFabricante(fabricante);
				}
	
	// ----------------------------------------------------------------------
		
		
		
	//  Relatorio Dia
	public LocacaoTO listarLocacaoData(String busca) {
		LocacaoTO to = null;
		to = buscarLocacaoData(busca);
		return to;
	}
	
	// Relatorio Dia
	private LocacaoTO buscarLocacaoData(String busca) {
		MysqlLocacaoDAO dao = DAOFactory.getDAOFactory(MYSQL).getLocacaoDAO();
		return dao.consultarLocacaoData(busca);
	}

	// Incluir veiculo
	public void incluirVeiculo(Veiculo veiculo) {

		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		dao.inserirVeiculo(veiculo);

	}

	// buscar veiculo por id
	public VeiculoTO listarVeiculoId(int id) {
		VeiculoTO to = null;
		to = buscarVeiculoId(id);
		return to;
	}

	private VeiculoTO buscarVeiculoId(int id) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoId(id);
	}

	// Excluir Veiculo por id
	public void ExluirVeiculo(Veiculo veiculo) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		dao.excluirVeiculo(veiculo.getCodigo());
	}

	// alterar veiculo
	public void alterarVeiculo(Veiculo veiculo, int id) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		dao.alterarVeiculo(veiculo, id);
	}

	// buscar veiculo modelo
	public VeiculoTO listarVeiculosModelo(String modelo) {
		VeiculoTO to = null;
		to = buscarVeiculosModelo(modelo);
		return to;
	}

	private VeiculoTO buscarVeiculosModelo(String modelo) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoModelo(modelo);
	}

	// buscar veiculos preco
	public VeiculoTO listarVeiculosPreco(double preco) {
		VeiculoTO to = null;
		to = buscarVeiculosPreco(preco);
		return to;
	}

	private VeiculoTO buscarVeiculosPreco(double preco) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoPreco(preco);
	}

	// buscar veiculos placa
	public VeiculoTO listarVeiculosPlaca(String placa) {
		VeiculoTO to = null;
		to = buscarVeiculosPlaca(placa);
		return to;
	}

	private VeiculoTO buscarVeiculosPlaca(String placa) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoPlaca(placa);
	}

	// buscar veiculos Fabricante
	public VeiculoTO listarVeiculosFabricante(String fabricante) {
		VeiculoTO to = null;
		to = buscarVeiculosFabricantes(fabricante);
		return to;
	}

	private VeiculoTO buscarVeiculosFabricantes(String fabricante) {
		MysqlVeiculoDAO dao = DAOFactory.getDAOFactory(MYSQL).getVeiculoDAO();
		return dao.consultarVeiculoFabricante(fabricante);
	}

	// incluir cliente
	public void incluirCliente(Cliente cliente) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		dao.inserirCliente(cliente);
	}

	// excluir cliente

	public void ExluirCliente(Cliente cliente) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		dao.excluirCliente(cliente.getCodigoCliente());
	}

	// alterar cliente
	public void alterarCliente(Cliente cliente, int id) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		dao.alterarCliente(cliente, id);
	}

	// buscar cliente id
	public ClienteTO listarClienteId(int id) {
		ClienteTO to = null;
		to = buscarClientesId(id);
		return to;
	}

	private ClienteTO buscarClientesId(int id) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		return dao.consultarClienteId(id);
	}

	// buscar cliente cpf
	public ClienteTO listarClienteCpf(String busca) {
		ClienteTO to = null;
		to = buscarClientesCpf(busca);
		return to;
	}

	private ClienteTO buscarClientesCpf(String busca) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		return dao.consultarClienteCpf(busca);
	}

	// buscar cliente rg
	public ClienteTO listarClienteRg(String busca) {
		ClienteTO to = null;
		to = buscarClientesRg(busca);
		return to;
	}

	private ClienteTO buscarClientesRg(String busca) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		return dao.consultarClienteRg(busca);
	}

	// buscar cliente nome
	public ClienteTO listarClienteNome(String busca) {
		ClienteTO to = null;
		to = buscarClientesNome(busca);
		return to;
	}

	private ClienteTO buscarClientesNome(String busca) {
		MysqlClienteDAO dao = DAOFactory.getDAOFactory(MYSQL).getClienteDAO();
		return dao.consultarClienteNome(busca);
	}

	// devolucao vec disp(
	public void incluirVeiculoDisp(int id) {
		MysqlDevolucaoDAO dao = DAOFactory.getDAOFactory(MYSQL)
				.getDevolucaoDAO();
		dao.alterarVeiculoDisponivel(id);
	}

	// devolucao veiculo indisp não devia ser na devolucao)
	public void incluirVeiculoIndisp(int id) {
		MysqlDevolucaoDAO dao = DAOFactory.getDAOFactory(MYSQL)
				.getDevolucaoDAO();
		dao.alterarVeiculoIndisponivel(id);
	}
	
	// locacao busca por n locacao
	public LocacaoTO listarLocacao(int id) {
		LocacaoTO to = null;
		to = buscarLocacaoId(id);
		return to;
	}

	// locacao busca por n locacao
	private LocacaoTO buscarLocacaoId(int id) {
		MysqlLocacaoDAO dao = DAOFactory.getDAOFactory(MYSQL).getLocacaoDAO();
		return dao.consultarLocaoNumero(id);
	}
	
	// locacao busca por cpf
	public LocacaoTO listarLocacaoCpf(String cpf) {
		LocacaoTO to = null;
		to = buscarLocacaoCpf(cpf);
		return to;
	}

	// locacao busca por cpf
	private LocacaoTO buscarLocacaoCpf(String cpf) {
		MysqlLocacaoDAO dao = DAOFactory.getDAOFactory(MYSQL).getLocacaoDAO();
		return dao.consultarLocaoCpf(cpf);
	}
	

	// incluir locaçao
	public void incluirlocacao(Locacao locacao) {
		MysqlLocacaoDAO dao = DAOFactory.getDAOFactory(MYSQL).getLocacaoDAO();
		dao.inserirLocacao(locacao);
	}

	// incluir devolução
	public void incluirDevolucao(Devolucao devolucao) {
		MysqlDevolucaoDAO dao = DAOFactory.getDAOFactory(MYSQL)
				.getDevolucaoDAO();
		dao.inserirDevolucao(devolucao);
	}

	// listarDevoções

	public LocacaoTO listarDevolucaoLoc(int id) {
		LocacaoTO to = null;
		to = buscarDevolucaoLoc(id);
		return to;
	}

	private LocacaoTO buscarDevolucaoLoc(int id) {
		MysqlDevolucaoDAO dao = DAOFactory.getDAOFactory(MYSQL)
				.getDevolucaoDAO();
		return dao.consultarLocaoNumero(id);
	}

}
