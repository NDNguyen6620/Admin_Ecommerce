package admin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import admin.dao.CategoryDAO;
import admin.entities.Category;
import common.util.HibernateUtil;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Override
	public List<Category> getCategories() {
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from Category").list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}
	
	@Override
	public boolean insertCategory(Category c) {
		boolean bl = false;
		
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.save(c);
			session.getTransaction().commit();
			bl=true;
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return bl;
	}
	
	@Override
	public boolean updateCategory(Category c) {
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.update(c);
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.getTransaction().rollback();
		}finally {
			session.close();
		}
		return false;
	}
	
	@Override
	public boolean deleteCategory(Integer cateId) {
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			session.beginTransaction();
			session.delete(getCategoryById(cateId));
			session.getTransaction().commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			session.getTransaction().rollback();
			// TODO: handle exception
		}finally {
			session.close();
		}
		return false;
	}

	@Override
	public Category getCategoryById(Integer cateId) {
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			Category category = session.get(Category.class, cateId);
			return category;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<Category> getCategoryByName(String category) {
		SessionFactory sessionFactory = HibernateUtil.getsessionFactory();
		Session session = sessionFactory.openSession();
		try {
			List list = session.createQuery("from Category where category like :category")
			.setParameter("category", category)
			.list();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			session.close();
		}
		return null;
	}

	

}
