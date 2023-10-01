/*
 * Classe que defineix un Departament. Un departament es defineix pel seu nom,
   el nom de l’àrea d’especialització, un array d’investigadors/es principals,
   un array d’investigadors/es associats i un array d’investigadors/es auxiliars
 */
package areas;

import java.util.Scanner;

/**
 *
 * @author itc
 */
public class Departament implements UnitatDeRecerca {

    //private final static Scanner DADES = new Scanner(System.in);
    private String nom;
    private String area;
    private String codi; 
    /*
    private InvestigadorAssociat[] investigadorsAssociats = new InvestigadorAssociat[100];
    private int pInvestigadorsAssociats = 0; //Primera posició buida de l'array d'investigadors associats
    private InvestigadorPrincipal[] investigadorsPrincipals = new InvestigadorPrincipal[100];
    private int pInvestigadorsPrincipals = 0; //Primera posició buida de l'array d'investigadors principals
    private InvestigadorAuxiliar[] investigadorsAuxiliars = new InvestigadorAuxiliar[100];
    private int pInvestigadorsAuxiliars = 0; //Primera posició buida de l'array d'investigadors auxiliars
     */
    private Investigador[] investigadors = new Investigador[300];
    private int pInvestigadors = 0;


    /*
     TODO CONSTRUCTOR
    
     Paràmetres: valors per tots els atributs de la classe, menys els arrays
    
     Accions:
     - Assignar als atributs els valors passats com a paràmetres.    
     */
    public Departament(String nom, String area) {
        this.nom = nom;
        this.area = area;
    }

    /*
     TODO Heu d'implementar tots els mètodes accessors possibles.  
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    /*public InvestigadorPrincipal[] getInvestigadorsPrincipals() {
        return investigadorsPrincipals;
    }*/

    /*public void setInvestigadorsPrincipals(InvestigadorPrincipal[] investigadorsPrincipals) {
        this.investigadorsPrincipals = investigadorsPrincipals;
    }

    public InvestigadorAssociat[] getInvestigadorsAssociats() {
        return investigadorsAssociats;
    }

    public void setInvestigadorsAssociats(InvestigadorAssociat[] investigadorsAssociats) {
        this.investigadorsAssociats = investigadorsAssociats;
    }

    public InvestigadorAuxiliar[] getInvestigadorsAuxiliars() {
        return investigadorsAuxiliars;
    }

    public void setInvestigadorsAuxiliars(InvestigadorAuxiliar[] investigadorsAuxiliars) {
        this.investigadorsAuxiliars = investigadorsAuxiliars;
    }

    public int getpInvestigadorsPrincipals() {
        return pInvestigadorsPrincipals;
    }

    public void setpInvestigadorsPrincipals(int pInvestigadorsPrincipals) {
        this.pInvestigadorsPrincipals = pInvestigadorsPrincipals;
    }

    public int getpInvestigadorsAssociats() {
        return pInvestigadorsAssociats;
    }

    public void setpInvestigadorsAssociats(int pInvestigadorsAssociats) {
        this.pInvestigadorsAssociats = pInvestigadorsAssociats;
    }

    public int getpInvestigadorsAuxiliars() {
        return pInvestigadorsAuxiliars;
    }

    public void setpInvestigadorsAuxiliars(int pInvestigadorsAuxiliars) {
        this.pInvestigadorsAuxiliars = pInvestigadorsAuxiliars;
    }*/

    public Investigador[] getInvestigadors() {
        return investigadors;
    }

    public void setInvestigadors(Investigador[] investigadors) {
        this.investigadors = investigadors;
    }

    public int getpInvestigadors() {
        return pInvestigadors;
    }

    public void setpInvestigadors(int pInvestigadors) {
        this.pInvestigadors = pInvestigadors;
    }
    
    
    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    /*
    TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari les dades per consola per crear un nou Departament. 
       Les dades a demanar són les que necessita el constructor.
     
     Retorn: El nou Departament creat.
     */
    public static Departament addDepartament() {
        String nom, area;

        System.out.println("\nNom del Departament:");
        nom = DADES.nextLine();
        System.out.println("\nArea del Departament:");
        area = DADES.nextLine();

        return new Departament(nom, area);
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Demanar a l'usuari que introdueixi les noves dades del Departament i
       modificar els atributs corresponents d'aquest Departament. Els únics
       atributs que modificarem són els que hem inicialitzat en el constructor
       amb els paràmetres passats.
     - Li heu de mostrar a l'usuari els valors dels atributs abans de modificar-los.
     
    Retorn: cap
     */
    public void updateDepartament() {
        System.out.println("\nNom del Departament: " + nom);
        System.out.println("\nEntra el nou nom:");
        nom = DADES.nextLine();
        System.out.println("\nArea del Departament : " + area);
        System.out.println("\nEntra el nou area:");
        area = DADES.nextLine();
    }

    /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Calcular la despesa total en sous del departament a partir dels sous
       dels investigadors del departament.
     
     Retorn: despesa total
     */
    public int calcularTotalDespesa() {

        int totalDespesa = 0;

        for (int i = 0; i < pInvestigadors; i++) {
            totalDespesa += investigadors[i].getSou();
        }
        return totalDespesa;

    }

    public void showDepartament() {
        System.out.println("\nLes dades del Departament " + nom + " són:");
        System.out.println("\nArea: " + area);
        System.out.println("\nDespesa Total: " + calcularTotalDespesa());
    }

    /*
     InvestigadorPrincipal
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Principal a l'array d'investigadors principals
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorPrincipal
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors principals si s'afegeix.
     - Mostra el missatge "L'Investigador/a Principal ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorPrincipal() {

        InvestigadorPrincipal nouInvestigadorPrincipal = InvestigadorPrincipal.addInvestigadorPrincipal();

        if (selectInvestigadorPrincipal(nouInvestigadorPrincipal.getCodi()) == -1) {
            investigadors[pInvestigadors] = nouInvestigadorPrincipal;
            pInvestigadors++;
        } else {
            System.out.println("\nInvestigador principal ja existeix");
        }
    }

    public int selectInvestigadorPrincipal(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Principal?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadors; i++) {
            if (investigadors[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }
    
    public int selectInvestigador(int tipusInvestigador, String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Principal?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadors; i++) {
            if (investigadors[i].getCodi().equals(codi)) {
                return i;
            }
        }
        
        //Definiu el tipusInvestigador com 1=InvestigadorPrincipal, 2=InvestigadorAssociat i 3=InvestigadorAuxiliar.
        //instanceof 

        return -1;
    }


    /*
     InvestigadorAssociat
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Associat a l'array d'investigadors associats
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorAssociat
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors associats si s'afegeix.
     - Mostra el missatge "L'Investigador/a Associat ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorAssociat() {

        InvestigadorAssociat nouInvestigadorAssociat = InvestigadorAssociat.addInvestigadorAssociat();

        if (selectInvestigadorAssociat(nouInvestigadorAssociat.getCodi()) == -1) {
            investigadors[pInvestigadors] = nouInvestigadorAssociat;
            pInvestigadors++;
        } else {
            System.out.println("\nInvestigador associat ja existeix");
        }
    }

    public int selectInvestigadorAssociat(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Associat?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadors; i++) {
            if (investigadors[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }

    /*
     InvestigadorAuxiliar
     */
 /*
     TODO
    
     Paràmetres: cap
    
     Accions:
     - Afegeix un nou Investigador/a Auxiliar a l'array d'investigadors auxiliars
       del Departament actual si aquest/a no existeix. 
       Per afegir-lo heu de fer servir el mètode de la classe InvestigadorAuxiliar
       escaient i per comprovar la seva existència el mètode d'aquesta classe
       que ens ajuda en aquesta tasca.
     - Actualitza la posició de l'array d'investigadors auxiliars si s'afegeix.
     - Mostra el missatge "L'Investigador/a Auxiliar ja existeix" si 
       no s'ha afegit.
    
     Retorn: cap
     */
    public void addInvestigadorAuxiliar() {

        InvestigadorAuxiliar nouInvestigadorAuxiliar = InvestigadorAuxiliar.addInvestigadorAuxiliar();

        if (selectInvestigadorAuxiliar(nouInvestigadorAuxiliar.getCodi()) == -1) {
            investigadors[pInvestigadors] = nouInvestigadorAuxiliar;
            pInvestigadors++;
        } else {
            System.out.println("\nInvestigador auxiliar ja existeix");
        }
    }

    public int selectInvestigadorAuxiliar(String codi) {

        if (codi == null) {
            System.out.println("\nCodi de l'Investigador/a Auxiliar?:");
            codi = DADES.next();
        }

        for (int i = 0; i < pInvestigadors; i++) {
            if (investigadors[i].getCodi().equals(codi)) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public void updateUnitatDeRecerca() {

    }

    @Override
    public void showUnitatDeRecerca() {

    }

}
