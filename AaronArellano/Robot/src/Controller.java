import java.util.Scanner;
import java.lang.Math;

public class Controller {
    private double left;
    private double right;


    public Controller() {}

    public void takeInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");

        switch (scanner.nextLine()) {
            case "forward":
                left = 1.0;
                right = 1.0;
                break;
            case "backward":
                left = -1.0;
                right = -1.0;
                break;
            case "left":
                left = -1.0;
                right = 1.0;
                break;
            case "right":
                left = 1.0;
                right = -1.0;
                break;
            default:
                break;
            }
        }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }
}
