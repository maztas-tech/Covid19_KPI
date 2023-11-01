package datasource;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public void fileHandler(){
        ArrayList<Covid19Data> covid19DataArrayList = new ArrayList<>();

        File file = new File("11_noegletal_pr_region_pr_aldersgruppe.csv");

        try (Scanner input = new Scanner(file, StandardCharsets.ISO_8859_1)){
            //
            input.nextLine();
            while (input.hasNextLine()){
                String line = input.nextLine();
                String[] values = line.split(";");

                //Skal tage udgangspunkt i SELVE CSV datasættet så length skal være 7 fordi vi har 7 columns, der har indeholder data
                if (values.length == 7){
                    String region = values[0].trim();
                    String aldersgruppe = values[1].trim();
                    int bekTilfældeIAlt = Integer.parseInt(values[2].trim());
                    int døde = Integer.parseInt(values[3].trim());
                    int indlagtePåIntesivAfdeling = Integer.parseInt(values[4].trim());
                    int indlagte = Integer.parseInt(values[5].trim());


                    Covid19Data covid19Data = new Covid19Data(region, aldersgruppe,
                            bekTilfældeIAlt, døde, indlagtePåIntesivAfdeling, indlagte);

                    covid19DataArrayList.add(covid19Data);
                }
                else {
                    System.out.println("Fejl i dataformat");
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Covid19Data covid19Data: covid19DataArrayList) {
            System.out.println(covid19Data);
        }
    }


}
