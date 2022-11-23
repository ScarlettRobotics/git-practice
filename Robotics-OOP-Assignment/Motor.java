public class Motor{
  private int motorID;

  public Motor(int motorNum){
    motorID = motorNum;
  }

  public void setSpeed(double speed){
    System.out.println("motor " + motorID + " speed set to " + speed);
  }
}