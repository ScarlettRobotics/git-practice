public class Robot {
    public static void main(String [] args) {
        Motor leftMotor = new Motor(1, 1.0);
        Motor rightMotor = new Motor(2, 1.0);
        Controller controller = new Controller();
        while (true){
            controller.takeInput();
            leftMotor.setSpeed(controller.getLeft());
            rightMotor.setSpeed(controller.getRight());
        }
    }
}
