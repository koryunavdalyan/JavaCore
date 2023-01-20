package homework8;

public class RetOb {
    public static void main(String [] args) {
        Test ob = new Test(2);
        Test оb2;
        оb2 = ob.incrByTen();
        System.out.println("ob.a: " + ob.а);
        System.out.println("ob2.a: " + оb2.а);
        оb2 = ob.incrByTen();
        System.out.println();

    }
}

