
import java.util.Scanner;

public class Controller {

    public Controller() {

    }// e constructor

    public void takeInput(Motor L, Motor R) {
        Scanner wordscan = new Scanner(System.in);
        String input;

        System.out.println("Controller is now active!");
        while (true) {
            System.out.println("Enter an input:");
            input = wordscan.nextLine().toLowerCase();
            if (input.equals("forward")) {
                L.setSpeed(5);
                R.setSpeed(5);
            } else if (input.equals("backward")) {
                L.setSpeed(-5);
                R.setSpeed(-5);
            } else if (input.equals("left")) {
                L.setSpeed(-5);
                R.setSpeed(5);
            } else if (input.equals("right")) {
                L.setSpeed(5);
                R.setSpeed(-5);
            } else if (input.equals("stop")) {
                L.setSpeed(0);
                R.setSpeed(0);
                break;
            } else {
                System.out.println("Invalid Input, please try again.");
            }
        }
    }// e pv takeInput
}// pc Controller
