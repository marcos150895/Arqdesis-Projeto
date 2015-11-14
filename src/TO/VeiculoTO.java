package TO;

import java.io.Serializable;
import java.util.ArrayList;

import Model.*;

public class VeiculoTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private ArrayList<Veiculo> listaVeiculos;

	public VeiculoTO() {
		listaVeiculos = new ArrayList<Veiculo>();
	}

	public void add(Veiculo Veiculo) {
		listaVeiculos.add(Veiculo);
	}

	public Veiculo getVeiculo(int index) {
		return listaVeiculos.get(index);

	}

	public boolean remove(Veiculo Veiculo) {
		return (listaVeiculos.remove(Veiculo));
	}

	public ArrayList<Veiculo> getlistaVeiculos() {
		return listaVeiculos;
	}

}
