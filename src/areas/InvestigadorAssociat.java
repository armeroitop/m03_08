/*
* Classe que defineix un Investigador/a Associat d'un Departament. 
* Es defineixen pel seu codi, nom,experiència en anys i sou 
 */
package areas;

import java.util.Scanner;


/**
 *
 * @author itc
 */
public class InvestigadorAssociat extends Investigador{
    
    //private final static Scanner DADES = new Scanner(System.in);



    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe.
    
     Accions:
     - Assignar als atributs corresponents els valors passats com a paràmetres.
     */
    
    public InvestigadorAssociat(String codi, String nom, int experiencia, double sou) {
        super(codi,nom,experiencia,sou);
    }


    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    

   

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou 
       Investigador/a Associat. Les dades a demanar són les que necessita 
       el constructor.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       20000 euros però igual o inferior a 30000
     - Si tingués un sou diferent no seria Investigador Associat
     
     Retorn: Objecte Investigador/a Associat creat.
     */
    public static InvestigadorAssociat addInvestigadorAssociat() {
        String codi, nom;
        int experiencia;
        double sou;

        System.out.println("\nCodi Investigador Associat:");
        codi = DADES.next();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom Investigador Associat:");
        nom = DADES.nextLine();
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Associat:");
        experiencia = DADES.nextInt();

        do {
            System.out.println("\nQuin sou té l'Investigador Associat (superior a 20000 però no més gran que 30000)?:");
            sou = DADES.nextDouble();
        } while (sou <= 20000 || sou > 30000);

        return new InvestigadorAssociat(codi, nom, experiencia, sou);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades de l'Investigador Associat actual i
       modificar els atributs corresponents d'aquest Investigador Associat.
     - Heu de tenir en compte que el sou anual ha de ser un num positiu superior a
       20000 euros però igual o inferior a 30000
     - Si tingués un sou diferent no seria Investigador Associat
     
     Retorn: cap
     */
    /*public void updateInvestigadorAssociat() {
        
        System.out.println("\nCodi de l'Investigador Associat: " + getCodi());
        System.out.println("\nEntra el nou valor codi:");
        setCodi(DADES.next());
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nNom de l'Investigador Associat: " + getNom());
        System.out.println("\nEntra el nou valor nom:");
        setNom(DADES.nextLine());
        
        DADES.nextLine(); //Neteja buffer
        System.out.println("\nExperiencia Investigador Associat:" + getExperiencia());
        System.out.println("\nEntra nou valor experiència:");
        setExperiencia(DADES.nextInt());

        System.out.println("\nSou de l'Investigador Associat: " + getSou());
        
        super.updateUnitatDeRecerca();
        do {
            System.out.println("\nEntra nou valor sou (superior a 20000 però no més gran que 30000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 20000 || getSou() > 30000);
    }*/
    
    @Override
    public void updateUnitatDeRecerca() {
        super.updateUnitatDeRecerca(); 
        do {
            System.out.println("\nEntra nou valor sou (superior a 20000 però no més gran que 30000):");
            setSou(DADES.nextDouble());
        } while (getSou() <= 20000 || getSou() > 30000);
    }
    

    /*public void showInvestigadorAssociat() {
        
        System.out.println("\nLes dades de l'Investigador/a Associat amb codi " + getCodi() + " són:");
        System.out.println("\nNom: " + getNom());
        System.out.println("\nExperiencia: " + getExperiencia());
        System.out.print("\nSou: " + getSou());
        
        
        super.showUnitatDeRecerca();
    }*/

    
}
