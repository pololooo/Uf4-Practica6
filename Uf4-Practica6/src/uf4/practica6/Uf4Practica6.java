package uf4.practica6;

import java.util.*;

public class Uf4Practica6 {

    public static Scanner scan = new Scanner(System.in);

    private static Partit p;

    public static void main(String[] args) {
        int opc = 0;

        do {
            opc = Menu();
        } while (opc != 0);
    }

    public static int Menu() {
        int opc;

        System.out.println(" ");
        System.out.println("----------");
        System.out.println("PARTIT");
        System.out.println("1. Començar Partit");
        System.out.println("2. Mostrar Resultats");
        System.out.println("0. Sortir");
        opc = scan.nextInt();
        scan.nextLine();

        switch (opc) {
            case 1:
                ComençarPartit();
                break;
            case 2: 
                fi();
            default:
                System.out.println("Numero incorrecte.");
                break;
        }
        return opc;
    }

    public static void ComençarPartit() {
        String equipLocal;
        String equipVisitant;
        System.out.println("Nom del Equip Local:");
        equipLocal = scan.nextLine();
        System.out.println("Nom del Equip Visitant: ");
        equipVisitant = scan.nextLine();
    }
}
