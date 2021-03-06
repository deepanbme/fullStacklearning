package com.training.OOPS;

public class ConstructorChaining 
{
	private int id = 10;
	private String name = "";
	private double cost;
	
	public ConstructorChaining()
	{
		id = 20;
		name = "priya";
		cost = 12.50;
	}
	
	public ConstructorChaining(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public ConstructorChaining(int id, String name, double cost)
	{
		this(id, name);
		this.cost = 12.50;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
}
