package DAO;

import Model.Cliente;
import TO.ClienteTO;

public interface ClienteDAO {
	public abstract void inserirCliente(Cliente cli);

	public abstract void excluirCliente(int id);

	public abstract ClienteTO consultarClienteCpf(String busca);

	public abstract ClienteTO consultarClienteNome(String busca);

	public abstract ClienteTO consultarClienteRg(String busca);

	public abstract ClienteTO consultarClienteId(int id);

	public abstract void alterarCliente(Cliente cliente, int id);

}
