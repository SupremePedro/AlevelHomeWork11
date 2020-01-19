package ua.com.alevel.geometry;

public final class Geometry2DCalculator {
    private Geometry2DCalculator() throws Exception{
        throw new Exception("Create Geometry2DCalculator object forbidden");
    }
    public static double getTriangleSquare(double x1,double y1, double x2, double y2,double x3,double y3){
        return Math.abs((x1-x3)*(y2-y3)-(x2-x3)*(y1-y3));
    }

    public static double getCircleSquare(LengthType r){
        return r.getLength()*r.getLength()*Math.PI;
    }

    public static double getParallelogramSquare(LengthType height, LengthType base){
        return height.getLength()*base.getLength();
    }

}
