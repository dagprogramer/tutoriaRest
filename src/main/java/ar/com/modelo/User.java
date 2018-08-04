package ar.com.modelo;
// Generated 04/08/2018 20:08:18 by Hibernate Tools 4.0.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "baserest")
public class User implements java.io.Serializable {

	private Integer id;
	private String name;
	private String email;
	private String password;
	private City city;
	private StatusUser statusUser;
	
	public User() {
	}

	public User(String name, String email, String password, City city, StatusUser statusUser) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.statusUser = statusUser;
	}

	public User(Integer id, String name, String email, String password, City city, StatusUser statusUser) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.city = city;
		this.statusUser = statusUser;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@OneToOne
	@JoinColumn(name = "status_user_id", nullable = false)
	public StatusUser getStatusUser() {
		return this.statusUser;
	}

	public void setStatusUser(StatusUser statusUser) {
		this.statusUser = statusUser;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false)
	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "email", nullable = false, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
