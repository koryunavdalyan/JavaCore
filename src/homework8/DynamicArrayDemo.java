package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicarray =new DynamicArray();
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.print();
        System.out.println();
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.add(8);
        dynamicarray.print();
        System.out.println(dynamicarray.getByIndex(100));
        System.out.println(dynamicarray.getByIndex(3));


    }
}
