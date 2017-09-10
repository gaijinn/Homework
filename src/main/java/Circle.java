import com.github.kiprobinson.bigfraction.BigFraction;

import java.text.*;
public class Circle {

    private double radius;

    DecimalFormat df = new DecimalFormat("#.00");

    public Circle(double radius) {
        this.radius = radius;
    }

    public void Print(){
        System.out.println("Circle parameters:\n"+
        " Radius: "+getRadius()+"\n Circumference: "+df.format(getCircumference())+
        "\n Area: "+df.format(getArea())+"\n");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){ return Math.PI * Math.pow(radius,2); }
}
