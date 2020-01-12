package com.akshay.DemoHib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity  
@Table (name="alien_table")
public class Alien {

	@Id
	private int aid;
	
	
	private AlienName aname;
	private String color;
	
	public int getAid(){
		return aid;
		
	}
	
	public void setAid( int aid)
	{
			this.aid=aid;
      }
	

	
	/**
	 * @return the aname
	 */
	public AlienName getAname() {
		return aname;
	}

	/**
	 * @param aname the aname to set
	 */
	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	public String getColor()
	{
		return color;
	}
	
	public void setColor(String color)
	{
		this.color=color;
		
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	 
}
