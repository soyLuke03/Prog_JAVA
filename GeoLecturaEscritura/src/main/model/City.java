package main.model;

import java.util.ArrayList;
import java.util.List;

public class City {

	public int city_id;
	public String city;
	public List<Address> list_Address = new ArrayList<>();
	
	
	
	public City(int city_id, String city) {
		super();
		this.city_id = city_id;
		this.city = city;
	}



	@Override
	public String toString() {
		return "City [city_id=" + city_id + ", city=" + city + ", list_Address=" + list_Address + "]";
	}



	public List<Address> getList_Address() {
		return list_Address;
	}



	public void setList_Address(List<Address> list_Address) {
		this.list_Address = list_Address;
	}
	
	
}
