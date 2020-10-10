package sample;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int min = 10;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        do{
            if (a % 10 > 0 && a % 10 < min) {
                min = a % 10;
            }
            a /= 10;
        }while (a != 0);
        System.out.println(min);
    }
}