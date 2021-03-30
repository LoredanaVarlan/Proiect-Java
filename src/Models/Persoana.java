package Models;

public class Persoana {

    protected String nume;
    protected String prenume;
    protected String email;
    protected String CNP;
    protected Data data_nasterii;
    protected boolean Sex;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public Data getData_nasterii() {
        return data_nasterii;
    }

    public void setData_nasterii(Data data_nasterii) {
        this.data_nasterii = data_nasterii;
    }

    public boolean isSex() {
        return Sex;
    }

    public void setSex(boolean sex) {
        Sex = sex;
    }
}
