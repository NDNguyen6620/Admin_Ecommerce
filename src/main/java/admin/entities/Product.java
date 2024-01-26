package admin.entities;

import javax.annotation.processing.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="ProId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer proId;
	@Column(name = "Image")
	private String image;
	@Column(name="Name")
	private String name;
	@ManyToOne
	@JoinColumn(name="categoryId",referencedColumnName = "cateId")
	private Category category;
	@Column(name="Description")
	private String description;
	@Column(name="Price")
    private Double price;
	@Column(name="Saleprice")
	
	
	private Double salePrice;public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(Integer proId, String image, String name, Category category, String description, Double price,
			Double salePrice) {
		super();
		this.proId = proId;
		this.image = image;
		this.name = name;
		this.category = category;
		this.description = description;
		this.price = price;
		this.salePrice = salePrice;
	}
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}
	
}