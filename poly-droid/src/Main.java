import classes.Droid;
import classes.Engineer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        System.out.println("Please browse our current inventory...");
        Droid droidOne = new Droid("MK1",0, "001", false);
        Engineer engOne = new Engineer("Mike", "2", "Robotics");

        engOne.checkDroid(droidOne);
        engOne.turnOnOrOffDroid(droidOne);
        engOne.checkDroid(droidOne);


    }
}