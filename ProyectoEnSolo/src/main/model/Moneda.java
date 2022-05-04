package main.model;

public enum Moneda {
	CENT(1), 
	TWOCENT(2),
	FIVECENT(5),
	TENCENT(10),
	TWENTYCENT(20),
	FIFTYCENT(50),
	EURO(100),
	TWOEURO(200);
	
	int value;
	
	
	Moneda(int valor){
		this.value = valor;
	}
}
