package Employee.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static SessionFactory sessionFactory;
    static {
    	try {
    		sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	}catch(Throwable ex) {
    		System.err.println("initial sessionfacory creation:"+ex);
    	}
    }
    public static SessionFactory getSessionFactory()
    {
    	return sessionFactory;
    }
    public static void main(String[] args) {
		Session session=getSessionFactory().openSession();
		System.out.println("session open sucessffully");
		session.close();
	}
}
