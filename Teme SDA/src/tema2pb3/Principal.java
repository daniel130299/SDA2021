package tema2pb3;

public class Principal {

	 
		public static void main (String[]args) {
			Adresa address = new Adresa ("Braila","Calea Calarasilor",250);
		    MetPlata pm = new MetPlata("card");
		    Client cl = new Client (address, pm ,"Andrei","Daniel",22);
		    
		    System.out.println(cl.getCompleteName());
		    System.out.println(cl.getAddress().getFullAddress());
		    System.out.println(cl.getPaymentMethod().getType());
		}
	}



