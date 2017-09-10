import java.text.*;
public class Rhombus {

    private double q;
    private double p;
    private double a;

    DecimalFormat df = new DecimalFormat("#.00");

    public Rhombus(double q, double p, double a) {
        this.q = q;
        this.p = p;
        this.a = a;
    }

    public Rhombus(double q, double p) {
        this.q = q;
        this.p = p;
        this.a = Math.sqrt((Math.pow(q,2))+(Math.pow(p,2)))/2;
    }

    public void Print(){
        System.out.println("Rhombus parameters:\n"+
        " Diagonal q: "+getQ()+"\n Diagonal p: "+getP()+
        "\n Side a: "+df.format(getA())+"\n Area: "+df.format(getArea())+
        "\n Perimeter: "+df.format(getPerimeter()));
    }

    public double getArea(){
        return (p*q)/2;
    }

    public double getPerimeter(){ return 4*a; }

    public double getQ() {
        return q;
    }

    public void setQ(double q) {
        this.q = q;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

}
