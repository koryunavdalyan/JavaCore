package homework2;

import org.w3c.dom.ls.LSOutput;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {77, 86, 100, 405, 12, 78, 7, 23, 4, 10};
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) ;
        {
            if (min > array['i']) {
                min = array['i'];

            }
            System.out.println();
            System.out.println("min is:" + min);
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) ;
                {
                    max = array[i];


                }
                System.out.println();
                System.out.println("max is; ' + max);");

                for ( i = 0; i <array.length ; i++) {
                    if (array[i]%2 ==0) {
                        System.out.print(array[i]+ ",");
                }
                }
                System.out.println();
                System.out.println();

                for ( i = 0; i <array.length ; i++) {
                    if (array[i]% 2==1) {
                        System.out.print(array[i]+ ",");
                    }
                }
                System.out.println();
                System.out.println();

                int sum=0;
                for ( i =0; i<array.length; i++) {
                    sum+=array[i];
                }
                System.out.println(sum);
                System.out.println();


                System.out.println(array[0]);
                System.out.println();

                int lastindex= array.length -1;
                System.out.println(array[lastindex]);


                for ( i = 0; i < array.length; i++) {
                    if (array[i]%2==1) {
                        System.out.println(array [i]+ ",");
                    }

                }
                System.out.println();
                System.out.println();

                int even = 0;
                for ( i = 0; i <array.length; i++) {
                    if (array[i] % 2==0) {
                        even++;
                    }

                }
                System.out.println("zuygeri qanak = " + even);

                int odd = 0;
                for ( i = 0; i <array.length ; i++) {
                    if(array[i] % 2==1) {
                        odd++;
                    }
                }
                System.out.println("kenteri qanak = ' + odd");
                System.out.println();



            }

        }


    }

        }

        

