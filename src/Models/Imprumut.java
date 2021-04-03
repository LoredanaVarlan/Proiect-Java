package Models;

public class Imprumut {

   Carte carte;
   Data data_imprumut;
   Data termen_limita;


   public Carte getCarte() {
      return carte;
   }

   public void setCarte(Carte carte) {
      this.carte = carte;
   }

   public Data getData_imprumut() {
      return data_imprumut;
   }

   public void setData_imprumut(Data data_imprumut) {
      this.data_imprumut = data_imprumut;
   }

   public Data getTermen_limita() {
      return termen_limita;
   }

   public void setTermen_limita(Data termen_limita) {
      this.termen_limita = termen_limita;
   }

   public Imprumut(Carte carte) {
      this.carte=carte;
   }
}
