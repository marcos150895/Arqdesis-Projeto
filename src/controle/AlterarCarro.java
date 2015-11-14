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
 * Servlet implementation class AlterarCarro
 */
@WebServlet("/AlterarCarro")
public class AlterarCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarCarro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x = request.getParameter("codigo");
		int id =Integer.parseInt(x);
		System.out.println(x  + "  Servelt alterara");
		String modelo = request.getParameter("modelo");
		String placa = request.getParameter("placa");
		String chassi = request.getParameter("chassi");
		String estado = request.getParameter("estado");
		String cidade = request.getParameter("cidade");
		String fabricante = request.getParameter("fabricante");
		Double km = Double.parseDouble(request.getParameter("km"));
		Double kmlivre = Double.parseDouble(request.getParameter("kmlivre"));
		Double kmrodado = Double.parseDouble(request.getParameter("kmrodado"));
		String grupo = request.getParameter("grupo");
		String acessorio = request.getParameter("acessorio");
		String status = request.getParameter("status");
		String agencia = request.getParameter("agencia");
		System.out.println(modelo);
		// obejto usuario criar e setar os valors
		Veiculo vl = new Veiculo();
		vl.setModelo(modelo);
		vl.setPlaca(placa);
		vl.setChassi(chassi);
		vl.setEstado(estado);
		vl.setCidade(cidade);
		vl.setFabricante(fabricante);
		vl.setKm(km);
		vl.setKm_livre(kmlivre);
		vl.setKm_controlado(kmrodado);
		vl.setGrupo(grupo);
		vl.setAcessorio(acessorio);
		vl.setStatus(status);
		vl.setAgencia(agencia);
		Especialista esp = new Especialista();
		esp.alterarVeiculo(vl,id );
		System.out.println("Alterando");
		RequestDispatcher view = request.getRequestDispatcher("Principal.html");
		view.forward(request, response);
		
	}

}
