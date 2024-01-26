package admin.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
	@Id
	@Column(name="CateId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cateId;
	@Column(name="Category")
	private String category;
	@Column(name="Status")
	private Boolean status;
	@OneToMany(mappedBy = "category")
	private Set<Product> product;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	public Category(Integer cateId, String category, Boolean status, Set<Product> product) {
		super();
		this.cateId = cateId;
		this.category = category;
		this.status = status;
		this.product = product;
	}

	public Integer getCateId() {
		return cateId;
	}

	public void setCateId(Integer cateId) {
		this.cateId = cateId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
}
