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
@Table(name = "order_items")
public class OrderItem extends AbstractEntity {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "product_ref")
	private Product product;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "dimension_ref")
	private Dimension dimension;

	@Column(name = "quantity")
	private Integer quantity;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "order_ref")
	private Order order;

	@Column(name = "item_price")
	private Double itemPrice;

	@Column(name = "cost")
	private Double cost;

	private final static Integer numberOfFields = 6;

	public OrderItem(final Integer id, final Product product,
			final Dimension dimension, final Integer quantity,
			final Order order, final Double itemPrice, final Double cost) {
		super();
		this.id = id;
		this.product = product;
		this.dimension = dimension;
		this.quantity = quantity;
		this.order = order;
		this.itemPrice = itemPrice;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", product=" + product + ", dimension="
				+ dimension + ", quantity=" + quantity + ", order=" + order
				+ ", itemPrice=" + itemPrice + ", cost=" + cost + "]";
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj instanceof OrderItem) {
			OrderItem other = (OrderItem) obj;

			for (int i = 0; i < numberOfFields; i++) {
				Object thisField = getField(i);
				Object otherFiled = other.getField(i);

				if (thisField == null && otherFiled != null) {
					return false;
				}
				if (thisField != null && !thisField.equals(otherFiled)) {
					return false;
				}
			}

		} else {
			return false;
		}

		return true;
	}

	private Object getField(final Integer number) {
		switch (number) {

		case 0:
			return product;
		case 1:
			return dimension;
		case 2:
			return quantity;
		case 3:
			return order;
		case 4:
			return itemPrice;
		case 5:
			return cost;
		default:
			return null;
		}
	}
}
