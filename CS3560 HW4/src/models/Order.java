package models;

import java.sql.Date;
import javax.persistence.*;

public class Order
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="number")
	private int number;
	
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="item")
	private String item;
	
	@Column(name="price")
	private double price;
	
	// setters
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	
	public void setDate(Date date)
	{
		this.date = date;
	}
	
	public void setItem(String item)
	{
		this.item = item;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}

	// getters
	public int getNumber()
	{
		return number;
	}

	public Customer getCustomer()
	{
		return customer;
	}

	public Date getDate()
	{
		return date;
	}

	public String getItem()
	{
		return item;
	}

	public double getPrice()
	{
		return price;
	}
	
}
