// ---
// 0. getArea()

// 1. Квадрат
// 2. Прямоугольник
// 3. Круг
// 4. Ромб

// ---
// class Foo {
// int arg1;
// String arg2;
// double arg3;
// int arg4;
// String arg5;
// int arg6;
// String arg7;
// }
// new Foo(arg1:1);
// new Foo(arg1:1, arg2:"qwe");
// new Foo(arg1:1, arg7:"qwe");
// new Foo(arg2:"qweasd", arg7:"qwe");

public class Program {
    public static void main(String[] args) {
        Circle ci = new Circle(5);
        Square sq = new Square(5);
        Rectangle rect = new Rectangle(5,10);
        Rectangle rec = new Square(15);
        Figure fig = new Square(25);
        ci.getArea();
        sq.getArea();
        rect.getArea();
        fig.getArea();

    }
}
