package com.petPeers.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pet")

public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pet_Id")
	private int pet_id;
	@Column(name="pet_name")
	private String pet_name;
	@Column(name="pet_age")
	private int pet_age;
	@Column(name="pet_palce")
	private String pet_palce;

	public int getPet_id() {
		return pet_id;
	}

	public void setPet_id(int pet_id) {
		this.pet_id = pet_id;
	}

	public String getPet_name() {
		return pet_name;
	}

	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}

	public int getPet_age() {
		return pet_age;
	}

	public void setPet_age(int pet_age) {
		this.pet_age = pet_age;
	}

	public String getPet_palce() {
		return pet_palce;
	}

	public void setPet_palce(String pet_palce) {
		this.pet_palce = pet_palce;
	}

	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
