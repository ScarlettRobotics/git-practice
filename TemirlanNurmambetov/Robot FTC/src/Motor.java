public class Motor {
    int motorID;

    public Motor(int mID){
        motorID = mID;
    }

    public void setSpeed(double speed){
        System.out.println("motor "+motorID+" speed set to "+speed);
    }

}
