package dao;

import java.util.List;

import modelo.Usuario;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;

import controle.HibernateUtility;

public class UsuarioDao {

	private Transaction transacao;
	private Session sessao;
	private Criteria consulta;

	public UsuarioDao() {

	}

	public void adicionaUsuario(Usuario usuario) {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.save(usuario);
		transacao.commit();
		sessao.close();
	}

	public void alteraUsuario(Usuario usuario) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.update(usuario);
		transacao.commit();
		sessao.close();
	}

	public void excluiUsuario(int id) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		Usuario usuario = new Usuario();
		usuario.setIdUsuario(id);
		sessao.delete(usuario);
		transacao.commit();
		sessao.close();

	}

	// arrumar aqui
	public void excluiUsuario(String usuario) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		sessao.delete(usuario);
		transacao.commit();
		sessao.close();
	}

	public Usuario pesquisaUmUsuario(int id) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		Usuario usuario = (Usuario) sessao.load(Usuario.class, id);
		transacao.commit();
		return usuario;
	}

	public Usuario pesquisaUsuario(String login, String senha) throws Exception {
		sessao = HibernateUtility.getSession();
		consulta = sessao.createCriteria(Usuario.class);
		consulta.add(Expression.like("login", login));
		consulta.add(Expression.like("senha", senha));
		Usuario usuario = (Usuario) consulta.uniqueResult();
		sessao.close();
		return usuario;

	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getUsuarios() throws Exception {
		sessao = HibernateUtility.getSession();
		List<Usuario> usuarios = sessao.createCriteria(Usuario.class).list();
		sessao.close();
		return usuarios;

	}

	public Usuario pesquisaUsuarioLogin(String login) throws Exception {
		sessao = HibernateUtility.getSession();
		transacao = sessao.beginTransaction();
		consulta = sessao.createCriteria(Usuario.class);
		consulta.add(Expression.like("login", login + "%"));
		Usuario usuario = (Usuario) consulta.uniqueResult();
		sessao.close();
		return usuario;
	}
}
