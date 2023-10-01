/*
* Classe que defineix un Investigador/a Auxiliar d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;

import java.util.Scanner;


/**
 *
 * @author itc
 */
public class InvestigadorAuxiliar {
    
    private final static Scanner DADES = new Scanner(System.in);

    private String codi;
    private String nom;
    private int experiencia;
    private double sou;

    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    
    public InvestigadorAuxiliar(String codi, String nom, int experiencia, double sou) {
        this.codi = codi;
        this.nom = nom;
        this.experiencia = experiencia;
        this.sou = sou;
    }


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    
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
   

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou 
       Investigador/a Auxiliar. Les dades a demanar són les que necessita 
       el constructor.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       12000 euros però igual o inferior a 20000
     - Si tingués un sou diferent no seria Investigador Auxiliar
     
     Retorn: Objecte Investigador/a Auxiliar creat.
     */
    public static InvestigadorAuxiliar addInvestigadorAuxiliar() {
        String codi, nom;
        int experiencia;
        double sou;

        System.out.println("\nCodi Investigador Auxiliar:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom Investigador Auxiliar:");
        nom = DADES.nextLine();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Auxiliar:");
        experiencia = DADES.nextInt();

        do {
            System.out.println("\nQuin sou té l'Investigador Auxiliar (superior a 12000 però no més gran que 20000)?:");
            sou = DADES.nextDouble();
        } while (sou <= 12000 || sou > 20000);

        return new InvestigadorAuxiliar(codi, nom, experiencia, sou);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Auxiliar actual i
       modificar els atributs corresponents d'aquest Investigador Auxiliar.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       12000 euros però igual o inferior a 20000
     - Si tingués un sou diferent no seria Investigador Auxiliar
     
     Retorn: cap
     */
    public void updateInvestigadorAuxiliar() {
        System.out.println("\nCodi de l'Investigador Auxiliar: " + codi);
        System.out.println("\nEntra el nou valor codi:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'Investigador Auxiliar: " + nom);
        System.out.println("\nEntra el nou valor nom:");
        nom = DADES.nextLine();
        
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Auxiliar:" + experiencia);
        System.out.println("\nEntra nou valor experiència:");
        experiencia = DADES.nextInt();

        System.out.println("\nSou de l'Investigador Auxiliar: " + sou);
        do {
            System.out.println("\nEntra nou valor sou (superior a 12000 però no més gran que 20000):");
            sou = DADES.nextDouble();
        } while (sou <= 12000 || sou > 20000);
    }
    

    public void showInvestigadorAuxiliar() {
        System.out.println("\nLes dades de l'Investigador/a Auxiliar amb codi " + codi + " són:");
        System.out.println("\nNom: " + nom);
        System.out.println("\nExperiencia: " + experiencia);
        System.out.print("\nSou: " + sou);
    }
}
