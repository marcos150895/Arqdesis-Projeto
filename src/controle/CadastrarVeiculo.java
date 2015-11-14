package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Especialista;
import Model.Veiculo;

/**
 * Servlet implementation class CadastrarVeiculo
 */
@WebServlet("/CadastrarVeiculo")
public class CadastrarVeiculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarVeiculo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Veiculo veiculo = new Veiculo();
		veiculo.setGrupo(request.getParameter("grupo"));
		veiculo.setAcessorio(request.getParameter("acessorio"));
		veiculo.setAgencia(request.getParameter("agencia"));
		veiculo.setChassi(request.getParameter("chassi"));
		veiculo.setCidade(request.getParameter("cidade"));
		veiculo.setEstado(request.getParameter("estado"));
		veiculo.setFabricante(request.getParameter("fabricante"));
		veiculo.setGrupo(request.getParameter("grupo"));
		veiculo.setKm(Double.parseDouble(request.getParameter("km")));
		veiculo.setKm_livre(Double.parseDouble(request.getParameter("kmlivre")));
		veiculo.setKm_controlado(Double.parseDouble(request.getParameter("kmrodado")));
		veiculo.setModelo(request.getParameter("modelo"));
		veiculo.setPlaca(request.getParameter("placa"));
		veiculo.setStatus(request.getParameter("status"));
		Especialista es = new Especialista();
		es.incluirVeiculo(veiculo);
		RequestDispatcher view = request.getRequestDispatcher("Principal.html");
		view.forward(request, response);
	}

}
