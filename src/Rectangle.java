public class Rectangle extends Figure {
    int a;
    int b;

    Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    Rectangle(int a){

        this(a,a);
    }
    Rectangle(){

        this(0);
    }
    @Override
    public void getArea(){
        System.out.println(a*b);
    }
}
