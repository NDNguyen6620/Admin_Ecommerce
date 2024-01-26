package admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import admin.dao.CategoryDAO;
import admin.entities.Category;

@Controller
@RequestMapping("/user")
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	@RequestMapping("/listCategory")
	public String ListCategory(Model model) {
		
		List<Category> categories = categoryDAO.getCategories();
		model.addAttribute("list", categories);
		return "listCategory";
	}
	
	@RequestMapping("/initInsertCategory")
	public String initInsertCategory(Model model) {
		Category c = new Category();
		model.addAttribute("c", c);
		return "insertCategory";
	}
	
	@RequestMapping("/insertCategory")
	public String insertCategory(@ModelAttribute("c")Category c, Model model) {
		boolean bl = categoryDAO.insertCategory(c);
		if(bl) {
			model.addAttribute("success", "Insert Successfuly!");
			List<Category> categories = categoryDAO.getCategories();
			model.addAttribute("list", categories);
			return "listCategory";
		}else {
			model.addAttribute("error", "Insert failed!!!");
			model.addAttribute("c", c);
			return "insertCategory";
		}
	}
	//tạm thời ko dùng đến
	@RequestMapping("/detailCategory")
	public String detailCategory(@RequestParam("cateId")Integer cateId,Model model) {
		Category category = categoryDAO.getCategoryById(cateId);
		model.addAttribute("c", category);
		return "detailCategory";
	}
	
	@RequestMapping("/preUpdateCategory")
	public String preUpdateCategory(@RequestParam("cateId")Integer cateId,Model model) {
		Category category = categoryDAO.getCategoryById(cateId);
		model.addAttribute("c", category);
		return "updateCategory";
	}
	
	@RequestMapping("/updateCategory")
	public String updateCategory(@ModelAttribute("c")Category c, Model model) {
		boolean bl = categoryDAO.updateCategory(c);
		if(bl) {
			model.addAttribute("success", "Update Successfuly!");
			List<Category> categories = categoryDAO.getCategories();
			model.addAttribute("list", categories);
			return "listCategory";
		}else {
			model.addAttribute("error", "Update failed!!!");
			model.addAttribute("c", c);
			return "updateCategory";
		}
		
	}
	@RequestMapping("/deleteCategory")
	public String deleteCategory(@RequestParam("cateId")Integer cateId, Model model) {
		boolean bl = categoryDAO.deleteCategory(cateId);
		if(bl) {
			model.addAttribute("success", "Delete successfully!");
		}else {
			model.addAttribute("error", "Delete failed!!!");
		}
		List<Category> categories = categoryDAO.getCategories();
		model.addAttribute("list", categories);
		return "listCategory";
	}
	@RequestMapping("/searchCategoryByName")
	public String searchCategoryByName(@RequestParam("category")String category,Model model) {
		if(category == null || category.length() == 0) {
			category = "%";
		}else {
			category = "%"+category+"%";
			
		}
		List<Category> categories = categoryDAO.getCategoryByName(category);
		model.addAttribute("list", categories);
		return "listCategory";
	}
	
}
