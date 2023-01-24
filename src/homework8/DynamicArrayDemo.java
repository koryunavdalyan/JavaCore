package homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicarray = new DynamicArray();
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
        System.out.println();
        System.out.println();
        System.out.println("Array is empty: " + dynamicarray.isEmpty());
        System.out.println("Get element by index: " + dynamicarray.getByIndex(2));
        System.out.println("Get index by element: " + dynamicarray.getFirstIndexByValue(6));
        System.out.print("Set method: ");
        dynamicarray.set(2, 8);
        System.out.println();
        System.out.print("Delete method: ");
        dynamicarray.delete(2);
        dynamicarray.print();
        System.out.println();
        System.out.print("Add method: ");
        dynamicarray.add(1, 300);
        dynamicarray.print();
    }
}

