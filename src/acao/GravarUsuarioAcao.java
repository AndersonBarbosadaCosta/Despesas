package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import controle.Acao;
import dao.UsuarioDao;

public class GravarUsuarioAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String login = request.getParameter("usuario");
		String senha = request.getParameter("senhaUser");
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		if (usuario != null) {
			try {
				UsuarioDao userDao = new UsuarioDao();
				userDao.adicionaUsuario(usuario);

			} catch (Exception e) {

				e.printStackTrace();
			}
			response.sendRedirect("Sucesso.jsp?sucesso=gravarUsuario");

		} else {
			response.sendRedirect("index.jsp");
		}

	}
}
