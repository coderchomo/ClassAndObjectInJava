public class QuadraticEquation {
    double a,b,c,delta;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        delta=Math.pow(b,2)-4*a*c;
        return delta;
    }
}
