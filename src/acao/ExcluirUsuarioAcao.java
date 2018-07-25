package acao;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Usuario;
import controle.Acao;
import dao.UsuarioDao;

public class ExcluirUsuarioAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String usuario = request.getParameter("usuario");

		try {

			UsuarioDao userDao = new UsuarioDao();
			Usuario user = userDao.pesquisaUsuarioLogin(usuario);
			userDao.excluiUsuario(user.getIdUsuario());

			response.sendRedirect("Sucesso.jsp");

		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
		}

	}

}
