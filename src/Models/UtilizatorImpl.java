package Models;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.time.LocalDate;
import java.util.*;


public class UtilizatorImpl implements UtilizatorService{

    Utilizator[] utilizator = new Utilizator [10];



    @Override
    public void getUtilizatorOrdonatDupaNume(Utilizator[] utilizatori) {
        Utilizator[] clone = utilizatori.clone();
        //Arrays.sort(clone, new ComparatorNume());
        for(int i=0;i< clone.length-1;i++){
            for(int j=i+1;j<clone.length;j++){
                if(clone[i].getNume().compareTo(clone[j].getNume())>0){
                    Utilizator temp;
                    temp=clone[i];
                    clone[i]=clone[j];
                    clone[j]=temp;
                }
            }
        }
        for(int i=0;i< clone.length;i++) {
            System.out.println(clone[i].getNume());
        }
    }


}
