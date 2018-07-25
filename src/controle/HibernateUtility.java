package controle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	private static SessionFactory factory;
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();
	static {
		try {
			Configuration configuration = new AnnotationConfiguration();
			configuration.configure("hibernate.cfg.xml");
			factory = configuration.buildSessionFactory();
		} catch (Throwable t) {
			throw new ExceptionInInitializerError(t);
		}

	}

	public static Session getSession() {
		Session session = (Session) threadLocal.get();
		session = factory.openSession();
		threadLocal.set(session);
		return session;

	}
}
