/*
* Classe que defineix un Investigador/a Principal d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;

import java.util.Scanner;


/**
 *
 * @author itc
 */
public class InvestigadorPrincipal extends Investigador{
    
    //private final static Scanner DADES = new Scanner(System.in);


    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    
    public InvestigadorPrincipal(String codi, String nom, int experiencia, double sou) {
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
       Investigador/a Principal. Les dades a demanar són les que necessita 
       el constructor.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       30000 euros
     - Si tingués un sou inferior no seria Investigador Principal
     
     Retorn: Objecte Investigador/a Principal creat.
     */
    public static InvestigadorPrincipal addInvestigadorPrincipal() {
        String codi, nom;
        int experiencia;
        double sou;

        System.out.println("\nCodi Investigador Principal:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom Investigador Principal:");
        nom = DADES.nextLine();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Principal:");
        experiencia = DADES.nextInt();

        do {
            System.out.println("\nQuin sou té l'Investigador Principal (superior a 30000)?:");
            sou = DADES.nextDouble();
        } while (sou <= 30000);

        return new InvestigadorPrincipal(codi, nom, experiencia, sou);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Principal actual i
       modificar els atributs corresponents d'aquest Investigador Principal.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       30000 euros
     - Si tingués un sou inferior no seria Investigador Principal
     
     Retorn: cap
     */
   /* public void updateInvestigadorPrincipal() {
        
        System.out.println("\nCodi de l'Investigador Principal: " + getCodi());
        System.out.println("\nEntra el nou valor codi:");
        setCodi(DADES.next());
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'Investigador Principal: " + getNom());
        System.out.println("\nEntra el nou valor nom:");
        setNom(DADES.nextLine());
        
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Principal:" + getExperiencia());
        System.out.println("\nEntra nou valor experiència:");
        setExperiencia(DADES.nextInt());

        System.out.println("\nSou de l'Investigador Principal: " + getSou());
        
        super.updateUnitatDeRecerca();
        do {
            System.out.println("\nEntra nou valor sou (superior a 30000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 30000);
    }*/

    @Override
    public void updateUnitatDeRecerca() {
        super.updateUnitatDeRecerca(); 
         do {
            System.out.println("\nEntra nou valor sou (superior a 30000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 30000);
    }
    
    
    

    /*public void showInvestigadorPrincipal() {
        
        System.out.println("\nLes dades de l'Investigador/a Principal amb codi " + getCodi() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nExperiencia: " + getExperiencia());
        System.out.print("\nSou: " + getSou());        
        
        
        super.showUnitatDeRecerca();
    }*/
    
}
