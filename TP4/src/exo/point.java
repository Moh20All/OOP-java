package exo;

public class point {
    private double x;
    private double y;

    public point(double a, double b) {
        this.x = a;
        this.y = b;
    }
    
    public double getx(point p) {
    	return x;
    }
    public double gety(point p) {
    	return y;
    }    
    public double distance(point p) {
        double a = this.x - getx(p);
        double b = this.y - gety(p);
		return a / b;
        
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
    public static void main() {
    	
    }
    public class Main {
        public static void main(String[] args) {
            point p1 = new point(5, 3);
            point p2 = new point(2, 1);
            
            System.out.println("Point 1: " + p1);
            System.out.println("Point 2: " + p2);
            
            double distance = p1.distance(p2);
            System.out.println("Distance between points: " + distance);
            
        }
    }

}
