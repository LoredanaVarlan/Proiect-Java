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
    public void getImprumutactual(){
        if(imprumut[imprumut.length-1].returnat==false){
        System.out.println(imprumut[imprumut.length-1].carte.denumire);
        System.out.println(imprumut[imprumut.length-1].carte.autor.nume);
        System.out.println(imprumut[imprumut.length-1].carte.autor.prenume);
        System.out.println(imprumut[imprumut.length-1].carte.gen);
        System.out.println(imprumut[imprumut.length-1].data_imprumut);
        System.out.println(imprumut[imprumut.length-1].termen_limita);
        }
        else {
            System.out.println("Persoana aceasta nu imprumuta in momentul de fata o carte.");
        }
    }

    public void Returnare(){
        if(imprumut[imprumut.length-1].returnat==false){
            imprumut[imprumut.length-1].returnat=true;
            System.out.println("Cartea a fost marcata ca returnata cu succes.");
        }
        else{System.out.println("Ultima carte imprumutata a fost deja returnata.");}
    }



}
