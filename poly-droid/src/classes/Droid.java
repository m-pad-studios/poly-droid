package classes;

import interfaces.Model;

public class Droid implements Model {


    private String modelName;
    private int modelNumber;
    private String serialNumber;
    private boolean power;

  public  Droid(String modelNameParam, int modelNumberParam, String serialNumberParam, boolean powerParam) {
        this.modelName = modelNameParam;
        this.modelNumber = modelNumberParam;
        this.serialNumber = serialNumberParam;
        this.power = powerParam;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "THIS MODEL'S INFO IS LISTED BELOW\n*" + this.serialNumber + "*\n" + "*" + this.modelName + "*\n" + "*" + this.modelNumber + "*\n" + "*POWER:" + this.power + "*";
    }

    @Override
    public void printModelInfo() {
        System.out.println("[[[RETRIEVING MODEL INFO]]]");
        System.out.println(this.toString());
    }

    @Override
    public void checkStatus() {
            if(this.power == powerOn()) {
                System.out.println("[[[POWER IS ON]]]");
            } else if(this.power == powerOff()) {
                System.out.println("[[[POWER IS OFF]]]");
            }
    }


}
