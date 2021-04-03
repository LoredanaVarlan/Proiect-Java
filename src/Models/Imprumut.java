package Models;

import java.time.LocalDate;

public class Imprumut {

   Carte carte;
   LocalDate data_imprumut;
   LocalDate termen_limita;
   boolean returnat;


   public Carte getCarte() {
      return carte;
   }

   public void setCarte(Carte carte) {
      this.carte = carte;
   }


   public Imprumut(Carte carte) {
      this.carte=carte;
      this.data_imprumut=LocalDate.now();
      this.returnat=false;
   }
}
