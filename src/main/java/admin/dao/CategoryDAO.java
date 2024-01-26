package admin.dao;

import java.util.List;

import admin.entities.Category;

public interface CategoryDAO {
	public List<Category> getCategories();
	
	public boolean insertCategory(Category c);
	
	public boolean updateCategory(Category c);
	
	public boolean deleteCategory(Integer cateId);
	
	public Category getCategoryById(Integer cateId);
	
	public List<Category> getCategoryByName(String category);
}
