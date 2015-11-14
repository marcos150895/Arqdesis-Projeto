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
 * Servlet implementation class BuscarClienteLocacao
 */
@WebServlet("/BuscarClienteLocacao")
public class BuscarClienteLocacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarClienteLocacao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String parametro = request.getParameter("parametro");
		String pesquise = "%" + request.getParameter("pesquise") + "%";
		Especialista esp = new Especialista();
		ClienteTO to = null;
		if (parametro.equals("CPF")) {
			to = esp.listarClienteCpf(pesquise);
		}
		if (parametro.equals("RG")) {
			to = esp.listarClienteRg(pesquise);
		}
		if (parametro.equals("Nome")) {
			to = esp.listarClienteNome(pesquise);
		}
		
		
		System.out.println(request.getParameter("idcarro")+" pagina de erro");
		
		request.setAttribute("listaClientes", to);
		RequestDispatcher view = request
				.getRequestDispatcher("ConsultarClienteLocacaoPronto.jsp?idcarro=" + request.getParameter("idcarro"));
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		this.doGet(request, response);
	}

}
