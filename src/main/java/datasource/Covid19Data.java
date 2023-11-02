package datasource;

public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekTilfældeIAlt;
    private int døde;
    private int indlagtePåIntesivAfdeling;
    private int indlagte;



    public Covid19Data(String region, String aldersgruppe, int bekTilfældeIAlt, int døde, int indlagtePåIntesivAfdeling,
                       int indlagte){
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.bekTilfældeIAlt = bekTilfældeIAlt;
        this.døde = døde;
        this.indlagtePåIntesivAfdeling = indlagtePåIntesivAfdeling;
        this.indlagte = indlagte;
    }


    public String getRegion() {
        return region;
    }

    public String getAldersgruppe(){
        return aldersgruppe;
    }

    @Override
    public String toString() {
        return
                "Region: " + region + '\'' +
                " Aldersgruppe: " + aldersgruppe + '\'' +
                " BekTilfældeIAlt: " + bekTilfældeIAlt +
                " Døde: " + døde +
                " IndlagtePåIntesivAfdeling: " + indlagtePåIntesivAfdeling +
                " Indlagte: " + indlagte;
    }
}
