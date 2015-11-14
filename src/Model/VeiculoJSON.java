package Model;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class VeiculoJSON {

	public static String listToJSon(ArrayList<Veiculo> lista) {
		JSONArray vetor = new JSONArray();
		for (Veiculo veiculo : lista) {
			JSONObject object = new JSONObject();
			try {
				object.put("Modelo", veiculo.getModelo());
				object.put("fabricante", veiculo.getFabricante());
				object.put("Valor km controlado",veiculo.getKm_controlado());
				object.put("Valor km Livre", veiculo.getKm_livre());			
				vetor.put(object);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return vetor.toString();
	}
}