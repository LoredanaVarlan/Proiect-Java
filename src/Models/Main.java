package Models;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Afisarea datelor ultimului aboanment facut
        Utilizator[] utilizator = new Utilizator[2];
        utilizator[0]= new Utilizator("Ursu", "Ana", "ursuana@yahoo.com","ursuana","56789");
        utilizator[0].setAbonament("Standard",25);
        utilizator[0].getlastAbonament();



        //Ordonarea utilizatorilor dupa nume
        System.out.println("///////////////////////////////");
        utilizator[1]= new Utilizator("Grecu","Adela","grecuadela@yahoo.com","grecuadela","1234");
        UtilizatorService service = new UtilizatorImpl();
        service.getUtilizatorOrdonatDupaNume(utilizator);

        //Imprumutarea unei noi carti
        System.out.println("///////////////////////////////");
        Autor Jane = new Autor();
        Jane.setAutor("Austen","Jane"); //cream autor
        Carte C1 = new Carte();
        C1.setCarte("Mandrie si Prejudecata",Jane, "Romantic");  //cream carte
        utilizator[1].setImprumut(C1);

        //Afisarea imprumutului unui utilizator
        System.out.println("///////////////////////////////");
        utilizator[1].getImprumutactual();

        //Returnarea unei carti
        System.out.println("///////////////////////////////");
        utilizator[1].Returnare();
    }
}
