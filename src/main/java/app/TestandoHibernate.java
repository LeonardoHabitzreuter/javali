package app;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import app.entity.Empregado;

public class TestandoHibernate {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtils.getSessionFactory();

		Session session = factory.getCurrentSession();
		Date data = new Date(2019, 10, 10);
		try {
			session.getTransaction().begin();
			Empregado riad = new Empregado(1, "Ríad", "Professor",data , (float) 1000);
			session.persist("EMPREGADO_IFC", riad);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}

}
