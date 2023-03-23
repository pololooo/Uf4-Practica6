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
        System.out.println("2. Gol EquipLocal");
        System.out.println("3. Gol EquipVisitant");
        System.out.println("4. Mostrar Resultats");
        System.out.println("0. Sortir");
        opc = scan.nextInt();
        scan.nextLine();

        switch (opc) {
            case 1:
                ComençarPartit();
                break;
            case 2:
                GolEquipLocal();
                break;
            case 3:
                GolEquipVisitant();
                break;
            case 4:
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

    public static void GolEquipLocal() {

    }

    public static void GolEquipVisitant() {

    }

    public static void fi() {
        String equipLocal;
        String equipVisitant;
        int golsEquipLocal;
        int golsEquipVisitant;
        System.out.println(p.getNomEquipLocal() + " amb " + p.getGolsEquipLocal());
        System.out.println(p.getNomEquipVisitant() + " amb " + p.getGolsEquipVisitant());
    }
}
