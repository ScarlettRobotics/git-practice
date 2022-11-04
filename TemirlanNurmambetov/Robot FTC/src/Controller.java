import java.util.Scanner;

public class Controller {

    // To create an instance of a controller we need a constructor
    public Controller(){}

    // Takes in input and performs an action based on the input
    public void takeInput(Motor leftR, Motor rightR){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Command: ");
        String move = input.nextLine();
        boolean on = true;

        while (on){
            if (move.equalsIgnoreCase("forward")){
                leftR.setSpeed(10);
                rightR.setSpeed(10);
                move = input.nextLine();
            } else if (move.equalsIgnoreCase("backward")){
                leftR.setSpeed(-5);
                rightR.setSpeed(-5);
                move = input.nextLine();
            } else if (move.equalsIgnoreCase("left")){
                leftR.setSpeed(-5);
                rightR.setSpeed(10);
                move = input.nextLine();
            } else if (move.equalsIgnoreCase("right")){
                leftR.setSpeed(10);
                rightR.setSpeed(-5);
                move = input.nextLine();
            } else if (move.equalsIgnoreCase("stop")){
                leftR.setSpeed(0);
                rightR.setSpeed(0);
                on = false;
            }
        }
    }
}
