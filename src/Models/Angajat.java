package Models;

import java.time.LocalDate;

public class Angajat extends Persoana{

    private LocalDate data_angajarii;
    private String pozitie;
    private String salariu;

    public String getPozitie() {
        return pozitie;
    }

    public void setPozitie(String pozitie) {
        this.pozitie = pozitie;
    }

    public String getSalariu() {
        return salariu;
    }

    public void setSalariu(String salariu) {
        this.salariu = salariu;
    }
}
