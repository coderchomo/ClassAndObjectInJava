import java.util.Scanner;

public class Lv2Equation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        a=sc.nextDouble();
        System.out.println("Enter b");
        b= sc.nextDouble();
        System.out.println("Enter c");
        c= sc.nextDouble();
        QuadraticEquation equation=new QuadraticEquation(a,b,c);
        double delta;
        delta=equation.getDelta();
        if(delta<0){
            System.out.println("The equation has no roots");
        }else{
            if(delta==0){
                System.out.println("The equation have 1 root: "+(-b+Math.sqrt(delta))/(2*a));
            }else{
                System.out.println("The equation have 2 roots.Root 1 is: "+(-b+Math.sqrt(delta))/(2*a)+" And Root 2 is: "+(-b-Math.sqrt(delta))/(2*a));
            }
        }
    }
}
