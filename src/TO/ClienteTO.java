package TO;

import java.io.Serializable;
import java.util.ArrayList;

import Model.Cliente;

public class ClienteTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
		private ArrayList<Cliente> lista;

		public ClienteTO() {
			lista = new ArrayList<Cliente>();
		}

		public void add(Cliente cliente) {
			lista.add(cliente);
		}
		public Cliente getCliente(int index){
			return lista.get(index);
			
		}
		public boolean remove(Cliente cliente) {
			return (lista.remove(cliente));
		}

		public ArrayList<Cliente> getLista() {
			return lista;
		}

}

