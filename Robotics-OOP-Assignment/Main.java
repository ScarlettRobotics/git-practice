public class Main{
  public static void main(String[] args) {
    Motor left = new Motor(123);
    Motor right = new Motor(456);

    Controller con = new Controller();
    con.takeInput(left, right);
  }
}