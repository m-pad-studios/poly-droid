package classes;

import interfaces.Model;

public class Engineer {

    private String name;
    private String rank;
    private String specialty;

    public Engineer(String nameParam, String rankParam, String specialtyParam) {
        this.name = nameParam;
        this.rank = rankParam;
        this.specialty = specialtyParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void checkDroid(Droid droid) {
        System.out.println("[CHECKING DROID]");
        droid.printModelInfo();
    }

    public void turnOnOrOffDroid(Droid droid) {
        if(!droid.isPower()) {
            droid.setPower(droid.powerOn());
            droid.checkStatus();
        }
        else if(droid.isPower()) {
            droid.setPower(droid.powerOff());
            droid.checkStatus();
        }

    }
}
