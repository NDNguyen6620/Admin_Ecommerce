package Test;

import java.util.Iterator;
import java.util.List;

import admin.dao.impl.CategoryDAOImpl;
import admin.entities.Category;

public class TestGetall {
	public static void main(String[] args) {
		List<Category> list = new CategoryDAOImpl().getCategories(); 
		for (Category c : list) {
			System.out.println("Category:	");
			System.out.println("\tCategory id: "+ c.getCateId());
			System.out.println("\tCategory name: "+ c.getCategory());
			System.out.println("\tCategory status: "+ c.getStatus());
		}
	}
}
