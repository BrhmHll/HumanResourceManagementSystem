package io.kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
@PrimaryKeyJoinColumn(name = "userId", referencedColumnName = "id")
public class Employer extends User {

	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "website")
	private String website;
	
	
	@Column(name = "phoneNumber")
	private String phoneNumber;


	public Employer(int id, String email, String password, boolean isActive, boolean isEmailVerified,
			String companyName, String website, String phoneNumber) {
		super(id, email, password, isActive, isEmailVerified);
		this.companyName = companyName;
		this.website = website;
		this.phoneNumber = phoneNumber;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
