package ro.mta.ip.lab3JAVA.scthreads;

import ro.mta.ip.lab3JAVA.ex2.Carte;

public class Student implements Human, Comparable<Human>{


    private String nume;
    private String prenume;
    private String facultate;
    private Integer varsta;
    private Integer anStudiu;

    public Student(String nume, String prenume, String facultate, Integer varsta, Integer anStudiu) {
        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.anStudiu = anStudiu;
    }

    public Student(String sir) {
        String[] arrOfStr = sir.split(" ");
        String nume = arrOfStr[1];
        String prenume = arrOfStr[2];
        String facultate = arrOfStr[3];
        Integer varsta = Integer.parseInt(arrOfStr[4]);
        Integer anStudiu = Integer.parseInt(arrOfStr[5]);

        this.nume = nume;
        this.prenume = prenume;
        this.facultate = facultate;
        this.varsta = varsta;
        this.anStudiu = anStudiu;

    }


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

    public Integer getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(Integer anStudiu) {
        this.anStudiu = anStudiu;
    }

    @Override
    public void greeting() {
        System.out.println("Sa traiti!");
    }

    @Override
    public void doWork() {
        System.out.println("Participam ore si facem teme.");
    }

    @Override
    public String toString() {
        return "Sd. " +
                 nume + " " +
                 prenume + ", Anul " +
                anStudiu+ ", Fac. " + facultate + ", Varsta " +
                varsta;
    }

    @Override
    public int compareTo(Human o) {

            return this.getVarsta().compareTo(o.getVarsta());

    }
}
