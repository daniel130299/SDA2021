package tema2pb3;


public class Client {
	private Adresa address;
	private MetPlata paymentMethod ;
	private String firstName;
	private String lastName;
	private int age ;
	
	public Client(Adresa adress ,MetPlata pm ,String firstName ,String lastName , int age) {
		this.address=adress;
		this.paymentMethod=pm;
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
	}

	public Adresa getAddress() {
		return address;
	}

	public MetPlata getPaymentMethod() {
		return paymentMethod;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}
	
	public String getCompleteName() {
		return "Nume complet:" + firstName +" " +lastName+ "\nVarsta:"+age  ;
}
}
	
	


