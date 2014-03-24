package br.com.sglb.util;

// IMPORTS
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class HibernateUtil {
    
    // ATRIBUTOS
    private static SessionFactory sessionFactory;
    public static final String HIBERNATE_SESSION = "hibernate_session";
    
    // METODOS
    static{
        try{
            System.out.println("abrindo sessão");
            Configuration configuration = new Configuration().configure();
            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySetting(HIBERNATE_SESSION,configuration.getProperties()).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            System.out.println("sessão aberta");
        }catch(HibernateException ex){
            System.out.println("Exceção: "+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    /**
     * @return the sessionFactory
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
