package dao;

import java.sql.SQLException;
import java.util.List;

import modelo.Despesa;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import controle.HibernateUtility;

public class DespesaDAO {

	private Session sessao;
	private Transaction transacao;
	private Criteria consulta;

	public DespesaDAO() {

	}

	public void adicionaDespesa(Despesa despesa) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.save(despesa);
		transacao.commit();
		sessao.close();
	}

	public void alteraDespesa(Despesa despesa) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.update(despesa);
		transacao.commit();
		sessao.close();
	}

	// errado
	public void excluiDespesa(String descricao) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.delete(descricao);
		transacao.commit();
		sessao.close();

	}

	public void excluiDespesa(int id) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		Despesa despesa = new Despesa();
		despesa.setIdDespesa(id);
		sessao.delete(despesa);
		transacao.commit();
		sessao.close();
	}

	@SuppressWarnings("unchecked")
	public List<Despesa> getLista() throws SQLException {
		sessao = HibernateUtility.getSession();
		List<Despesa> despesas = sessao.createCriteria(Despesa.class).list();
		sessao.close();
		return despesas;
	}

	public Despesa pesquisaUmaDespesa(int id) throws SQLException {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		Despesa despesa = (Despesa) sessao.load(Despesa.class, id);
		transacao.commit();
		return despesa;
	}

	public Despesa getPesquisaDescricaoDespesa(String descricao)
			throws SQLException {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		consulta = sessao.createCriteria(Despesa.class);
		consulta.add(Expression.like("descricao", descricao + "%"));
		Despesa despesa = (Despesa) consulta.uniqueResult();
		sessao.close();
		return despesa;
	}

}
