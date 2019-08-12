package com.vinayak.Dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.vinayak.Dao.ProductDao;
import com.vinayak.model.Product;

public class ProductDaoImplementation implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean addProduct(Product p) {
		
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			session.save(p);
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	/*@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}
	

	public boolean updateProduct(Product p) {
		try {
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.update(p);
			tx.commit();
			session.close();
			
			return true;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		return false;
		}
	}

	public boolean deleteProduct(int productId) {
		try {
			Product p=new Product();
			p.setProductId(productId);
			Session session=SessionFactoryProvider.getSF().openSession();
			Transaction tx=session.beginTransaction();
			session.delete(p);
			tx.commit();
			session.close();
			
			
			return true;
			
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}


	}

	public Product getProduct(int productId) {
		
		try {
		Session session=SessionFactoryProvider.getSF().openSession();
		
		Product p=session.get(Product.class, productId);
		
		return p;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return null;
	}
*/
	/*public List<Product> getAllProducts() {
		try
		{
			Session session=sessionFactory.getCurrentSession(); //hibernate
			Query q=session.createQuery("from Category");
			return q.list();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}


	public boolean updateProduct(Product p) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}


	public Product getProduct(int productId) {
		// TODO Auto-generated method stub
		return null;
	}*/


}
