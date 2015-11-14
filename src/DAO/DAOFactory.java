package DAO;

import mysqlDAO.MysqlClienteDAO;
import mysqlDAO.MysqlDAOFactory;
import mysqlDAO.MysqlDevolucaoDAO;
import mysqlDAO.MysqlLocacaoDAO;
import mysqlDAO.MysqlVeiculoDAO;



public abstract class DAOFactory {
	
		public static final int MYSQL = 1; 
		
		public abstract MysqlClienteDAO getClienteDAO();
		public abstract MysqlVeiculoDAO getVeiculoDAO();
		public abstract MysqlDevolucaoDAO getDevolucaoDAO();
		public abstract MysqlLocacaoDAO getLocacaoDAO();
		
		public static DAOFactory getDAOFactory(int qualFactory)
		{
			switch(qualFactory)
			{
			case MYSQL:
					return new MysqlDAOFactory();
			default:
					return null;
			}
			
		}
}
