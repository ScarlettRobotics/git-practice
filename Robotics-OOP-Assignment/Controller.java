import java.util.*;

public class Controller{
  public Scanner wordscan = new Scanner(System.in);

  public Controller(){
    
  }
  
  public void takeInput(Motor left, Motor right){
    while(true){
      System.out.println("Enter control (forward/backward/left/right/stop): \n");
      String control = wordscan.nextLine().toLowerCase();
      if(control.equals("forward")){
        left.setSpeed(1.0);
        right.setSpeed(1.0);
        System.out.println("");
      } else if (control.equals("backward")){
        left.setSpeed(-1.0);
        right.setSpeed(-1.0);
        System.out.println("");
      } else if (control.equals("left")){
        left.setSpeed(-1.0);
        right.setSpeed(1.0);
        System.out.println("");
      } else if (control.equals("right")){
        left.setSpeed(1.0);
        right.setSpeed(-1.0);
        System.out.println("");
      } else if (control.equals("stop")){
        left.setSpeed(0.0);
        right.setSpeed(0.0);
        System.out.println("");
        break;
      } else{
        System.out.println("\nInvalid input. Please try again.\n");
      }
    }
    
    
  }
}