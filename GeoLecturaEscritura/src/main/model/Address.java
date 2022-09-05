package main.model;

public class Address {

	public int address_id;
	public String address;
	public int city;
	
	
	public Address(int address_id, String address, int city) {
		super();
		this.address_id = address_id;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address=" + address + ", city= "+ city+"]";
	}
	
	
}
