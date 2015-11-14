package mysqlDAO;

import DAO.DAOFactory;



public class MysqlDAOFactory extends DAOFactory
{
	
	public MysqlClienteDAO getClienteDAO() {
		return new MysqlClienteDAO();
	}

	
	public MysqlVeiculoDAO getVeiculoDAO() {
		return new MysqlVeiculoDAO();
	}


	@Override
	public MysqlDevolucaoDAO getDevolucaoDAO() {
		// TODO Auto-generated method stub
		return new MysqlDevolucaoDAO();
	}


	@Override
	public MysqlLocacaoDAO getLocacaoDAO() {
		// TODO Auto-generated method stub
		return new MysqlLocacaoDAO();
	}


}
