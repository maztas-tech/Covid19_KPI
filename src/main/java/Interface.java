import comparators.AldersGruppeComparator;
import comparators.IndlagteComparator;
import comparators.RegionComparator;
import datasource.Covid19Data;
import datasource.FileHandler;

import java.util.Collections;
import java.util.Scanner;

public class Interface {
    FileHandler f = new FileHandler();

    public void startProgram() {
        f.fileHandler();
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.println("""
                1: Sort by region
                2: Sort by age
                3: Sort by death""");

        userInput = input.nextInt();
        switch (userInput){
            case 1:
                regionSort();
                break;
            case 2:
                alderSort();
                break;
            case 3:
                indlagteSort();
                break;


        }
    }


    private void regionSort(){
        System.out.println("Sorted by region");
        Collections.sort(f.getCovid19DataArrayList(), new RegionComparator());
        for (Covid19Data coviddata: f.getCovid19DataArrayList()) {
            System.out.println(coviddata);
        }
    }

    private void alderSort(){
        System.out.println("Sorted by age");
        Collections.sort(f.getCovid19DataArrayList(), new AldersGruppeComparator());

        for (Covid19Data coviddata: f.getCovid19DataArrayList()) {
            System.out.println(coviddata);
        }
    }

    private void indlagteSort(){
        System.out.println("Sorted by age: ");
        Collections.sort(f.getCovid19DataArrayList(), new IndlagteComparator());

        for (Covid19Data coviddata: f.getCovid19DataArrayList()) {
            System.out.println(coviddata);
        }
    }




}
