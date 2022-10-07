public class Romb extends Figure {
    int height; // высота
    int a; // сторона

    @Override
    public void getArea(){
        System.out.println(height*a);
    }
}
