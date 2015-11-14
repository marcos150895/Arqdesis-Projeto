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
 * Servlet implementation class ExcluirCarro
 */
@WebServlet("/ExcluirCarro")
public class ExcluirCarro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirCarro() {
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
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("TelaExcluir " + "" + id);
		Especialista esp  = new Especialista();
		Veiculo vl = new Veiculo();
		vl.setCodigo(id);
		esp.ExluirVeiculo(vl);
		RequestDispatcher view = request.getRequestDispatcher("Principal.html");
		view.forward(request, response);
	}

}
