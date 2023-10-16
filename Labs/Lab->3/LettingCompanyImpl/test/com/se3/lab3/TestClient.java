package com.se3.lab3;

public class TestClient {

	public static void main(String[] args) {
		Apartment APa1 = new Apartment("1A");
		Apartment APb2 = new Apartment("2B");
		Apartment APc3 = new Apartment("3C");
		Apartment APd4 = new Apartment("4D");
		Apartment APe5 = new Apartment("5E");
		Apartment APf6 = new Apartment("6F");
		Apartment APg7 = new Apartment("7G");
		
		APa1.setMonthlyRent(1000);
		APb2.setMonthlyRent(2500);
		APc3.setMonthlyRent(2600);
		APd4.setMonthlyRent(1500);
		APe5.setMonthlyRent(2100);
		APf6.setMonthlyRent(1700);
		APg7.setMonthlyRent(2000);
		
		Property PRa1  = new Property("PRa1");
		Property PRb2 = new Property("PRb2");
		
		LettingCompany lc = new LettingCompany("lc-limited");
		
		PRa1.addApartment(APa1);
		PRa1.addApartment(APb2);
		PRa1.addApartment(APc3);

		PRb2.addApartment(APd4);
		PRb2.addApartment(APe5);
		PRb2.addApartment(APf6);
		PRb2.addApartment(APg7);
		
		lc.addProperty(PRa1);
		lc.addProperty(PRb2);

		System.out.println(lc.computeTotalMonthlyRent());

	}

}
