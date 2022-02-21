public class Point {

    double x,y;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calcDistance (Point otherPoint){

        double dx = this.x - otherPoint.x;
        double dy = this.y - otherPoint.y;

        return Math.sqrt(dx*dx + dy*dy);
    }
}
