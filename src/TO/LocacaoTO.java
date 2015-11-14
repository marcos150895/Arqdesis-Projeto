package TO;

import java.io.Serializable;
import java.util.ArrayList;
import Model.Locacao;

public class LocacaoTO implements Serializable{
		
	private static final long serialVersionUID = 1L;
		private ArrayList<Locacao> listaLocacao;

		public LocacaoTO() {
			listaLocacao = new ArrayList<Locacao>();
		}

		public void add(Locacao locacao) {
			listaLocacao.add(locacao);
		}
		public Locacao getLocacao(int index){
			return listaLocacao.get(index);
			
		}
		public boolean remove(Locacao locacao) {
			return (listaLocacao.remove(locacao));
		}

		public ArrayList<Locacao> getlistaLocacao() {
			return listaLocacao;
		}

}

