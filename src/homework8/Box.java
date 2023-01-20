package homework8;

public class Box {
    class Вох {
        double width;
        double height;
        double depth;

         void Box(double w, double h, double d) {
            width = w;
            height = h;
            depth = d;
        }
        double volume() {
            return width * height * depth;
        }
    }
}


