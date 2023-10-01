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
public class InvestigadorAuxiliar extends Investigador {

    //private final static Scanner DADES = new Scanner(System.in);
    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    public InvestigadorAuxiliar(String codi, String nom, int experiencia, double sou) {
        super(codi, nom, experiencia, sou);
    }


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
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
    
    /*public void updateInvestigadorAuxiliar() {
        System.out.println("\nCodi de l'Investigador Auxiliar: " + getCodi());
        System.out.println("\nEntra el nou valor codi:");
        setCodi(DADES.next());
        DADES.nextLine(); //Neteja buffer
       System.out.println("\nNom de l'Investigador Auxiliar: " + getNom());
        System.out.println("\nEntra el nou valor nom:");
        setNom(DADES.nextLine());
        
       DADES.nextLine(); //Neteja buffer
       System.out.println("\nExperiencia Investigador Auxiliar:" + getExperiencia());
        System.out.println("\nEntra nou valor experiència:");
        setExperiencia(DADES.nextInt());

        System.out.println("\nSou de l'Investigador Auxiliar: " + getSou());
      
        do {
            System.out.println("\nEntra nou valor sou (superior a 12000 però no més gran que 20000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 12000 || getSou() > 20000);
    }*/
    
    @Override
    public void updateUnitatDeRecerca() {
        super.updateUnitatDeRecerca();
        do {
            System.out.println("\nEntra nou valor sou (superior a 12000 però no més gran que 20000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 12000 || getSou() > 20000);
    }

    /*public void showInvestigadorAuxiliar() {
        
        System.out.println("\nLes dades de l'Investigador/a Auxiliar amb codi " + getCodi() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nExperiencia: " + getExperiencia());
        System.out.print("\nSou: " + getSou());
    }*/
}
