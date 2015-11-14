package TO;

import java.io.Serializable;
import java.util.ArrayList;
import Model.Devolucao;


public class DevolucaoTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
		private ArrayList<Devolucao> listaDevolucao;

		public DevolucaoTO() {
			listaDevolucao = new ArrayList<Devolucao>();
		}

		public void add(Devolucao devolucao) {
			listaDevolucao.add(devolucao);
		}
		public Devolucao getDevolucao(int index){
			return listaDevolucao.get(index);
			
		}
		public boolean remove(Devolucao devolucao) {
			return (listaDevolucao.remove(devolucao));
		}

		public ArrayList<Devolucao> getlistaDevolucao() {
			return listaDevolucao;
		}

}