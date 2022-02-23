package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Orders")
public class Order extends AbstractEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "order_number", unique = true)
	private Integer orderNumber;

	@Column(name = "order_name", length = 100)
	private String orderName;

	@Column(name = "max_discount")
	private int maxDiscount;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "customer")
	private User customer;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "assigne")
	private User assigne;

	@Column(name = "total_price")
	private Double totalPrice;

	@Column(name = "delivery_date")
	private Date deliveryDate;

	@Column(name = "preferable_delivery_date")
	private Date preferableDeliveryDate;

	@Column(name = "order_date")
	private Date orderDate;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "order_status_ref")
	private OrderStatus orderStatus;

	@Column(name = "is_gift")
	private Boolean isGift;

	public Order(final Integer id, final User customer, final User assigne,
				 final Double totalPrice, final Date deliveryDate,
				 final Date orderDate, final OrderStatus orderStatus) {
		super();
		this.id = id;
		this.customer = customer;
		this.assigne = assigne;
		this.totalPrice = totalPrice;
		this.deliveryDate = deliveryDate;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
	}

	public String transformPreferableDeliveryDateToStr() {
		if (preferableDeliveryDate == null)
			return "";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return simpleDateFormat.format(preferableDeliveryDate);
	}

	public String transformDeliveryDateToStr() {
		if (deliveryDate == null)
			return "";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		return simpleDateFormat.format(deliveryDate);
	}

	public String transformOrderDateToStr() {
		if (orderDate == null)
			return "";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
				"HH:mm dd-MM-yyyy");
		return simpleDateFormat.format(orderDate);
	}
}
