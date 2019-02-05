package org.moreafilia.app;

import java.io.IOException;
import java.util.Properties;

import org.moreafilia.app.model.Afiliacion;
import org.moreafilia.app.model.Contacto;
import org.moreafilia.app.model.Domicilio;
import org.moreafilia.app.model.Elector;
import org.moreafilia.app.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("org.moreafilia.app")})
public class HibernateConfig {

	@Autowired
	private ApplicationContext context;

	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factoryBean.setPackagesToScan("org.moreafilia.app.model");
//		factoryBean.setAnnotatedClasses(Afiliacion.class,Elector.class,Persona.class,Contacto.class,Domicilio.class);
		
		return factoryBean;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getSessionFactory().getObject());
		return transactionManager;
	}

}
