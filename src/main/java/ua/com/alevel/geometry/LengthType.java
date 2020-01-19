package ua.com.alevel.geometry;

public class LengthType extends Number{
    double length = 0;
    public LengthType(double radius) throws InvalidLengthType {
        if(radius>0){
            this.length = radius;
        }else {
            throw  new InvalidLengthType("Length must be positive");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double radius) throws InvalidLengthType {
        if(radius>0){
            this.length = radius;
        }else {
            throw new InvalidLengthType("Length must be positive");
        }
    }

    @Override
    public int intValue() {
        return (int) length;
    }

    @Override
    public long longValue() {
        return (long) length;
    }

    @Override
    public float floatValue() {
        return (float) length;
    }

    @Override
    public double doubleValue() {
        return (double) length;
    }
}
