import comparators.AldersGruppeComparator;
import comparators.RegionComparator;
import datasource.Covid19Data;
import datasource.FileHandler;

import java.util.Collections;
import java.util.Scanner;

public class Interface {
    public void startProgram() {
        FileHandler f = new FileHandler();
        f.fileHandler();
        Scanner input = new Scanner(System.in);


        int userInput;

        System.out.println("""
                1: Sort by region
                2: Sort by age""");

        userInput = input.nextInt();



        switch (userInput){
            case 1:
                System.out.println("Sorted by region");
                Collections.sort(f.getCovid19DataArrayList(), new RegionComparator());
                for (Covid19Data coviddata: f.getCovid19DataArrayList()) {
                    System.out.println(coviddata);
                }
                break;
            case 2:
                System.out.println("Sorted by age");
                Collections.sort(f.getCovid19DataArrayList(), new AldersGruppeComparator());

                for (Covid19Data coviddata: f.getCovid19DataArrayList()) {
                    System.out.println(coviddata);
                }
                break;

        }


    }


}
