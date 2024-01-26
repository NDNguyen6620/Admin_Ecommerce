package Test;

import admin.dao.impl.CategoryDAOImpl;
import admin.entities.Category;

public class TestInsert {
	public static void main(String[] args) {
		Category c = new Category(0, "Dress", true, null);
		boolean bl = new CategoryDAOImpl().insertCategory(c);
		if(bl) {
			System.out.println("insert complete");
		}else {
			System.out.println("insert false");
		}
	}
}
