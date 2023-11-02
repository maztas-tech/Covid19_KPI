package comparators;

import datasource.Covid19Data;

import java.util.Comparator;

public class AldersGruppeComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data data1, Covid19Data data2){
        return data1.getAldersgruppe().compareTo(data2.getAldersgruppe());
    }
}
