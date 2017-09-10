import java.text.*;
public class Cube {

    private double length;

    DecimalFormat df = new DecimalFormat("#.00");

    public Cube(double length) {

        this.length = length;
    }

    public void Print(){
        System.out.println("Cube parameters:\n"+
        " Length: "+ getLength()+ "\n Surface area: "+ df.format(getSurfaceArea())+
        "\n Volume: "+ df.format(getVolume())+ "\n Space diagonal: "+ df.format(getSpaceDiagonal()));
    }

    public double getSurfaceArea(){
        return 6*Math.pow(length,2);
    }

    public double getVolume(){
        return Math.pow(length,3);
    }

    public double getSpaceDiagonal(){
        return Math.sqrt(3)*length;
    }

    public double getLength() { return length; }

    public void setLength(double length) {
        this.length = length;
    }

}
