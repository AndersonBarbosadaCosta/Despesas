package acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Despesa;
import modelo.Usuario;
import controle.Acao;
import dao.DespesaDAO;
import dao.UsuarioDao;

public class GravarDespesaAcao implements Acao {
	// tratar erros
	@Override
	public void executarAcao(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String descricao = request.getParameter("descricao");
		float valor = Float.valueOf(request.getParameter("valor"));
		String prioridade = request.getParameter("prioridade");
		String vencimento = request.getParameter("vencimento");
		String loginUsuario = request.getParameter("usuario");
		int numParcelas = Integer.parseInt(request.getParameter("numParcelas"));

		try {
			UsuarioDao userDao = new UsuarioDao();
			Usuario usuario = userDao.pesquisaUsuarioLogin(loginUsuario);

			Despesa despesa = new Despesa();
			despesa.setDescricao(descricao);
			despesa.setValor(valor);
			despesa.setPrioridade(prioridade);
			despesa.setVencimento(vencimento);
			despesa.setUsuario(usuario.getIdUsuario());
			despesa.setNumParcelas(numParcelas);

			DespesaDAO despesaDao = new DespesaDAO();
			despesaDao.adicionaDespesa(despesa);

			response.sendRedirect("Sucesso.jsp");
		} catch (Exception e) {
			response.sendRedirect("Erro.jsp");
			e.printStackTrace();
		}

	}

}
