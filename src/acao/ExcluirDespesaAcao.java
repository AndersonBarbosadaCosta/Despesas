package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Despesa;
import controle.Acao;
import dao.DespesaDAO;

public class ExcluirDespesaAcao implements Acao {

	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		String descricao = request.getParameter("despesas");

		try {
			DespesaDAO despesaDao = new DespesaDAO();
			Despesa despesa = despesaDao.getPesquisaDescricaoDespesa(descricao);
			despesaDao.excluiDespesa(despesa.getIdDespesa());

			response.sendRedirect("Sucesso.jsp");
		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();
		}

	}

}
