import java.text.*;
public class RectangularPrism {

    private double length;
    private double width;
    private double height;

    DecimalFormat df = new DecimalFormat("#.00");

    public RectangularPrism(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void Print(){
        System.out.println("Rectangular prism parameters:\n"+
        " Length: "+ getLength()+"\n Width: "+getWidth()+"\n Height: "+getHeight()+
        "\n Volume: "+df.format(getVolume())+"\n Surface area: "+df.format(getSurfaceArea())+
        "\n Space diagonal: "+df.format(getSpaceDiagonal()));
    }

    public double getVolume(){ return length*width*height; }

    public double getSurfaceArea(){
        return 2*((width*length)+(height*length)+(height*width));
    }

    public double getSpaceDiagonal(){
        return Math.sqrt((Math.pow(length,2))+Math.pow(width,2)+Math.pow(height,2));
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
