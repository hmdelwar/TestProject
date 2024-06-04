package classes;
import java.lang.Math;

public class Shape {

    //Code only works for polygons with n sides and all of equal lengths
    private double n, length;  //n is number of sides, length is the length of a side
    private double pi = Math.PI;
    private double angle = (2*pi)/n;

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
        setAngle();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        setAngle();
    }

    public void setAngle() {
        this.angle = (2*pi)/n;
    }

    public double getArea(){

        return(n*length*length*Math.cos(angle/2)*Math.sin(angle/2));
    }
}
