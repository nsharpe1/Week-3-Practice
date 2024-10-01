public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private double base1;
    private double base2;
    private double base3;

    public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3)
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    public MyTriangle (MyPoint v1, MyPoint v2, MyPoint v3)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString()
    {
        return("MyTriangle[v1=(" + x1 + "," + y1 + ")" + ",v2=(" + x2 + "," + y2 + ")" + ",v3=(" + x3 + "," + y3 + ")]");
    }
    public double getPerimeter(){
        double base1 = Math.sqrt(Math.pow((x1 - x1),2) + Math.pow((y1 - y1),2));
        double base2 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));
        double base3 = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));
        return base1 + base2 + base3;
    }
    // public String getType(){
        // if (base1 == base2/base3) {
            // return("equilateral");
        // }
    // }
}
