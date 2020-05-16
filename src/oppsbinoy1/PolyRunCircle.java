package oppsbinoy1;

public class PolyRunCircle extends PolyRunGeomatry {

    double radius = 3.1489;

    public PolyRunCircle(double radius) {
        this.radius = radius;
    }
    @Override
    double area(){
        System.out.println("Area of Circle : ");
        return (3.1489*radius*radius);
    }

}
