package Models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Abonament {

    private String tip;
    private float pret;
    private LocalDate data_inceput;



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

    public Abonament(String tip, float pret, LocalDate data_inceput) {
        this.tip = tip;
        this.pret = pret;
        this.data_inceput = LocalDate.now();
    }
}

//urmeaza ca setPret sa fie inlocuita cu o colectie de tip map