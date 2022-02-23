package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@NoArgsConstructor
@Data
@Table(name = "card_type")
public class CreditCardType extends AbstractEntity {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	@Column(name = "card_type")
	private String creditCardType;

	@Column(name = "card_number")
	private String creditCardNumber;

	@Column(name = "card_cvv2")
	private int cvv2;

	@Column(name = "expiration_date")
	private String expDate;

	@Column(name = "issue_date")
	private String issueDate;

	@Column(name = "issue_number")
	private String issueNumber;

	public CreditCardType(final Integer id, final String creditCardType ) {
		super();
		this.id = id;
		this.creditCardType = creditCardType;
	}
}
