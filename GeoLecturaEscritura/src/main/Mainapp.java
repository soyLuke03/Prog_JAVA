package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.model.Address;
import main.model.City;
import main.model.Country;

public class Mainapp {

	public static void main(String[] args) {
		
		List<Address> addresses = new ArrayList<>();
		List<City> cities = new ArrayList<>();
		List<Country> countries = new ArrayList<>();
				
		Address ad = new Address(-1, null,-1);
		City ci = new City(-1, null);
		Country co = new Country(-1, null);
		
		
		
		try {
			
			File addressTXT = new File("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\GeoLecturaEscritura\\src\\files\\address.txt");
			FileReader frA = new FileReader(addressTXT);
			BufferedReader brA = new BufferedReader(frA);
			
			File cityTXT = new File("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\GeoLecturaEscritura\\src\\files\\city.txt");
			FileReader frC = new FileReader(cityTXT);
			BufferedReader brC = new BufferedReader(frC);
			
			File countryTXT = new File("C:\\Users\\antog\\Desktop\\Cosas de clase\\Programación\\OrientacionAObjetos\\GeoLecturaEscritura\\src\\files\\country.txt");
			FileReader frCi = new FileReader(countryTXT);
			BufferedReader brCi = new BufferedReader(frCi);
			
			
			//Direcciones
			brA.readLine();
			String linea = brA.readLine();
			while (linea!=null) {
				
				String[] cadena = linea.split(",");
				
				ad = new Address(Integer.valueOf(cadena[0]),cadena[1],Integer.valueOf(cadena[4]));
				addresses.add(ad);
				linea = brA.readLine();
			}
			
			
			
			
			//Ciudades
			brC.readLine();
			String lineaCity = brC.readLine();
			while (lineaCity!=null) {
				
				String[] cadenaCity = lineaCity.split(",");
				
				ci = new City(Integer.valueOf(cadenaCity[0]),cadenaCity[1]);
				cities.add(ci);
				
				lineaCity = brC.readLine();
			}
			
			
			
			
			
			//Paises
			brCi.readLine();
			String lineaCountry = brCi.readLine();
			while (lineaCountry!=null) {
				
				String[] cadenaCountry = lineaCountry.split(",");
				
				co = new Country(Integer.valueOf(cadenaCountry[0]),cadenaCountry[1]);
				countries.add(co);
				
				lineaCountry = brCi.readLine();
			}

			for(City city : cities) {
				for(Address a : addresses) {
					if(city.city_id==a.city) {
						city.list_Address.add(a);
					}
				}
			}
			
			
			
			
			
		}catch (IOException e) {
			
		}


		System.out.println("");
		
		
	}

}
