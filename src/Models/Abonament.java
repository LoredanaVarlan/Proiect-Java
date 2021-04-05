package Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Abonament {

    private String tip;
    private float pret;
    private LocalDate data_inceput;
    private LocalDate data_sfarsit;



    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
        setPret();
    }

    public float getPret() {
        return pret;
    }

    public void setPret() {
        String[] tipuri={"Free","Standard","Premium"};
        float[] preturi={0,20,50};
        for(int i=0;i<=2;i++){
            if(tip==tipuri[i])
                this.pret = preturi[i];
        }

    }


    public LocalDate getdata_inceput() {
        return data_inceput;
    }

    public LocalDate getData_sfarsit() {
        return data_sfarsit;
    }

    public void setData_sfarsit() {
        this.data_sfarsit = LocalDate.now();
    }

    public Abonament(String tip, LocalDate data_inceput) {
        String standard="standard";
        String advanced ="advanced";
        String premium="premium";

        if(tip==standard){
           this.pret=15;
            this.tip = tip;
            this.data_inceput = LocalDate.now();
        }
        else if(tip==advanced){
            this.pret=25;
            this.tip = tip;
            this.data_inceput = LocalDate.now();
        }
        else if(tip==premium){
            this.pret=50;
            this.tip = tip;
            this.data_inceput = LocalDate.now();
        }
        else{
            System.out.println("Nu exista acest tip de abonament.");
        }

    }
    //@Override
    public java.time.LocalDate parse(String value) {
        if (value == null || value.isEmpty() || value.equalsIgnoreCase("NULL"))
            return null;
        else return java.time.LocalDate.parse(value, java.time.format.DateTimeFormatter.ISO_LOCAL_DATE);
    }
}

