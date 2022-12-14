package ro.mta.ip.lab3JAVA.scthreads;

public class Profesor implements Human, Comparable<Human>{

    private String nume;
    private String prenume;
    private String facultate;
    private Integer varsta;
    private String materie;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public String getMaterie() {
        return materie;
    }

    public void setMaterie(String materie) {
        this.materie = materie;
    }

    public Profesor(String nume, String prenume, String facultate, Integer varsta, String materie) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.materie = materie;
    }


    public Profesor(String sir) {
        String[] arrOfStr = sir.split(" ");
        String nume = arrOfStr[1];
        String prenume = arrOfStr[2];
        String facultate = arrOfStr[3];
        Integer varsta = Integer.parseInt(arrOfStr[4]);
        String materie = arrOfStr[5];

        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.materie = materie;

    }


    @Override
    public void greeting() {
        System.out.println("Buna ziua!");
    }

    @Override
    public void doWork() {
        System.out.println("Predare materie.");
    }

    @Override
    public String toString() {
        return "Prof. " +
                nume + " " +
                prenume + ", Fac. " + facultate + ", Varsta " +
                varsta + ", Materie " + materie;
    }

    @Override
    public int compareTo(Human o) {
        return this.getVarsta().compareTo(o.getVarsta());
    }
}
