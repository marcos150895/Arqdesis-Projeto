package DAO;

import Model.Devolucao;
import TO.LocacaoTO;

public interface DevolucaoDAO {
	public abstract void inserirDevolucao(Devolucao dev);

	public abstract LocacaoTO consultarLocaoNumero(int id);

	public abstract void alterarVeiculoIndisponivel(int id);

	public abstract void alterarVeiculoDisponivel(int id);

}
