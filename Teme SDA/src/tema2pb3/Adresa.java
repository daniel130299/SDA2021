package tema2pb3;

public class Adresa {
	private String city , street ;
	private int number ;
	
	public Adresa (String city ,String street , int number) {
		this.city=city;
		this.street=street;
		this.number=number;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}



	public int getNumber() {
		return number;
	}

	
	public String getFullAddress() {
		return ("Oras:"+getCity()+","+"Strada:"+getStreet()+","+"Numarul:"+getNumber());
				
	}

}


