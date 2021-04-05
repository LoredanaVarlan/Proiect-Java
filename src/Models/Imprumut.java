package Models;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Imprumut {

   Carte carte;
   LocalDate data_imprumut;
   LocalDate termen_limita;
   boolean returnat;


   public void setCarte(Carte carte) {
      this.carte = carte;
   }


   public Imprumut(Carte carte, String tip_abonament, LocalDate data_sfarsit_abonament) {
      if(tip_abonament == null || data_sfarsit_abonament != null){
         System.out.println("Nu poti imprumuta nicio carte deoarece nu ai abonament.");
      }
      else if(tip_abonament=="standard") {
         this.carte = carte;
         this.data_imprumut = LocalDate.now();
         this.termen_limita = this.data_imprumut.plus(2, ChronoUnit.WEEKS);
         this.returnat = false;
         carte.nr_bucati--;
      }
      else{
         this.carte = carte;
         this.data_imprumut = LocalDate.now();
         this.termen_limita = this.data_imprumut.plus(1, ChronoUnit.MONTHS);
         this.returnat = false;
         carte.nr_bucati--;
      }
   }

   public void getCarte(){
      System.out.println("Denumire carte: "+carte.denumire);
      System.out.println("Autor: "+carte.autor.nume+" "+carte.autor.prenume);
      System.out.println("Gen: "+carte.gen);
      System.out.println("Editura: "+carte.editura);

   }


}
