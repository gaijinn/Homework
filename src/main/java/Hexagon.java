import java.text.*;
public class Hexagon {

    private double length;

    DecimalFormat df = new DecimalFormat("#.00");

    public Hexagon(double length) {
        this.length = length;
    }

    public void Print(){
        System.out.println("Hexagon parameters:\n"+
        " Length: "+getLength()+"\n Area: "+df.format(getArea())+
        "\n Perimeter: "+df.format(getPerimeter()));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return ((3*Math.sqrt(3))/2)*Math.pow(length,2);
    }

    public double getPerimeter(){ return length*6; }
}
