import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double width, height;
        System.out.println("Enter width: ");
        width = sc.nextDouble();
        System.out.println("Enter height: ");
        height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle: "+rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+rectangle.getArea());
    }


}
