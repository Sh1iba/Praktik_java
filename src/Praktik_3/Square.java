package Praktik_3;

public class Square extends Rectangle{
    public Square(){
        super(0,0);
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return width;
    }

    public void setSide(double side)
    {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(width);
    }

    @Override
    public void setLength(double side) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "\nColor: " + color + "\tFilled: " + filled + "\tSide: " + width +
                "\tArea: " + getArea() + "\tPerimeter: " + getPerimeter() + "\n";
    }


}
