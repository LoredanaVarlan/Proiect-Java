package Models;

import java.util.Arrays;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;


public class Utilizator extends Persoana{

    private String username;
    private String parola;
    private LocalDate data_creare;
    private Abonament[] abonament = new Abonament[0];
    private Imprumut[] imprumut = new Imprumut[0];

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


    public void setUtilizator(String nume, String prenume, String email, String username, String parola ){
        this.nume=nume;
        this.prenume=prenume;
        this.email=email;
        this.username=username;
        this.parola=parola;
        this.data_creare=LocalDate.now();

    }

    public void setAbonament(String tip, float pret){
        Abonament newAbonament = new Abonament(tip, pret,LocalDate.now());
        abonament = Arrays.copyOf(abonament, abonament.length + 1);
        abonament[abonament.length - 1] = newAbonament;

    }

    public void setImprumut(Carte carte){
        Imprumut newImprumut = new Imprumut(carte);
        imprumut = Arrays.copyOf(imprumut, imprumut.length + 1);
        imprumut[imprumut.length - 1] = newImprumut;
    }

    public void getlastAbonament(){
        System.out.println(abonament[abonament.length-1].getTip());
        System.out.println(abonament[abonament.length-1].getPret());
        System.out.println(abonament[abonament.length-1].getdata_inceput());
    }




}
