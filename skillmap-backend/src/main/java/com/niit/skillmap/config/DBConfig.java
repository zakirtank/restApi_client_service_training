package com.niit.skillmap.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@ComponentScan(basePackages="com.niit")
@EnableTransactionManagement
public class DBConfig {
	
	 
	@Bean(name="dataSource")
	@Autowired
	public DataSource getDataSouce()
	{
		DriverManagerDataSource ds= new DriverManagerDataSource();
		ds.setUsername("sa");
		ds.setPassword("123");
		ds.setDriverClassName("org.h2.Driver");
		ds.setUrl("jdbc:h2:tcp://localhost/~/empdata");
		return ds;
			
		
	}
	
	public Properties getHibernateProperties()
	{
		Properties pro=new Properties();
		pro.setProperty("hibernete.dialect","org.hibernate.dialect.H2Dialect");
		pro.setProperty("hibernate.show_sql", "true");
		pro.setProperty("hibernate.hbm2ddl.auto","update");
		return pro;
	}
		
	@Autowired
	@Bean(name="sessionFactory")
	public LocalSessionFactoryBean getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBean sessionFactory =new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setHibernateProperties(getHibernateProperties());
		sessionFactory.setPackagesToScan("com.niit");
		return sessionFactory;
	}
	
	
	@Bean(name="transactionManager")
	@Autowired
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionmanager=new HibernateTransactionManager(sessionFactory);
		transactionmanager.setSessionFactory(sessionFactory);
		return transactionmanager;
	}
}
