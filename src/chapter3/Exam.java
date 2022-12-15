package chapter3;

public class Exam {
    public static void main(String[] args) {
        for (int i = 7; i<=13; i++){
            System.out.println(i);
        }
        for (int i= 20; i > 10; i--){
            if (i==15){
                System.out.println(true);
            }
        }

        System.out.println("");

        for(int i = 0; i<100; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

        for( int i = 0; i<50; i++) {
            if (i % 2==1){
                System.out.println(i);
            }

        }
        int[] arr = {4,5,7,9,8};

    }
}
