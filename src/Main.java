import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // дин. массив

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Object());
        arrayList.add(1);
        arrayList.add("sdfgadfgasdg");
        arrayList.add(5.6);
        int k = (int)arrayList.get(2);

        // generics
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
       // numbers.add("adfgasdf");
        int t = numbers.get(0);






        Scanner scanner = new Scanner(System.in);
       // int x = scanner.nextInt();
        int x = 0;
        while(x>0) {
            x--;
        }
        do {
            // какая-то логика
        } while(x-5>10);
        for(int i=0;i<10;i++) {
            // какая-то логика
        }
        int i, j;
        for(i=0,j=6;i<10;i++,j--) {
            // какая-то логика
        }
        String[] str = new String[4]; // "" "" "" ""
        // foreach
        for(String s: str) {
            System.out.println(s);
        }
        int[] y = new int[10];
        Random random = new Random();
        for(int kk=0;kk<y.length;kk++) {
            y[kk] = random.nextInt(100);
        }
        for(Integer p: y) {
            System.out.print(p + " ");
        }
        int[][] q = new int[4][3];
        q[2][2] = 4;
        System.out.println();
       // printArray(q);
        /*
        1  2   3   4
        8  7   6   5
        9  10  11  12
        16 15  14  13
         */

            /*
        1  2   3
        8  7   6   5
        9  10
        16
         */
        // "рванные массивы"
        int[][] d = new int[4][];

        int[] w = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16};
        printSnake();
    }
    public static void printArray(int[][] x) {
        for(int i=0;i<x.length;i++) {
            for(int j=0;j<x[i].length;j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printSnake() {
        int[][] snake = new int[4][4];
        int counter = 1;
        for(int i=0;i<snake.length;i++) {
            if(i % 2 == 0) {
                 for(int j=0;j< snake.length;j++) {
                     snake[i][j] = counter;
                     counter++;
                 }
            }  else {
                for(int j=3;j>=0;j--) {
                    snake[i][j] = counter;
                    counter++;
                }
            }
        }
        for(int i=0;i< snake.length;i++) {
            for(int j=0;j< snake.length;j++) {
                System.out.print(snake[i][j] + "\t");
            }
            System.out.println();
        }

    }

}