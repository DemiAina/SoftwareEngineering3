package com.se3.lab3;

public class Apartment {
	private String aptNumber;
	private double monthlyRent;
	private boolean isOccupied;
	
	
	public Apartment(String aptNumber){
		this.setAptNumber(aptNumber);
		this.setMonthlyRent(0);
		this.isOccupied = false;
	}
	
	public String getAptNumber() {
		return aptNumber;
	}

	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}
	

	public double getMonthlyRent() {
		return monthlyRent;
	}

	public void setMonthlyRent(double monthlyRent) {
		this.monthlyRent = monthlyRent;
	}
	
	public boolean isOccupied(){
		return this.isOccupied;
	}
}
