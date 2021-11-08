
public class Motor {

    public int motorID;

    public Motor(int ID) {
        motorID = ID;
    }// e constructor

    public void setSpeed(double speed) {
        System.out.println("Motor " + motorID + " speed set to " + speed);
    }// e pv setSpeed
}// e pc Motor
