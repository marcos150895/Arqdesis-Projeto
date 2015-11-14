package DAO;

import Model.Veiculo;
import TO.VeiculoTO;

public interface VeiculoDAO {
	public abstract void inserirVeiculo(Veiculo veiculo);

	public abstract VeiculoTO consultarVeiculoPlaca(String placa);

	public abstract VeiculoTO consultarVeiculoFabricante(String fabricante);

	public abstract VeiculoTO consultarVeiculoPreco(double preco);

	public abstract VeiculoTO consultarVeiculoModelo(String modelo);

	public abstract VeiculoTO consultarVeiculoId(int id);
	
	public abstract void alterarVeiculo(Veiculo veiculo, int id);
	
	public abstract void excluirVeiculo(int id);
	
	// ----------------------------------------------------------------------
	// buscar veiculo por placa, modelo, cidade
	public abstract VeiculoTO consultarVeiculoAndroid(String placa, String modelo, String cidade);
	
	// buscar veiculo por placa, modelo
	public abstract VeiculoTO consultarVeiculoAndroidFabricanteModelo(String fabricante, String modelo);
		
	// buscar veiculo por placa, cidade
	public abstract VeiculoTO consultarVeiculoAndroidFabricanteCidade(String fabricante, String cidade);
	
	// buscar veiculo por modelo, cidade
	public abstract VeiculoTO consultarVeiculoAndroidModeloCidade(String modelo, String cidade);
	
	// buscar veiculo por cidade
	public abstract VeiculoTO consultarVeiculoAndroidCidade(String cidade);
	
	// buscar veiculo por modelo
	public abstract VeiculoTO consultarVeiculoAndroidModelo(String modelo);
		
	// buscar veiculo por fabricante
	public abstract VeiculoTO consultarVeiculoAndroidFabricante(String fabricante);
	
	public abstract VeiculoTO consultarVeiculoAndroidTodos();
}
