import java.text.*;
public class Cone {

    DecimalFormat df = new DecimalFormat("#.00");
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void Print(){
        System.out.println("Cube parameters:\n"+
        " Radius: "+ getRadius() +"\n Height: "+ getHeight()+
        "\n Volume: "+ df.format(getVolume()) +"\n Slant height: "+ df.format(getSlantHeight())+
        "\n Lateral surface: "+ df.format(getLateralSurface())+ "\n Surface area: "+ df.format(getSurfaceArea())+
        "\n Base area: "+ df.format(getBaseArea()));
    }

    public double getVolume(){ return Math.PI*Math.pow(radius,2)*(height/3); }

    public  double getSlantHeight(){ return Math.sqrt(Math.pow(radius,2)+Math.pow(height,2)); }

    public double getLateralSurface(){ return Math.PI*radius*Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)); }

    public double getSurfaceArea(){ return Math.PI*radius*(radius+Math.sqrt(Math.pow(radius,2)+Math.pow(height,2))); }

    public double getBaseArea(){ return Math.PI*Math.pow(radius,2); }

    public double getRadius() { return radius; }

    public void setRadius(double radius) { this.radius = radius; }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }
}
