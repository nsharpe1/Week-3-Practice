public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle()
    {
        center = new MyPoint(0,0);
        this.radius = 1;
    }
    public MyCircle(int x, int y, int radius)
    {
        center = new MyPoint(x, y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius)
    {
        this.center = center;
        this.radius = radius;
    }
    public int getRadius()
    {
        return this.radius;
    }
    public void setRadius(int radius)
    {
        this.radius = radius;
    }
    public MyPoint getCenter()
    {
        return this.center;
    }
    public void setCenter(MyPoint center)
    {
        this.center = center;
    }
    public int getCenterX()
    {
        return center.getX();
    }
    public void setCenterX(int x)
    {
        x = center.getX();
    }
    public int getCenterY()
    {
        return center.getY();
    }
    public void setCenterY(int y)
    {
        y = center.getY();
    }
    public int getCenterXY()
    {
        return center.getX() + center.getY();
    }
    public void setCenterXY(int x, int y)
    {
        x = center.getX();
        y = center.getY();
    }
    public String toString()
    {
        return ("MyCircle[radius=" + this.radius + ",center=(" + center + ")]");
    }
    public double getArea()
    {
        return (Math.pow(this.radius, this.radius));
    }
    public double getCircumference()
    {
        return (2*3.14*this.radius);
    }
    public double distance(MyCircle another)
    {
        return center.distance(another.center);
    }
}
