package com.softserveinc.edu.oms.domain.entities;

import com.softserveinc.edu.oms.domain.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Regions")
public class Region extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -886563328312236401L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "region_name")
	private String name;

	public Region(final Integer id, final String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
