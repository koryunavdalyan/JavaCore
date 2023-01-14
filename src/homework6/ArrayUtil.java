package homework6;

public class ArrayUtil {
    void maxOfArray(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println(max);
    }

    void minOfArray(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length ; i++) {
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }

    void bubbleSort(int[]array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i]>array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]= tmp;
                }
            }
            System.out.print(array[i]+" ");

        }


    }
    void bubbleSortReverse(int[]array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]<array[j]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
            }
            System.out.print(array[i]+" ");
        }
    }
}
