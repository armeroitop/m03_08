package principal;

import areas.CentreRecerca;
import areas.Departament;
import areas.Investigador;
import java.util.Scanner;

/**
 *
 * @author itc
 */
public class Application {

    private final static Scanner DADES = new Scanner(System.in);

    private static CentreRecerca[] centresRecerca = new CentreRecerca[10];
    private static int pCentresRecerca = 0; //Primera posició buida del vector centresRecerca
    private static CentreRecerca centreRecercaActual = null;

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcio = 0;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Gestió Centres Recerca");
            System.out.println("\n2. Gestió Departaments");
            System.out.println("\n3. Gestió Investigadors/es Principals");
            System.out.println("\n4. Gestió Investigadors/es Associats");
            System.out.println("\n5. Gestió Investigadors/es Auxiliars");
            opcio = DADES.nextInt();

            switch (opcio) {
                case 0:
                    break;
                case 1:
                    menuCentresRecerca();
                    break;
                case 2:
                    if (centreRecercaActual != null) {
                        menuDepartaments();
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 3:
                    if (centreRecercaActual != null) {
                        menuInvestigadors(Investigador.INVESTIGADOR_PRINCIPAL);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 4:
                    if (centreRecercaActual != null) {
                        menuInvestigadors(Investigador.INVESTIGADOR_ASSOCIAT);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                case 5:
                    if (centreRecercaActual != null) {
                        menuInvestigadors(Investigador.INVESTIGADOR_AUXILIAR);
                    } else {
                        System.out.println("\nPrimer s'ha de seleccionar el Centre Recerca al menú Gestió Centres Recerca");
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    public static void menuCentresRecerca() {
        int opcio;

        do {
            int indexSel;
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Seleccionar");
            System.out.println("\n3. Modificar");
            System.out.println("\n4. Llista Centres Recerca");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    CentreRecerca nouCentreRecerca = CentreRecerca.addCentreRecerca();

                    indexSel = selectCentreRecerca(nouCentreRecerca);

                    if (indexSel == -1) {
                        centresRecerca[pCentresRecerca] = nouCentreRecerca;
                        pCentresRecerca++;
                    } else {
                        System.out.println("\nEl Centre Recerca ja existeix");
                    }

                    break;
                case 2:
                    indexSel = selectCentreRecerca(null);
                    if (indexSel >= 0) {
                        centreRecercaActual = centresRecerca[indexSel];
                    } else {
                        System.out.println("\nNo existeix aquest Centre Recerca");
                    }
                    break;
                case 3:
                    indexSel = selectCentreRecerca(null);
                    if (indexSel >= 0) {
                        centresRecerca[indexSel].updateCentreRecerca();
                    } else {
                        System.out.println("\nNo existeix aquest Centre Recerca");
                    }
                    break;
                case 4:
                    for (int i = 0; i < pCentresRecerca; i++) {
                        centresRecerca[i].showCentreRecerca();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuDepartaments amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un Departament del Centre Recerca actual. Penseu que CentreRecerca sap crear Departaments        
     Opció 2. Modificar -->    Permet modificar un Departament del Centre Recerca actual.
     (per comprovar l'existència del Departament tenim un mètode en la classe CentreRecerca que ens ajuda)
     Opció 3. Llista Departaments --> Imprimeix les dades dels Departaments del Centre Recerca actual
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge
     "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuDepartaments() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistat Departaments");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    centreRecercaActual.addDepartament();
                    break;
                case 2:
                    int indexSel = centreRecercaActual.selectDepartament(null);
                    if (indexSel >= 0) {
                        centreRecercaActual.getDepartaments()[indexSel].updateDepartament();
                    } else {
                        System.out.println("\nNo existeix aquest Departament");
                    }
                    break;
                case 3:
                    for (int i = 0; i < centreRecercaActual.getpDepartaments(); i++) {
                        centreRecercaActual.getDepartaments()[i].showDepartament();
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }


    /*
     TODO Heu de desenvolupar el menuInvestigadors amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a  del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a  a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a  del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es  d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a  que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors  --> Imprimeix les dades de tots/es Investigadors/es  del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
    public static void menuInvestigadors(int tipusInvestigador) {
        int opcio;
        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistat Investigadors");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    switch (tipusInvestigador) {
                        case Investigador.INVESTIGADOR_PRINCIPAL:
                            centreRecercaActual.addInvestigadorPrincipalDepartament();
                            break;
                        case Investigador.INVESTIGADOR_AUXILIAR:
                            centreRecercaActual.addInvestigadorAuxiliarDepartament();
                            break;
                        case Investigador.INVESTIGADOR_ASSOCIAT:
                            centreRecercaActual.addInvestigadorAssociatDepartament();
                            break;
                        default:
                            break;
                    }
                    break;

                case 2:
                    switch (tipusInvestigador) {
                        case Investigador.INVESTIGADOR_PRINCIPAL:
                            centreRecercaActual.updateInvestigadorPrincipalDepartament();
                            break;
                        case Investigador.INVESTIGADOR_AUXILIAR:
                            centreRecercaActual.updateInvestigadorAuxiliarDepartament();
                            break;
                        case Investigador.INVESTIGADOR_ASSOCIAT:
                            centreRecercaActual.updateInvestigadorAssociatDepartament();
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    for (int i = 0; i < centreRecercaActual.getpDepartaments(); i++) {

                        for (int j = 0; j < centreRecercaActual.getDepartaments()[i].getpInvestigadors(); j++) {

                            centreRecercaActual.getDepartaments()[i].getInvestigadors()[j].showUnitatDeRecerca();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }

    /*
     TODO Heu de desenvolupar el menuInvestigadorsPrincipals amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Principal del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Principal a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Principal del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Principals d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Principal que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Principals --> Imprimeix les dades de tots/es Investigadors/es Principals del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
 /*public static void menuInvestigadorsPrincipals() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistat Investigadors Principals");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    centreRecercaActual.addInvestigadorPrincipalDepartament();
                    break;
                case 2:
                    centreRecercaActual.updateInvestigadorPrincipalDepartament();
                    break;
                case 3:
                    for (int i = 0; i < centreRecercaActual.getpDepartaments(); i++) {

                        for (int j = 0; j < centreRecercaActual.getDepartaments()[i].getpInvestigadorsPrincipals(); j++) {

                            centreRecercaActual.getDepartaments()[i].getInvestigadorsPrincipals()[j].showUnitatDeRecerca();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }*/

 /*
     TODO Heu de desenvolupar el menuInvestigadorsAssociats amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Associat del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Associat a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Associat del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Associats d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Associat que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Associats --> Imprimeix les dades de tots/es Investigadors/es Associats del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
 /* public static void menuInvestigadorsAssociats() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistat Investigadors Associats");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    centreRecercaActual.addInvestigadorAssociatDepartament();
                    break;
                case 2:
                    centreRecercaActual.updateInvestigadorAssociatDepartament();
                    break;
                case 3:
                    for (int i = 0; i < centreRecercaActual.getpDepartaments(); i++) {

                        for (int j = 0; j < centreRecercaActual.getDepartaments()[i].getpInvestigadorsAssociats(); j++) {

                            centreRecercaActual.getDepartaments()[i].getInvestigadorsAssociats()[j].showUnitatDeRecerca();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }*/

 /*
     TODO Heu de desenvolupar el menuInvestigadorsAuxiliars amb les opcions que podeu veure.
     Nota: penseu que quan arribem aquí, l'atribut centreRecercaActual no és null
       
     Opció 0. Sortir -->       Surt del menú i retorna al menú principal
     Opció 1. Alta -->         Crea un/a Investigador/a Auxiliar del Centre Recerca actual afegint-lo/a a un Departament. 
                               Penseu que CentreRecerca sap afegir un/a Investigador/a Auxiliar a un Departament seleccionat.       
     Opció 2. Modificar -->    Permet modificar un/a Investigador/a Auxiliar del Centre Recerca actual. Penseu que tots/es els/les 
                               Investigadors/es Auxiliars d'un Centre Recerca pertanyen a un departament d'aquest Centre Recerca i que 
                               CentreRecerca sap modificar un/a Investigador/a Auxiliar que pertany a un dels seus Departaments.
     Opció 3. Llista Investigadors Auxiliars --> Imprimeix les dades de tots/es Investigadors/es Auxiliars del Centre Recerca actual.
        
     A més, heu de fer una estructura iterativa per tornar a mostrar el menú sempre que no es premi l'opció 0 de sortida
     
     Recomanacions:
     - estructura de control switch-case per bifurcar les opcions
     - si no s'ha introduït cap opció de les de la llista, s'ha de mostrar el missatge "S'ha de seleccionar una opció correcta del menú."
     - definiu una variable opcio de tipus enter
     */
 /* 
    public static void menuInvestigadorsAuxiliars() {
        int opcio;

        do {
            System.out.println("\nSelecciona una opció");
            System.out.println("\n0. Sortir");
            System.out.println("\n1. Alta");
            System.out.println("\n2. Modificar");
            System.out.println("\n3. Llistat Investigadors Auxiliars");
            opcio = DADES.nextInt();
            switch (opcio) {
                case 0:
                    break;
                case 1:
                    centreRecercaActual.addInvestigadorAuxiliarDepartament();
                    break;
                case 2:
                    centreRecercaActual.updateInvestigadorAuxiliarDepartament();
                    break;
                case 3:
                    for (int i = 0; i < centreRecercaActual.getpDepartaments(); i++) {

                        for (int j = 0; j < centreRecercaActual.getDepartaments()[i].getpInvestigadorsAuxiliars(); j++) {

                            centreRecercaActual.getDepartaments()[i].getInvestigadorsAuxiliars()[j].showUnitatDeRecerca();

                        }
                    }
                    break;
                default:
                    System.out.println("\nS'ha de seleccionar una opció correcta del menú.");
                    break;
            }
        } while (opcio != 0);
    }
     */
    
    public static Integer selectCentreRecerca(CentreRecerca centreRecerca) {

        String nom;

        if (centreRecerca == null) {
            System.out.println("\nNom del Centre Recerca?:");
            DADES.nextLine(); //Neteja buffer
            nom = DADES.nextLine();
        } else {

            nom = centreRecerca.getNom();
        }

        for (int i = 0; i < pCentresRecerca; i++) {
            if (centresRecerca[i].getNom().equals(nom)) {
                return i;
            }
        }

        return -1;
    }
}
