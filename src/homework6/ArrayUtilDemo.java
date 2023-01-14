package homework6;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr={8, 856,444,7, 0, -45, 777};
        arrayUtil.maxOfArray(arr);
        arrayUtil.minOfArray(arr);
        arrayUtil.bubbleSort(arr);
        arrayUtil.bubbleSortReverse(arr);
    }
}

