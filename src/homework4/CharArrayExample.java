package homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }

        }
        System.out.println(count);

        System.out.println("++++++++++++");

        char[] chars1 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println(chars1[chars1.length / 2 - 1]);
        System.out.println(chars1[chars1.length / 2]);

        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'p'};
        if (chars2[chars2.length - 1] == 'y' && chars2[chars2.length - 2] == 'l') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        char[] text = {' ', 'b', 'a', 'r', 'e', 'v', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i] + " ");
            }
        }
    }
}





