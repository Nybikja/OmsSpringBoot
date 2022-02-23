package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "customer_types")
public class CustomerType extends AbstractEntity implements Serializable {

	/**
	 * Generated serial version UID.
	 */
	private static final long serialVersionUID = -561768177172795025L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "type_name")
	private String typeName;

	@Column(name = "min_range")
	private Double minRange;

	@Column(name = "max_range")
	private Double maxRange;

	@Column(name = "discount")
	private Double discount;

	public CustomerType(final Integer id, final String typeName,
			final Double minRange, final Double maxRange, final Double discount) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.discount = discount;
	}
}
