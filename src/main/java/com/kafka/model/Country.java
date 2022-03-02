package com.kafka.model;

public class Country {

	
	private String countryName;
	private String countryCapital;
	private Double temparature;
	
	
	public Country() {
		super();
	}
	
	public Country(String countryName, String countryCapital, Double temparature) {
		super();
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.temparature = temparature;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryCapital() {
		return countryCapital;
	}
	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}
	public Double getTemparature() {
		return temparature;
	}
	public void setTemparature(Double temparature) {
		this.temparature = temparature;
	}

	@Override
	public String toString() {
		return "{ countryName : " + countryName + ", countryCapital : " + countryCapital + ", temparature : "+ temparature + "}";
	}
	
	

}
