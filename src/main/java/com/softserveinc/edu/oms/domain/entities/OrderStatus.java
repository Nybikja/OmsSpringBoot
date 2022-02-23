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
@Table(name = "order_statuses")
public class OrderStatus extends AbstractEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "oreder_status_name")
	private String orderStatusName;

	public OrderStatus(final Integer id, final String orderStatusName) {
		super();
		this.id = id;
		this.orderStatusName = orderStatusName;
	}

	@Override
	public String toString() {
		return orderStatusName;
	}

	public boolean hasThisOrderStatusName(String name) {
		return orderStatusName.equals(name);
	}

}
