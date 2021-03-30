package Models;

public class Utilizator extends Persoana{

    private String username;
    private String parola;
    private Data data_creare;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public Data getData_creare() {
        return data_creare;
    }

    public void setData_creare(Data data_creare) {
        this.data_creare = data_creare;
    }
}
