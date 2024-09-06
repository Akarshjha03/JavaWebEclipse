package com.ParulStudent.util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import com.ParulStudent.entity.Student;


public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	
    public static SessionFactory getSessionFactory()
    {
        
        if (sessionFactory == null) {
            Configuration cnf = new Configuration();
            Properties settings = new Properties();
            settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
            settings.put(Environment.URL, "jdbc:mysql://localhost:3306/javaerp?useSSL=false");
            settings.put(Environment.USER, "root");
            settings.put(Environment.PASS, "helix1083");
            settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
            settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
            settings.put(Environment.SHOW_SQL, "true");
            settings.put(Environment.HBM2DDL_AUTO, "create-drop");

            cnf.setProperties(settings);
            cnf.addAnnotatedClass(Student.class);
            ServiceRegistry serRegistry = new StandardServiceRegistryBuilder().applySettings(cnf.getProperties()).build();
            sessionFactory = cnf.buildSessionFactory(serRegistry);
        }
        return sessionFactory;
    }
}

}
