package s4_oop.bai_tap.xay_dung_lop_fan;

public class Fan {
    public final  int SLOW=1;
    public final  int MEDIUM=2;
    public final  int FAST =3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String str="";
        if(isOn()==true){
            str="quat bat"+"mau sac:"+getColor()+"toc do"+getSpeed();
        }
        if ((isOn() == false)) {
            str="quat tat"+"mau sac:"+getColor();

        }
        return str;
    }

    public static void main(String[] args) {
        Fan fan=new Fan(2,true,5,"white");
        System.out.println(fan.toString());
    }
}
