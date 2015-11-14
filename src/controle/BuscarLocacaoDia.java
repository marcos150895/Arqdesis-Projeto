package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Especialista;
import TO.LocacaoTO;

/**
 * Servlet implementation class BuscarLocacaoDia
 */
@WebServlet("/BuscarLocacaoDia")
public class BuscarLocacaoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarLocacaoDia() {
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
		request.setCharacterEncoding("UTF-8");
		String pesquise = "%" + request.getParameter("pesquise") + "%";
		Especialista esp = new Especialista();
		LocacaoTO to = null;
		to = esp.listarLocacaoData(pesquise);
		System.out.println(pesquise+"\n" + pesquise);
		
		
		
		request.setAttribute("listaLocacao", to);
		RequestDispatcher view = request
				.getRequestDispatcher("RelatorioDiaPronto.jsp");
		view.forward(request, response);
	}

}
