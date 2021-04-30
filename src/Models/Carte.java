package Models;

import java.time.LocalDate;

public class Carte {
    String denumire;
    Editura editura;
    Librarie librarie;
    Autor autor;
    String gen;
    LocalDate data_publicare;
    int nr_bucati;

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

    public LocalDate getData_publicare() {
        return data_publicare;
    }

    public void setData_publicare(LocalDate data_publicare) {
        this.data_publicare = data_publicare;
    }

    public int getNr_bucati() {
        return nr_bucati;
    }

    public void setNr_bucati(int nr_bucati) {
        this.nr_bucati = nr_bucati;
    }

    public Carte(String denumire, Autor autor, String gen, int nr_bucati) {
        this.denumire=denumire;
        this.autor = autor;
        this.gen=gen;
        this.nr_bucati=nr_bucati;

    }
    public Carte(){

    }

}
