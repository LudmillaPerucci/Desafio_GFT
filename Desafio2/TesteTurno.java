package Desafio_GFT.Desafio2;

import java.util.Scanner;

public class TesteTurno {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual turno você trabalha? ");
        String turno = scan.nextLine();

        String M; //Turno matutino
        String V; //Turno vespertino
        String N; //Turno noturno

        switch (turno) {
            case "M":
                System.out.println("Bom dia!");
                break;
            case "V":
                System.out.println("Boa tarde!");
                break;
            case "N":
                System.out.println("Boa noite!");
                break;
            default:
                System.out.println("Valor Inválido");
                break;
        }
    }
}