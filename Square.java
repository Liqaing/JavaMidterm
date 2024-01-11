public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2, 3);
        System.out.println("rec area: " + rec.getArea());
        System.out.println("rec pri: " + rec.getPerimeter());

        Square squ = new Square(4);
        System.out.println("squ are: " + squ.getArea());
        System.out.println("squ pri: " + squ.getPerimeter());

    }
}
