package homework8;

public class RecTest {
    int values[];

    RecTest(int i) {
        values = new int[i];
    }

    void printArray(int i) {
        if (i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
class Recursion2 {
    public static void main(String[] args) {
        RecTest оb = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++) оb.values[i] = i;
        оb.printArray(10);
    }
}


