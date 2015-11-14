package DAO;

import Model.Locacao;
import TO.LocacaoTO;

public interface LocacaoDAO {
	public abstract void inserirLocacao(Locacao loc);

	public abstract LocacaoTO consultarLocaoNumero(int id);
	
	public abstract LocacaoTO consultarLocacaoData(String busca);
	
	public abstract LocacaoTO consultarLocaoCpf(String cpf);

}
