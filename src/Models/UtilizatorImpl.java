package Models;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.time.LocalDate;

public class UtilizatorImpl implements UtilizatorService{

    Utilizator[] utilizator = new Utilizator [10];


    @Override
    public Utilizator[] getUtilizatorOrdonatDupaNume() {
        Utilizator[] clone = utilizator.clone();
        Arrays.sort(clone, new ComparatorNume());
        return clone;
    }
}
