package Models;

public class Abonament {

    private Utilizator utilizator;
    private String tip;
    private float pret;
    private Data data_inceput;

    public Utilizator getUtilizator() {
        return utilizator;
    }

    public void setUtilizator(Utilizator utilizator) {
        this.utilizator = utilizator;
    }

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
        for(int i=0;i<=3;i++){
            if(tip==tipuri[i])
                this.pret = preturi[i];
        }

    }

    public Data getData_inceput() {
        return data_inceput;
    }

    public void setData_inceput(Data data_inceput) {
        this.data_inceput = data_inceput;
    }
}
