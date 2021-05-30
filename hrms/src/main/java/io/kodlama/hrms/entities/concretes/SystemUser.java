package io.kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="systemUsers")
@PrimaryKeyJoinColumn(name = "userId", referencedColumnName = "id")
public class SystemUser extends User{

	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;

	public SystemUser(int id, String email, String password, boolean isActive, boolean isEmailVerified,
			String firstName, String lastName) {
		super(id, email, password, isActive, isEmailVerified);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
