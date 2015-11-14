package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.*;

/**
 * Servlet implementation class Locacao
 */
@WebServlet("/Locacao")
public class LocacaoControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LocacaoControle() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Locacao loc = new Locacao();
		loc.setId_cliente(Integer.parseInt( request.getParameter("cliente")));
		loc.setId_veiculo(Integer.parseInt( request.getParameter("veiculo")));
		loc.setData_devo(request.getParameter("datadev"));
		loc.setTarifa_locacao(request.getParameter("iCheckTarifa"));
		loc.setEstado_locacao(request.getParameter("estadoLoc"));
		loc.setCidade_locacao(request.getParameter("cidadeLoc"));
		loc.setEstado_devolucao(request.getParameter("estadoDev"));
		loc.setCidade_devolucao(request.getParameter("cidadeDev"));
		loc.setPag_deb_banco(request.getParameter("banco"));
		loc.setPag_deb_agencia(request.getParameter("agencia"));
		loc.setPag_deb_titular(request.getParameter("nome"));
		loc.setPag_deb_cpf(request.getParameter("cpf"));
		loc.setPag_deb_conta(request.getParameter("conta"));	
		loc.setPag_cred_titular(request.getParameter("nomeCred"));
		loc.setPag_cred_cpf(request.getParameter("cpfCred"));
		loc.setPag_cred_n_cartao(request.getParameter("cartao"));
		loc.setPag_cred_cod_seguranca(request.getParameter("codigoSeg"));
		loc.setPag_cred_data_validade(request.getParameter("dataVal"));
		loc.setPag_cred_bandeira(request.getParameter("iCheck"));
		Especialista esp = new Especialista();
		esp.incluirlocacao(loc);
		esp.incluirVeiculoIndisp(Integer.parseInt( request.getParameter("veiculo")));
		RequestDispatcher view = request.getRequestDispatcher("Principal.html");
		view.forward(request, response);
		

		
		
	}

}
