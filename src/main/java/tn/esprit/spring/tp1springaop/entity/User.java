package tn.esprit.spring.tp1springaop.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name = "user" )
public class User implements Serializable {
	private static final long serialVersionUID = -6086438464306630605L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO) private long id;
	@Column(name="firstName") private String firstName;
	@Column(name="lastName") private String lastName;
	@Enumerated(EnumType.ORDINAL) private Role role;
	@Temporal(TemporalType.DATE) Date date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User(long id, String firstName, String lastName, Role role, Date date) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.date = date;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " +super.toString();
	}

	
}
