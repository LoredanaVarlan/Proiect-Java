package Models;

import java.time.LocalDate;

public class Autor extends Persoana{

    LocalDate data_deces;

    public LocalDate getData_deces() {
        return data_deces;
    }

    public void setData_deces(LocalDate data_deces) {
        this.data_deces = data_deces;
    }

    public void setAutor(String nume, String prenume){
        this.nume=nume;
        this.prenume=prenume;

    }


}
