package _006_ke_thua.thuc_hanh.th1;

public class TestShape {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        circle.setRadius(5);
        System.out.println(circle.toString()+circle.getColor()+"co dien tich: "+circle.getArea() );

    }
}
