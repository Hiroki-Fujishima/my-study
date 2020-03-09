//抽象クラス Figure
abstract class Figure {
    abstract void area();
    abstract void around();

    void measure() {
        area();
        around();
        System.out.println();
    }
}

//抽象クラスのサブクラスSquare
class Square extends Figure {
    double side;
    double height;

    Square(double s) { //コンストラクタ
        side = height = s;
    }

    Square(double s, double h) { //コンストラクタのオーバーロード
        side = s;
        height = h;
    }

    void area() { //抽象メソッドのオーバーライド
        System.out.println("四角形の面積：" + (side * height));
    }

    void around() { //抽象メソッドのオーバーライド
        System.out.println("四角形の外周：" + (2 * (side + height)));

    }
}

//抽象クラスのサブクラス Circle
class Circle extends Figure {
    final double pi = 3.14;
    double radius;

    Circle(double r) { //コンストラクタ
        radius = r;
    }

    void area() { //抽象メソッドのオーバーライド
        System.out.println("円の面積：" + (2 * radius * pi));
    }

    void around() { //抽象メソッドのオーバーライド
        System.out.println("円の外周：" + (2 * radius * pi));
    }
}

class SizeFigure {
    public static void main(String[] args) {
        Figure fig1 = new Square(2.5);
        Figure fig2 = new Square(2.3, 3.7);
        Figure fig3 = new Square(3.6);
        fig1.measure();
        fig2.measure();
        fig3.measure();
    }
}