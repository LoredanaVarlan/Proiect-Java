package Models;

import java.util.Comparator;

public class ComparatorNume implements Comparator<Utilizator> {

    @Override
    public int compare(Utilizator o1, Utilizator o2) {
        return o1.getNume().compareTo(o2.getNume());
    }
}