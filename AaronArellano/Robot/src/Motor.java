public class Motor {
    int motorId;
    double speed;

    public Motor(int motorId, double speed) {
        this.motorId = motorId;
        this.speed = speed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
        System.out.println("motor "+this.motorId+" speed set to "+this.speed);
    }
}
