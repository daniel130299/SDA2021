package tema5;

public class DetaliiStudenti {
	
	private String nume;
    private String prenume;
    private double matematica;
    private double lmbrom;

    public DetaliiStudenti(String nume, String prenume, double matematica, double lmbrom) {
        this.nume = nume;
        this.prenume = prenume;
        this.matematica = matematica;
        this.lmbrom = lmbrom;
    }

    public String getnume() {
        return nume;
    }

    public void setnume(String nume) {
        this.nume = nume;
    }

    public String getprenume() {
        return prenume;
    }

    public void setprenume(String prenume) {
        this.prenume = prenume;
    }

    public double getmatematica() {
        return matematica;
    }

    public void setmatematica(double matematica) {
        this.matematica = matematica;
    }

    public double getlmbrom() {
        return lmbrom;
    }

    public void setlmbrom(double lmbrom) {
        this.lmbrom = lmbrom;
    }
    
    public String toString() {
        return "Nume: " + nume + "\n" + "Prenume: " + prenume + "\n" +
                "Nota Matematica: " + matematica + "\n" + "Nota Limba Romana: " + lmbrom;
    }

}


