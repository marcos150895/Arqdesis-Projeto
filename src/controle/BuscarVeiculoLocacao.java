package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Especialista;
import TO.VeiculoTO;

/**
 * Servlet implementation class BuscarVeiculoLocacao
 */
@WebServlet("/BuscarVeiculoLocacao")
public class BuscarVeiculoLocacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarVeiculoLocacao() {
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
		// TODO Auto-generated method stub
				request.setCharacterEncoding("UTF-8");
				String parametro = request.getParameter("parametro");
				String pesquise = "%" + request.getParameter("pesquise") + "%";
				Especialista esp = new Especialista();
				VeiculoTO to = null;
				if (parametro.equals("Placa")) {
					to = esp.listarVeiculosPlaca(pesquise);
				}
				if (parametro.equals("Fabricante")) {
					to = esp.listarVeiculosFabricante(pesquise);
				}
				if (parametro.equals("Preco")) {
					to = esp.listarVeiculosPreco(Double.parseDouble(request.getParameter("pesquise")));
				}
				if (parametro.equals("Modelo")) {
					to = esp.listarVeiculosModelo(pesquise);
				}
				System.out.println(parametro+"\n" + pesquise);
				
				
				
				request.setAttribute("listaCarros", to);
				RequestDispatcher view = request
						.getRequestDispatcher("BuscarVeiculoLocacaoPronto.jsp?idcliente=" + request.getParameter("idcliente"));
				view.forward(request, response);
	}

}
