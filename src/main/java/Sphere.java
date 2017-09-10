import java.text.*;
public class Sphere {

    private double radius;

    DecimalFormat df = new DecimalFormat("#.00");

    public Sphere(double radius) {
        this.radius = radius;
    }

    public void Print(){
        System.out.println("Sphere parameters:\n"+
        " Radius: "+ getRadius()+"\n Volume: "+ df.format(getVolume())+
        "\n Surface area: "+ df.format(getSurfaceArea()));
    }

    public double getVolume(){
        return (4/3)*Math.PI*Math.pow(radius,3);
    }

    public double getSurfaceArea(){ return 4*Math.PI*Math.pow(radius,2); }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
