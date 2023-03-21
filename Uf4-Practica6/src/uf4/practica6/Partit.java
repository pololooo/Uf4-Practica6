package uf4.practica6;

public class Partit {

    private String nomEquipLocal;
    private String nomEquipVisitant;
    private int golsEquipLocal;
    private int golsEquipVisitant;

    Partit(String equipLocal, String equipVisitant) {
        this.nomEquipLocal = equipLocal;
        this.nomEquipVisitant = equipVisitant;
        this.golsEquipLocal = 0;
        this.golsEquipVisitant = 0;
    }

    Partit(String equipLocal, String equipVisitant, int golsEquipLocal, int golsEquipVisitant) {
        this.nomEquipLocal = equipLocal;
        this.nomEquipVisitant = equipVisitant;
        this.golsEquipLocal = golsEquipLocal;
        this.golsEquipVisitant = golsEquipVisitant;
    }

    public void marcaEquipLocal() {
        golsEquipLocal++;
    }

    public void marcaEquipVisitant() {
        golsEquipVisitant++;
    }

    public void marcador(String equipLocal, String equipVisitant, int golsEquipLocal, int golsEquipVisitant) {
        System.out.println(equipLocal);
        System.out.println(golsEquipLocal);
        System.out.println(equipVisitant);
        System.out.println(golsEquipVisitant);
    }

    public void fi(String equipLocal, String equipVisitant) {
        if (golsEquipLocal > golsEquipVisitant) {
            System.out.println("El guanyador es: " + equipLocal);
        } else if (golsEquipLocal < golsEquipVisitant) {
            System.out.println("El guanyador es: " + equipVisitant);
        } else {
            System.out.println("Empat");
        }
    }

    public String getNomEquipLocal() {
        return nomEquipLocal;
    }

    public void setNomEquipLocal(String nomEquipLocal) {
        this.nomEquipLocal = nomEquipLocal;
    }

    public String getNomEquipVisitant() {
        return nomEquipVisitant;
    }

    public void setNomEquipVisitant(String nomEquipVisitant) {
        this.nomEquipVisitant = nomEquipVisitant;
    }

    public int getGolsEquipLocal() {
        return golsEquipLocal;
    }

    public void setGolsEquipLocal(int golsEquipLocal) {
        this.golsEquipLocal = golsEquipLocal;
    }

    public int getGolsEquipVisitant() {
        return golsEquipVisitant;
    }

    public void setGolsEquipVisitant(int golsEquipVisitant) {
        this.golsEquipVisitant = golsEquipVisitant;
    }

}
