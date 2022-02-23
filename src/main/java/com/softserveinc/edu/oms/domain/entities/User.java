package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "Users")
public class User extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 800979855728109655L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Integer id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "login", nullable = false)
	private String login;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "is_user_active")
	private Boolean active;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "customer_type_ref")
	private CustomerType customerType;

	@Column(name = "balance")
	private Double balance;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "role_ref", nullable = false)
	private Role role;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "region_ref")
	private Region region;

	public User() {
		active = true;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", login=" + login + ", password=" + password
				+ ", email=" + email + ", customerType=" + customerType
				+ ", balance=" + balance + ", role=" + role + ", region="
				+ region + "]";
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		if (!(obj instanceof User)) {
			return false;
		} else {
			User that = (User) obj;

			return that.getLogin().equals(login);
		}
	}
}
