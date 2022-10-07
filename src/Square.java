public class Square extends Rectangle {

    public Square(int a){
        super(a,a);
    }
    public Square(){
        super(0,0);
    }
    @Override
    public void getArea(){
        System.out.println(a*a);
    }
}
