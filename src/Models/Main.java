package Models;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carte> carti = CSVReader.citesteCartiCSV("carti.csv");
        //for (Carte b : carti) { System.out.println(b); }



        /*
        //1.Afisarea datelor ultimului abonament facut
        Utilizator[] utilizator = new Utilizator[2];
        utilizator[0] = new Utilizator("Ursu", "Ana", "ursuana@yahoo.com", "ursuana", "56789");
        utilizator[0].setAbonament("standard");
        utilizator[0].getcurrentAbonament();


        //2.Ordonarea utilizatorilor dupa nume
        System.out.println("///////////////////////////////");
        utilizator[1] = new Utilizator("Grecu", "Adela", "grecuadela@yahoo.com", "grecuadela", "1234");
        UtilizatorService service = new UtilizatorImpl();
        service.getUtilizatorOrdonatDupaNume(utilizator);

        //3.Imprumutarea unei noi carti
        System.out.println("///////////////////////////////");
        Autor[] autori = new Autor[2];
        autori[0] = new Autor("Austen", "Jane");
        Carte[] carti = new Carte[2];
        carti[0] = new Carte("Mandrie si Prejudecata", autori[0], "Romantic", 1);
        utilizator[1].setAbonament("standard");
        utilizator[1].setImprumut(carti[0]);

        //4.Afisarea imprumutului unui utilizator
        System.out.println("///////////////////////////////");
        utilizator[1].getcurrentImprumut();

        //5.Returnarea unei carti
        System.out.println("///////////////////////////////");
        utilizator[1].Returnare();

        //6.Schimbarea tipului de abonament (se face tot prin setAbonament)
        System.out.println("///////////////////////////////");
        utilizator[1].setAbonament("premium");

        //7.Afisare istoric abonamente
        System.out.println("///////////////////////////////");
        utilizator[1].getistoricAbonamente();

        //8.Dezabonare
        System.out.println("///////////////////////////////");
        utilizator[1].Dezabonare();
        utilizator[1].getcurrentAbonament();
        utilizator[1].setAbonament("advanced");

        //9.Afisarea tuturor restantierilor (celor care nu si-au returnat cartea la timp)
        System.out.println("///////////////////////////////");
        int restantieri = 0;
        for (int i = 0; i < utilizator.length; i++) {
            if (utilizator[i].getTermenLimitaImprumut() != null && utilizator[i].getTermenLimitaImprumut().compareTo(LocalDate.now()) < 0 && utilizator[i].getReturnat() == false) {
                utilizator[i].getUtilizator();
                restantieri++;
            }
        }
        if (restantieri == 0) {
            System.out.println("Nu exista niciun restantier.");
        } else {
            System.out.println("Numar de restantieri: " + restantieri);
        }


        //10.Afisam numarul de bucati disponibil pentru fiecare carte
        utilizator[0].setImprumut(carti[0]);
        autori[1]=new Autor("Dumas", "Alexandre");
        System.out.println("///////////////////////////////");
        carti[1]=new Carte("Contele de Monte-Cristo", autori[1], "Drama", 2);
        for(int i=0;i<carti.length;i++){
            System.out.println(carti[i].denumire+": "+carti[i].nr_bucati);
        }*/

    }
}

