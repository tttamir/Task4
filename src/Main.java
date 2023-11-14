import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Vvedi razmer massiva: ");
        int a = sc.nextInt();
        int[] arr =new  int[a];
        System.out.println("1. - vvesti elementu samomu; 2. - random");
        int x = sc.nextInt();
        int q;
        switch (x){
            case 1: System.out.println("Tu vibral samomu");
                for (int i = 0; i < arr.length; i++) {
                    System.out.print("["+i+"] = ");
                    q = sc.nextInt();
                    arr[i]=q;
                }
                for ( int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
                break;

            case 2: System.out.println("Tu vibral randomno");
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(-10, 10);
                }
                    for ( int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i]);
                    }
                    break;
    }


        System.out.println("-Task1-");
        for ( int i= arr.length-1; i>=0 ; i--) {
            System.out.println(arr[i]);
        }

        System.out.println("-Task2,3-");
        int max = arr[0];
        int min = arr[0];
        int indexmax = 0;
        int indexmin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
                indexmax = i;

            }
        }
        for (int i = 1; i < arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
                indexmin = i;
            }
        }
        System.out.println("max = "+max);
        System.out.println("index max = "+ indexmax);
        System.out.println("min = "+min);
        System.out.println("index min = "+ indexmin);

        System.out.println("-Task4-");
        int counter0 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) counter0=counter0+1;
        }
        if (counter0 > 0)
        System.out.println("nulevuh elementov - " + counter0);
        else if (counter0 == 0) System.out.println("net nulevuh");


        System.out.println("-Task6-");
        boolean isIncreasing = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Vozrast");
        } else {
            System.out.println("Nevozrast");
        }


        System.out.println("Task5");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 ) {
                int temp= arr[i] ;
                arr[i] = arr[arr.length - 1 - i ];
                arr[arr.length - 1 - i] = temp;
                System.out.println(arr[i]);
            }
        }

         int p = sc.nextInt();
        int[] arr1 =new  int[p];
        int w;
        System.out.println("Task*");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("["+i+"] = ");
            w = sc.nextInt();
            arr1[i]=w;
        }
        for ( int i = 0; i < arr1.length; i++) {
            System.out.println(arr[i]);
        }

    }
}