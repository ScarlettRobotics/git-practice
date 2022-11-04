public class Robot {

    public static void main(String[] args) {
        Motor leftR = new Motor(123);
        Motor rightR = new Motor(321);
        Controller keyboard = new Controller();
        keyboard.takeInput(leftR, rightR);
    }
}
