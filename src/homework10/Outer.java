package homework10;

public class Outer {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) ;
    }

    class Inner {
        void display() {
            System.out.println();
            {

            }
        }
    }

    Inner inner = new Inner();

    public Inner getInner() {
        return inner;
    }
}



