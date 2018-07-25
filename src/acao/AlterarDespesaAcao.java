package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Despesa;
import modelo.Usuario;
import controle.Acao;
import dao.DespesaDAO;
import dao.UsuarioDao;

public class AlterarDespesaAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		int idDespesa = Integer.parseInt(request.getParameter("idDespesa"));
		String alteraDescricao = request.getParameter("descricao");
		float alteraValor = Float.valueOf(request.getParameter("valor"));
		String alteraPrioridade = request.getParameter("prioridade");
		String alteraVencimento = request.getParameter("vencimento");
		String alteraLoginUsuario = request.getParameter("usuario");
		int alteraNumParcelas = Integer.parseInt(request
				.getParameter("numParcelas"));

		try {
			UsuarioDao userDao = new UsuarioDao();
			Usuario alteraUsuario = userDao
					.pesquisaUsuarioLogin(alteraLoginUsuario);

			Despesa despesaAlterada = new Despesa();
			despesaAlterada.setIdDespesa(idDespesa);
			despesaAlterada.setDescricao(alteraDescricao);
			despesaAlterada.setValor(alteraValor);
			despesaAlterada.setPrioridade(alteraPrioridade);
			despesaAlterada.setVencimento(alteraVencimento);
			despesaAlterada.setUsuario(alteraUsuario.getIdUsuario());
			despesaAlterada.setNumParcelas(alteraNumParcelas);
			DespesaDAO despesaDao = new DespesaDAO();
			despesaDao.alteraDespesa(despesaAlterada);

			response.sendRedirect("Sucesso.jsp");
		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();
		}

	}

}
