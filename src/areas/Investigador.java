/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package areas;

/**
 *
 * @author Intel
 */
public abstract class Investigador implements UnitatDeRecerca {

    public final static int INVESTIGADOR_PRINCIPAL = 1;
    public final static int INVESTIGADOR_ASSOCIAT = 2;
    public final static int INVESTIGADOR_AUXILIAR = 3;

    private String codi;
    private String nom;
    private int experiencia;
    private double sou;

    public Investigador(String codi, String nom, int experiencia, double sou) {
        this.codi = codi;
        this.nom = nom;
        this.experiencia = experiencia;
        this.sou = sou;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSou() {
        return sou;
    }

    public void setSou(double sou) {
        this.sou = sou;
    }

    @Override
    public void updateUnitatDeRecerca() {
        System.out.println("\nCodi de l'Investigador __: " + getCodi());
        System.out.println("\nEntra el nou valor codi:");
        setCodi(DADES.next());
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'Investigador __: " + getNom());
        System.out.println("\nEntra el nou valor nom:");
        setNom(DADES.nextLine());

        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador __:" + getExperiencia());
        System.out.println("\nEntra nou valor experiència:");
        setExperiencia(DADES.nextInt());

        System.out.println("\nSou de l'Investigador __: " + getSou());

    }

    @Override
    public void showUnitatDeRecerca() {
        System.out.println("\nLes dades de l'Investigador/a __ amb codi " + getCodi() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nExperiencia: " + getExperiencia());
        System.out.print("\nSou: " + getSou());

    }

}
