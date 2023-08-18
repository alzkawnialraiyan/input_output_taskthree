import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //task3 rectangle area and perimeter
        System.out.println("To calculate the area and perimeter of the rectangle, please enter the values of the width and height");
        System.out.println("Enter value of the width: ");
        double w = read.nextDouble();
        System.out.println("Enter the value of the height: ");
        double h = read.nextDouble();
        double Arec = w*h;
        double Prec = 2*(h+w);

        System.out.println("Area of rectangle is: "+Arec);
        System.out.println("perimeter of rectangle is: "+Prec);
        System.out.println("\n");
    }
}