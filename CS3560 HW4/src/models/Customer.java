package models;

import java.util.List;
import javax.persistence.*;

public class Customer
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.PERSIST)
	private List<Order> orders;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="email")
	private String email;
	
	// setters
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public void setOrders(List<Order> orders)
	{
		this.orders = orders;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	// getters
	public int getId()
	{
		return id;
	}
	
	public Address getAddress()
	{
		return address;
	}

	public List<Order> getOrders()
	{
		return orders;
	}
	
	public String getName()
	{
		return name;
	}

	public String getPhone()
	{
		return phone;
	}

	public String getEmail()
	{
		return email;
	}
	
	
}
