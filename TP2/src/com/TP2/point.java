package com.TP2;

public class point {
    private double x;
    private double y;

    public point(double a, double b) {
        this.x = a;
        this.y = b;
    }
    
    public double getx(point p) {
    	return this.x;
    }
    public double gety(point p) {
    	return this.y;
    }    
    public double distance(point p) {
        double a = this.x - getx(p);
        double b = this.y - gety(p);
		return a;
        
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    public static void main() {
    	
    }
}
