package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "products")
public class Product extends AbstractEntity implements Comparable<Product> {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "product_name")
	private String name;

	@Column(name = "product_description")
	private String description;

	@Column(name = "product_price")
	private Double price;

	@Column(name = "is_product_active")
	private Boolean active;

	public Product() {
		active = true;
	}

	public Product(final Integer id, final String productName,
			final String productDescription, final Double productPrice) {
		super();
		this.id = id;
		this.name = productName;
		this.description = productDescription;
		this.price = productPrice;
	}

	@Override
	public String toString() {
		return "productName = " + name;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(final Product product) {
		if (name.compareTo(product.name) < 0) {
			return -1;
		} else if (name.compareTo(product.name) > 0) {
			return 1;
		} else {
			return description.compareTo(product.description);
		}
	}

	public String getProductName() {
		return name;
	}
	
	public void setProductName(String productName) {
		name = productName;
	}
}
