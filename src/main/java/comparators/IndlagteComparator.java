package comparators;

import datasource.Covid19Data;

import java.util.Comparator;

public class IndlagteComparator implements Comparator<Covid19Data> {
    @Override
    public int compare(Covid19Data data1, Covid19Data data2){
        return Integer.compare(data1.getIndlagte(), data2.getIndlagte());
    }
}
