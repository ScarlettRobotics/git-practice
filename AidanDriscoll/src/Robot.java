
public class Robot {

    public static void main(String[] args) {
        Motor left = new Motor(1);
        Motor right = new Motor(2);
        Controller controller = new Controller();

        // left.setSpeed(5);
        // right.setSpeed(8);
        controller.takeInput(left, right);
    }// e psv main
}// e pc Robot
