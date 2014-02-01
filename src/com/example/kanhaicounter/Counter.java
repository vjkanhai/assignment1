package com.example.kanhaicounter;

import java.util.ArrayList;
import java.util.Date;

public class Counter
/*The counter class is a list of the increments that have been applied to itself.
 * It also contains useful statistics about the counter.*/
{
	private String name;
	private Date creation;
	protected ArrayList<Increment> log = new ArrayList<Increment>();
	
	public Counter(String name)
	{
		super();
		this.setName(name);
		this.setCreation(new Date());
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public Date getCreation()
	{
		return creation;
	}
	public void setCreation(Date creation)
	{
		this.creation = creation;
	}
	
	public void increment()
	{
		Increment count = new Increment();
		log.add(count);
	}
	
	public int getCount()
	{
		return log.size();
	}
	
	public void resetCount()
	{
		log.clear();
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
