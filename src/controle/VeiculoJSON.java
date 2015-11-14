package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Especialista;
import Model.Veiculo;
import TO.VeiculoTO;

/**
 * Servlet implementation class VeiculoJSON
 */
@WebServlet("/VeiculoJSON")
public class VeiculoJSON extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VeiculoJSON() {
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
		request.setCharacterEncoding("UTF-8");
		// response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		try {
			String modelo = request.getParameter("modelo");
			String cidade = request.getParameter("cidade");
			String fabricante = request.getParameter("fabricante");
			System.out.println(fabricante);
			Especialista esp = new Especialista();
			VeiculoTO lista = esp.condicaoVeiculoAndroid(fabricante,modelo, cidade);
			PrintWriter out = response.getWriter();
			ArrayList<Veiculo> vei = lista.getlistaVeiculos();
			String t = Model.VeiculoJSON.listToJSon(vei);
			out.println(t);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
