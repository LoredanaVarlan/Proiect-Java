package Models;

import java.time.LocalDate;

public class Carte {
    String denumire;
    Editura editura;
    Librarie librarie;
    Autor autor;
    String gen;
    LocalDate data_publicare;

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Editura getEditura() {
        return editura;
    }

    public void setEditura(Editura editura) {
        this.editura = editura;
    }

    public Librarie getLibrarie() {
        return librarie;
    }

    public void setLibrarie(Librarie librarie) {
        this.librarie = librarie;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }


    public void setCarte(String denumire, Autor autor, String gen) {
        this.denumire=denumire;
        this.autor = autor;
        this.gen=gen;

    }

}
