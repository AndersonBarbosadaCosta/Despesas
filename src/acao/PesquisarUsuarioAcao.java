package acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controle.Acao;

public class PesquisarUsuarioAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		RequestDispatcher rd = request
				.getRequestDispatcher("/ListarUsuarios.jsp");
		try {
			rd.forward(request, response);
		} catch (ServletException e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();

		}

	}

}
