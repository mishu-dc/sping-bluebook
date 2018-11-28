package com.xpertlabbd.bluebook.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class SqlCnnectionTest {

	public static void main(String[] args) {
		usingJDBC();
		usingHibernate();
	}

	private static void usingHibernate() {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Brand.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		session.beginTransaction();
		
		printBrands(session);
		
		printProducts(session);
		
		printMarkets(session);
	    
	    session.getTransaction().commit();
	}
	
	private static void printMarkets(Session session) {
		System.out.println("Markets:");
		
		@SuppressWarnings("unchecked")
		TypedQuery<MarketHierarchy> query = session.createQuery("from MarketHierarchy");
	    List<MarketHierarchy> markets = query.getResultList();
		
	    for (MarketHierarchy market : markets) {
			System.out.print(market.getCode() + "\t");
			System.out.print(market.getName() + "\t");
			System.out.println(market.getParent()+ "\t");
		}
	}

	private static void printProducts(Session session) {
		System.out.println("Products:");
		
		@SuppressWarnings("unchecked")
		TypedQuery<Product> query = session.createQuery("from Product");
	    List<Product> products = query.getResultList();
		
	    
	    for (Product product : products) {
			System.out.print(product.getCode() + "\t");
			System.out.print(product.getName() + "\t");
			System.out.println(product.getBrand()+ "\t");
		}		
	}

	private static void printBrands(Session session) {
		System.out.println("Brands:");
		
		@SuppressWarnings("unchecked")
		TypedQuery<Brand> query = session.createQuery("from Brand");
	    List<Brand> brands = query.getResultList();
	    
	    System.out.println("Print brands");
	    
	    for (Brand brand : brands) {
			System.out.print(brand.getCode() + "\t");
			System.out.println(brand.getName() + "\t");
		}		
	}

	private static void usingJDBC() {
		// TODO Auto-generated method stub
		String connectionUrl = "jdbc:sqlserver://DESKTOP-2O6J4GF;instanceName=SQLEXPRESS;DatabaseName=BlueBook;user=sa;password=x";
		try {

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// createHibernateConfiguration();

			System.out.println("Connecting to SQL Server ... ");
			// Load SQL Server JDBC driver and establish connection.

			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("connected....");
				String query = "SELECT [Id], [Code], [Name], [Address], [CreatedDate], [UpdatedDate], [CreatedBy], [UpdatedBy] FROM Distributors";
				Statement st = connection.createStatement();
				ResultSet rs = st.executeQuery(query);
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
					System.out.print(rs.getDate(5) + "\t");
					System.out.print(rs.getDate(6) + "\t");
					System.out.print(rs.getString(7) + "\t");
					System.out.println(rs.getString(8));
				}
				st.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
