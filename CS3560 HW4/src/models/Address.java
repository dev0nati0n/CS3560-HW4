package models;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip_code")
	private int zip_code;
	
	// setters
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZipCode(int zip_code)
	{
		this.zip_code = zip_code;
	}
	
	// getters
	public int getId()
	{
		return id;
	}

	public String getStreet()
	{
		return street;
	}

	public String getCity()
	{
		return city;
	}

	public String getState()
	{
		return state;
	}

	public int getZipCode()
	{
		return zip_code;
	}
	
	// CRUD Operations
	
}
