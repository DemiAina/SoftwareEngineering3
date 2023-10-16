package com.se3.lab3;

import java.util.ArrayList;
import java.util.List;

public class Property {
	private String name;
	private List<Apartment> apartments = new ArrayList<Apartment>(); 
	public Property(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addApartment(Apartment apartment){
		apartments.add(apartment);
	}
	public double computeMonthlyRent(){
		double sum = 0;
		for(int i = 0; i < this.apartments.size(); i++){
			if(!this.apartments.get(i).isOccupied()){
				sum = sum + this.apartments.get(i).getMonthlyRent();
			}
		}
		return sum;
	}
	
	
	
}
