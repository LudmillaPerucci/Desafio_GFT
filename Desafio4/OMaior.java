package Desafio_GFT.Desafio4;

import java.util.*;

public class OMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maiorAb;
        int a = scan.nextInt();
        int b = scan.nextInt();
        int abs = scan.nextInt();
        
        maiorAb = (a + b  + abs(a - b)) / 2;

        System.out.println("Eh o maior:" + maiorAb);
        


}

    private static int abs(int i) {
        return 0;
    }
}
