package Models;

public class Carte {
    Editura editura;
    Librarie librarie;
    Autor autor;
    String gen;
    Data data_publicare;

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

    public Data getData_publicare() {
        return data_publicare;
    }

    public void setData_publicare(Data data_publicare) {
        this.data_publicare = data_publicare;
    }
}
