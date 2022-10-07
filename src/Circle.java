public class Circle extends Figure {
    int radius;

    Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void getArea(){
        System.out.println(Math.PI*radius*radius);
    }
}
