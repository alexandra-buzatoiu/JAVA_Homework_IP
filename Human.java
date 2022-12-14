package ro.mta.ip.lab3JAVA.scthreads;

public interface Human extends Comparable<Human> {
    void greeting();
    void doWork();
    Integer getVarsta();
}
