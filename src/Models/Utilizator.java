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

    public Utilizator(String nume, String prenume, String email, String username, String parola ){
        this.nume=nume;
        this.prenume=prenume;
        this.email=email;
        this.username=username;
        this.parola=parola;
        this.data_creare=LocalDate.now();

    }

    public void setUtilizator(String nume, String prenume, String email, String username, String parola ){
        this.nume=nume;
        this.prenume=prenume;
        this.email=email;
        this.username=username;
        this.parola=parola;
        this.data_creare=LocalDate.now();

    }

    public void getUtilizator(){
        System.out.println(nume);
        System.out.println(prenume);
        System.out.println(username);
    }


    public void setAbonament(String tip){
        if(abonament.length != 0 && abonament[abonament.length-1].getData_sfarsit()==null){
            abonament[abonament.length-1].setData_sfarsit();
            Abonament newAbonament = new Abonament(tip,LocalDate.now());
            abonament = Arrays.copyOf(abonament, abonament.length + 1);
            abonament[abonament.length - 1] = newAbonament;
            System.out.println("Tipul abonamentului a fost modificat cu succes!");
        }
        else {
            Abonament newAbonament = new Abonament(tip, LocalDate.now());
            abonament = Arrays.copyOf(abonament, abonament.length + 1);
            abonament[abonament.length - 1] = newAbonament;
            System.out.println("Abonamentul a fost creat cu succes!");
        }
    }

    public void setImprumut(Carte carte){
        if(abonament.length==0){
            System.out.println("Nu poti imprumuta deoarece nu ai abonament.");
        }
        else {
            Imprumut newImprumut = new Imprumut(carte, abonament[abonament.length - 1].getTip(), abonament[abonament.length - 1].getData_sfarsit());
            imprumut = Arrays.copyOf(imprumut, imprumut.length + 1);
            imprumut[imprumut.length - 1] = newImprumut;
            System.out.println("Imprumutul a fost efectuat cu succes!");
        }
    }

    public void getcurrentAbonament(){
        if(abonament[abonament.length-1].getData_sfarsit() == null){
        System.out.println(abonament[abonament.length-1].getTip());
        System.out.println(abonament[abonament.length-1].getPret());
        System.out.println(abonament[abonament.length-1].getdata_inceput());
}
        else{
            System.out.println("Utilizatorul nu este abonat in momentul de fata.");
        }
    }

    public void getcurrentImprumut(){
        if(imprumut.length==0){
            System.out.println("Aceasta persoana nu are niciun imprumut facut pana acum.");
        }
        else {
            if (imprumut[imprumut.length - 1].returnat == false) {
                imprumut[imprumut.length-1].getCarte();
                System.out.println("Data imprumutului: "+imprumut[imprumut.length - 1].data_imprumut);
                System.out.println("Termen limita: "+imprumut[imprumut.length - 1].termen_limita);
            } else {
                System.out.println("Persoana aceasta nu imprumuta in momentul de fata o carte.");
            }
        }
    }

    public void Returnare() {
        if (imprumut.length == 0) {
            System.out.println("Aceasta persoana nu are niciun imprumut facut pana acum.");
        } else {
            if (imprumut[imprumut.length - 1].returnat == false) {
                imprumut[imprumut.length-1].carte.nr_bucati++;
                imprumut[imprumut.length - 1].returnat = true;
                System.out.println("Cartea a fost marcata ca returnata cu succes.");
            } else {
                System.out.println("Ultima carte imprumutata a fost deja returnata.");
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public int compareTo(Utilizator o) {
        return o.nume.compareTo(this.nume);
    }

    public void getistoricAbonamente(){
        if(abonament.length != 0){
            for(int i=0;i<abonament.length;i++){
                System.out.println(abonament[i].getTip());
                System.out.println(abonament[i].getPret());
                System.out.println(abonament[i].getdata_inceput());
                System.out.println(abonament[i].getData_sfarsit());
            }
        }
        else{
            System.out.println("Acest utilizator nu a avut niciun abonament pana acum.");
        }
    }

    public void Dezabonare(){
        if(abonament[abonament.length-1].getData_sfarsit() != null){
            System.out.println("Nu te poti dezabona deoarece nu esti abonat");
        }
        else{
            abonament[abonament.length-1].setData_sfarsit();
            System.out.println("Dezabonarea a fost facuta cu succes!");
        }
    }
    public LocalDate getTermenLimitaImprumut(){
        if(imprumut.length!=0){
        return imprumut[imprumut.length-1].termen_limita;
        }
        else{
            return null;
        }
    }

    public boolean getReturnat(){
        if(imprumut.length!=0){
            return imprumut[imprumut.length-1].returnat;
        }
        else{
            return true;
        }
    }


}
