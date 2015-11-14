package Model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import TO.LocacaoTO;

/**
 * Servlet implementation class BuscarLocacao
 */
@WebServlet("/BuscarLocacao")
public class BuscarLocacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarLocacao() {
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
		String parametro = request.getParameter("parametro");
		String pesquise = "%" + request.getParameter("pesquise") + "%";
		Especialista esp = new Especialista();
		LocacaoTO to = new LocacaoTO();
		if (parametro.equals("CPF")) {
			to = esp.listarLocacaoCpf(request.getParameter("pesquise"));
		}
		if (parametro.equals("Numero Locacao")) {
			to = esp.listarLocacao(Integer.parseInt(request.getParameter("pesquise")));
		}
		
		request.setAttribute("listaLoc", to);
		RequestDispatcher view = request
				.getRequestDispatcher("ConsultarLocacaoPronto.jsp");
		view.forward(request, response);
		
	}

}
