package main.model;

import java.util.ArrayList;
import java.util.List;

public class Country {

	public int country_id;
	public String country;
	public List<City> list_city = new ArrayList<>();
	
	
	public Country(int country_id, String country) {
		super();
		
		this.country_id = country_id;
		this.country = country;
	}


	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country=" + country + ", list_city=" + list_city + "]";
	}


	public List<City> getList_city() {
		return list_city;
	}


	public void setList_city(List<City> list_city) {
		this.list_city = list_city;
	}

	
}
