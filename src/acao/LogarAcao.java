package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modelo.Usuario;
import controle.Acao;
import dao.UsuarioDao;

public class LogarAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String senha = request.getParameter("senha");
		String login = request.getParameter("login");

		try {
			UsuarioDao userDao = new UsuarioDao();
			Usuario usuario = userDao.pesquisaUsuario(login, senha);

			if (usuario != null) {

				HttpSession session = request.getSession();
				session.setAttribute("logon", usuario.getLogin());
				response.sendRedirect("BemVindo.jsp");
			} else {
				response.sendRedirect("Login.jsp");
			}

		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();
		}

	}

}
