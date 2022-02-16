package Test;

public class CircleTest {
public static void main(String[] args){
    Circle c1=new Circle();
    c1.radius=2.1;
    double area=c1.findArea();
    System.out.println("圆的面积为"+area);
    c1.findArea1();
}
}
class Circle{
    double radius;
    public double findArea(){
        double area=3.14*radius*radius;
        return area;
    }

    public void findArea1(){
        double area=Math.PI*radius*radius;
        System.out.println("圆的面积为："+area);
    }
}
