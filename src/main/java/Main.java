import java.util.Scanner;


public class Main {

    public  static void main(String[] args){
        String c;
        int a;
        double tempo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to 2D and 3D figures properties!");
        do {
            System.out.println("Please choose a type of a figure.\n 1. 3D\n 2. 2D");
            a = scanner.nextInt();
            switch(a){
                case 1:
                    System.out.println("Figures available:\n" +
                            " 1.Cone\n 2.Cube\n 3.Sphere\n 4.Rectangular prism");
                    a = scanner.nextInt();
                    switch (a){
                        case 1:
                            System.out.println("Please enter radius and height:");
                            Cone cone = new Cone(tempo = scanner.nextDouble(),tempo = scanner.nextDouble());
                            cone.Print();
                            break;
                        case 2:
                            System.out.println("Please enter length:");
                            Cube cube = new Cube(tempo = scanner.nextDouble());
                            cube.Print();
                            break;
                        case 3:
                            System.out.println("Please enter radius:");
                            Sphere sphere = new Sphere(tempo = scanner.nextDouble());
                            sphere.Print();
                            break;
                        case 4:
                            System.out.println("Please enter length, width, height:");
                            RectangularPrism recprism = new RectangularPrism(tempo = scanner.nextDouble(),tempo = scanner.nextDouble(),tempo = scanner.nextDouble());
                            recprism.Print();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Figures available:\n" +
                            " 1.Circle\n 2.Hexagon\n 3.Rhombus\n 4.Square");
                    a = scanner.nextInt();
                    switch (a){
                        case 1:
                            System.out.println("Please enter radius:");
                            Circle circle = new Circle(tempo = scanner.nextDouble());
                            circle.Print();
                            break;
                        case 2:
                            System.out.println("Please enter length:");
                            Hexagon hexagon = new Hexagon(tempo = scanner.nextDouble());
                            hexagon.Print();
                            break;
                        case 3:
                            System.out.println("Please enter both diagonal lengths:");
                            Rhombus rhombus = new Rhombus(tempo = scanner.nextDouble(),tempo = scanner.nextDouble());
                            rhombus.Print();
                            break;
                        case 4:
                            System.out.println("Please enter length:");
                            Square square = new Square(tempo = scanner.nextDouble());
                            square.Print();
                            break;
                    }
                    break;
            }
            System.out.println("Continue using program Y/N ?");
            c = scanner.next();
        }while (c.toLowerCase().equals("y"));
    }
}
