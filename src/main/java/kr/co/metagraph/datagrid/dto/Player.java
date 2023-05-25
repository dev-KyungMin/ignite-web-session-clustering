package kr.co.metagraph.datagrid.dto;

import java.io.Serializable;

public class Player implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	private double wages;
	
	public Long getId() 
	{
		return id;
	}
	public void setId(Long id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public double getWages() 
	{
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}

	@Override
	public String toString() 
	{
		return "Player[ id="+ id + ", name=" + name + ", wages=" + wages + "]";
	}
	
}
