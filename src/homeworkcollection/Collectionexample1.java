package homeworkcollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collectionexample1 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Mike");
        list.add("Ronaldo");
        list.add("Valod");
        list.add("Vardan");
        list.add("Eliz");
        //nameContains(list);
        //removeName(list);
        addNewName(list);

    }

    private static void addNewName(List<String> list) {
        String name = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        if (index < list.size()){
            list.add(index,name);
        }else {
            System.out.println("index big array size");
        }
        System.out.println(list);
    }

    private static void removeName(List<String> list) {
      String name = scanner.nextLine();
      if (list.contains(name)){
          list.remove(name);
      }
        System.out.println(list);
    }

    private static void nameContains(List<String> list) {
        String name = scanner.nextLine();
        if (list.contains(name)){
            System.out.println("this name is collection");
        }else {
            System.out.println("this name is not collection" );
        }

    }


}
