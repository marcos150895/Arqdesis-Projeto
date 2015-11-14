package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Devolucao;
import Model.Especialista;
import Model.Locacao;
import Model.Veiculo;
import TO.LocacaoTO;
import TO.VeiculoTO;

/**
 * Servlet implementation class DevolucaoPronta
 */
@WebServlet("/DevolucaoPronta")
public class DevolucaoPronta extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DevolucaoPronta() {
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
		String idLocacao = request.getParameter("locacao");
		String cidadeDev = request.getParameter("cidadeDev");
		String estadoDev = request.getParameter("estadoDev");
		double total = Double.parseDouble(request.getParameter("km"));

		Especialista esp = new Especialista();
		LocacaoTO to = esp.listarDevolucaoLoc(Integer.parseInt(idLocacao));
		Locacao loc = to.getLocacao(0);
		VeiculoTO vecTO = esp.listarVeiculoId(loc.getId_veiculo());
		Veiculo vec = vecTO.getVeiculo(0);

		if (cidadeDev == loc.getCidade_devolucao()
				&& estadoDev == loc.getEstado_devolucao()) {
			if (loc.getTarifa_locacao() == "km livre") {
				total *= vec.getKm_livre();
			} else {
				total *= vec.getKm_controlado();
			}
		} else {
			if (loc.getTarifa_locacao() == "km livre") {
				total *= vec.getKm_livre() * 1.3;
			} else {
				total *= vec.getKm_controlado() * 1.3;
			}

		}
		//inserindo a devolucao
		Devolucao dev = new Devolucao();
		dev.setCodigoLocacao(Integer.parseInt(idLocacao));
		dev.setTotal(total);
		dev.setCidade(cidadeDev);
		dev.setEstado(estadoDev);		
		esp.incluirDevolucao(dev);
		esp.incluirVeiculoDisp(Integer.parseInt(idLocacao));
		
		request.setAttribute("total", total);
		request.setAttribute("idlocacao", idLocacao);
		request.setAttribute("cidadeDev", cidadeDev);
		request.setAttribute("estadoDev", estadoDev);
		request.setAttribute("km", request.getParameter("km"));
		RequestDispatcher view = request.getRequestDispatcher("DevolucaoPronto.jsp");
		view.forward(request, response);
	}

}
