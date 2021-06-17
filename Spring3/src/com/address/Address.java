package com.address;

public class Address {
	private String hno;
	private String street;
	private String village;
	
	public String getHno()
	{
		return hno;
	}
	public void setHno(String hno)
	{
		this.hno=hno;
	}
	public String getStreet()
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street=street;
	}
	public String getVillage()
	{
		return village;
	}
	public void setVillage(String village)
	{
		this.village=village;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", village=" + village + "]";
	}
	
}
