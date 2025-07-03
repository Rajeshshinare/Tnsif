package com.tnsif.MultilevelInheritance;

//	Parent Class
public class Country {

	private String countryName;
	private String capital;
	
//	Getter Setter method
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
//	ToString method
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", capital=" + capital + "]";
	}
	
	
}
