package common.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	public static SessionFactory getsessionFactory(){
		if(sessionFactory == null) {
			ServiceRegistry reg = new StandardServiceRegistryBuilder().configure().build();
			MetadataSources sources = new MetadataSources(reg);
			Metadata metadata = sources.getMetadataBuilder().build();
			sessionFactory = metadata.getSessionFactoryBuilder().build();		
		}
		return sessionFactory;
	}
	
}
