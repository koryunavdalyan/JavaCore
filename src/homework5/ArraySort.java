package homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[]numbers={44, 7, 78, 92, 0, -9, 999};
        for (int i = 0; i <numbers.length; i++){
            for (int j = i+1; j<numbers.length ; j++) {
                if (numbers[i]> numbers[j]){
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j]=tmp;
                }
            }
            System.out.println(numbers[i]);

        }

        int[] num= {5,8,9,12,78,0,79,-2,70};
        for (int i = 0; i <num.length; i++) {
            for (int j = i+1; j <num.length ; j++) {
                if (num[i]<num[j]){
                    int tmp =  num[i];
                    num[i]=num[j];
                    num[j]=tmp;

                }

            }
            System.out.println(num[i]);
        }

    }
}
