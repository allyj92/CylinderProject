public class Cylinder extends Circle{
    private double height;

    public Cylinder(double Radius,double height){
        super(Radius);

        this.height = height<0?0:height;
    }

    public double getHeight() {
        return height;
    }


    public double getVolume(){
        return getArea() * height;
    }
}