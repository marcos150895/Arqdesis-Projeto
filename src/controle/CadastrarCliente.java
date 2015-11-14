package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Cliente;
import Model.Especialista;


/**
 * Servlet implementation class CadastrarCliente
 */
@WebServlet("/CadastrarCliente")
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastrarCliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String cpf = request.getParameter("cpf");
		String rg = request.getParameter("rg");
		String validade_cnh = request.getParameter("mes_validade_cnh") +"/" + request.getParameter("ano_validade_cnh");
		String data_nasc = request.getParameter("nascimento");
		String genero = request.getParameter("genero");
		String ee = request.getParameter("ee");
		String telefone = request.getParameter("tel_res");
		String comercial = request.getParameter("telCom");
		String celular = request.getParameter("tel_cel");
		//obejto usuario criar e setar os valors
		Cliente cli = new Cliente();
		cli.setNome(nome);
		cli.setEmail(email);
		cli.setCpf(cpf);
		cli.setRg(rg);
		cli.setValidade_cnh(validade_cnh);
		cli.setData_nasc(data_nasc);
		cli.setGenero(genero);
		cli.setEe(ee);
		cli.setTelefone(telefone);
		cli.setComercial(comercial);
		cli.setCelular(celular);	
		
		//aqui chama a função do banco
		Especialista es = new Especialista();
		es.incluirCliente(cli);
		RequestDispatcher view = request.getRequestDispatcher("Principal.html");
		view.forward(request, response);
	}

}
