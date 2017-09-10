import com.github.kiprobinson.bigfraction.BigFraction;

import java.math.BigDecimal;
import java.text.*;
public class Square {

    private double length;

    DecimalFormat df = new DecimalFormat("#.00");

    public Square(double length) {
        this.length = length;
    }

    public void Print(){
        System.out.println("Square parameters:\n"+
        " Length: "+ getLength()+"\n Area: "+df.format(getArea())+
        "\n Perimeter: "+df.format(getPerimeter()));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter(){
        return  length *4;
    }

    public  double getArea(){
        return Math.pow(length,2);
    }
}
