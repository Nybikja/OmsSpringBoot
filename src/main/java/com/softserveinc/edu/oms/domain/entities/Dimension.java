package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Dimensions")
public class Dimension extends AbstractEntity {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "dimension_name")
	private String name;

	@Column(name = "number_of_products")
	private Integer numberOfProduct;


	public Dimension(final Integer id, final String dimensionName,
			final Integer numberOfProduct) {
		super();
		this.id = id;
		this.name = dimensionName;
		this.numberOfProduct = numberOfProduct;
	}

	@Override
	public String toString() {
		return name;
	}
}
