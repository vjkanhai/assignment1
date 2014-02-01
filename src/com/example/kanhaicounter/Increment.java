package com.example.kanhaicounter;

import java.util.Date;

public class Increment
//The increment class is an object that contains the timestamp of the increment.
{
	protected Date timestamp = new Date();
	public Date getDate()
	{
		return timestamp;
	}
}
