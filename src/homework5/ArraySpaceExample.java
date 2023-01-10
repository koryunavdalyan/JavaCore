package homework5;

public class ArraySpaceExample {
    public static void main(String[] args) {
        char[] spaceAraay = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int firstIndex = 0;
        int lastIndex = spaceAraay.length - 1;
        while (firstIndex < lastIndex && spaceAraay[firstIndex] == ' ') {
            firstIndex++;
        }
        while (firstIndex < lastIndex && spaceAraay[lastIndex] == ' ') {
            lastIndex--;
        }

        char[]result = new char[(lastIndex-firstIndex)+1];
        int index=0;
        for (int i = firstIndex; i <lastIndex+1 ; i++) {
            result[index++] = spaceAraay[i];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }
}
