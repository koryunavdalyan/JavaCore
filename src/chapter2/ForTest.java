package chapter2;

public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println("ooooooo");
        for (int x = 0; x < 10; x++) {
            System.out.println("#");
            for (x = 0; x < 10; x = x + 1)
                System.out.println(" x: " + x);
        }

            int x, y;
            y = 20;
            for (x = 0; x < 10; x++) {
                System.out.println(" x; " + x);
                System.out.println(" y: " + y);
                y = y - 2;



            }
        }



    }
