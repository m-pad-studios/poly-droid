package interfaces;

public interface Model {

    void printModelInfo();
    void checkStatus();
    default boolean powerOn() {return true;}
    default boolean powerOff() {return false;}

}
