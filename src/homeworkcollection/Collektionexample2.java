package homeworkcollection;

import java.util.*;

public class Collektionexample2 {
    private static Scanner scanner = new Scanner(System.in);
   private static Set<String> setNames = new HashSet<>(5);
   private static Set<String> sortedName = new HashSet<>(10);



    public static void main(String[] args) {
        //addHashSet();
        sortedNames();

    }

    private static void sortedNames() {
        System.out.println("input 10 names");
        while (sortedName.size()<10){
           String names = scanner.nextLine();
           if (sortedName.contains(names)){
               System.out.println("this name in hashset");
           }
           sortedName.add(names);
        }
        List<String> arrayList = new ArrayList<>(sortedName);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }


    private static void addHashSet() {
        System.out.println("input five names");
        while (setNames.size() < 5){
            String names = scanner.nextLine();
            if (setNames.contains(names)){
                System.out.println("this name in hashset");
            }
            setNames.add(names);
        }
        System.out.println(setNames);

    }
}
