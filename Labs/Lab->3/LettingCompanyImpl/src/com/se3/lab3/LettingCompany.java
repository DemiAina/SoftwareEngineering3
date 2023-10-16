package com.se3.lab3;

import java.util.ArrayList;
import java.util.List;

public class LettingCompany {
	private String name;
	private List<Property> properties = new ArrayList<Property>();
	
	public LettingCompany(String name){
		this.setName(name);
	}
	
	public void addProperty(Property property) {
	        properties.add(property);
	}
	
	public double computeTotalMonthlyRent(){
		double sum = 0;
		for(int i = 0 ; i < this.properties.size(); i++){
			sum = sum + this.properties.get(i).computeMonthlyRent();
		}
		return sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
