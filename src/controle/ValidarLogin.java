package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mysqlDAO.LoginDAO;
import Model.Login;


@WebServlet("/ValidarLogin")
public class ValidarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ValidarLogin() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("username");
		String senha = request.getParameter("password");
		//obejto usuario criar e setar os valors
		Login usuario = new Login();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		//aqui chama a função do banco
		LoginDAO dao = new LoginDAO();
		int validar = dao.validarLogin(usuario);
		if(validar== 1){
			request.setCharacterEncoding("UTF-8");
			System.out.println("DEU CERTOOOOOOOOOOOOO");
			RequestDispatcher view = request.getRequestDispatcher("Principal.html");
			view.forward(request, response);
		}
		else{
			request.setCharacterEncoding("UTF-8");
			System.out.println("ERROOOO");
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		}
	}

}
