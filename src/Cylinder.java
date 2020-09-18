public class Cylinder {


    public static double getVolume(int radius, int height){
        double volume = getPerimeter(radius) * height + 2 * getArea(radius);
        return volume;
    }

    public static double getArea(int radius){
        double area = Math.PI * radius * radius;
        return area;
    }

    public static double getPerimeter (int radius) {
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }
}