package Models;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Afisarea datelor ultimului aboanment facut
        Utilizator Ana = new Utilizator();
        Ana.setAbonament("Standard",25);
        Ana.getlastAbonament();


        //Ordonarea utilizatorilor dupa nume
        Utilizator Adela = new Utilizator();
        Adela.setUtilizator("Grecu","Adela","grecuadela@yahoo.com","grecuadela","1234");
        Ana.setUtilizator("Ursu", "Ana", "ursuana@yahoo.com","ursuana","56789");
        UtilizatorService service = new UtilizatorImpl();
        System.out.println(Arrays.toString(service.getUtilizatorOrdonatDupaNume()));



    }
}
