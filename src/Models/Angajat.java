package Models;

public class Angajat extends Persoana{

    private Data data_angajarii;
    private String pozitie;
    private String salariu;

    public Data getData_angajarii() {
        return data_angajarii;
    }

    public void setData_angajarii(Data data_angajarii) {
        this.data_angajarii = data_angajarii;
    }

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
