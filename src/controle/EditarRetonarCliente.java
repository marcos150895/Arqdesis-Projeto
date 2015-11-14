package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Especialista;
import TO.ClienteTO;

/**
 * Servlet implementation class EditarRetonarCliente
 */
@WebServlet("/EditarRetonarCliente")
public class EditarRetonarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditarRetonarCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("TelaEditarRetornar" + "" + id);
		Especialista esp = new Especialista();
		ClienteTO to = esp.listarClienteId(id);
		request.setAttribute("cliente", to);
		request.setAttribute("id", id);
		RequestDispatcher view = request.getRequestDispatcher("EditarClienteForm.jsp");
		view.forward(request, response);
		
	}

}
