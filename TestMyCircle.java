public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c1 = new MyCircle();
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
        System.out.println("center is: " + "(" + c1.getCenter() + ")");
        System.out.println("x center is: " + c1.getCenterX());
        System.out.println("y center is: " + c1.getCenterY());
        System.out.println("x and y center is: " + c1.getCenterXY());
        System.out.println("area is: " + c1.getArea());
        System.out.println("circumference is " + c1.getCircumference());
        System.out.println("distance is: " + c1.distance(c1));
    }
}
