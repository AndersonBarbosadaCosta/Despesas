package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import controle.Acao;
import dao.UsuarioDao;

public class AlterarUsuarioAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		int idUsuario = Integer.parseInt(request.getParameter("selUsuario"));
		String alteraLogin = request.getParameter("usuario");
		String alteraSenha = request.getParameter("senhaUser");
		try {

			Usuario alteraUsuario = new Usuario();
			alteraUsuario.setIdUsuario(idUsuario);
			alteraUsuario.setLogin(alteraLogin);
			alteraUsuario.setSenha(alteraSenha);
			UsuarioDao userDao = new UsuarioDao();
			userDao.alteraUsuario(alteraUsuario);

			response.sendRedirect("Sucesso.jsp");

		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();
		}

	}
}
