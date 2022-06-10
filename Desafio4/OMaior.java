package Desafio_GFT.Desafio4;

import java.util.*;

public class OMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maiorAb, total;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        maiorAb = (a + b + Math.abs(a - b)) / 2;
        total = (maiorAb + c + Math.abs(maiorAb - c)) / 2;
        System.out.println(total + " eh o maior");
    }
}
