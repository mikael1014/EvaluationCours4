/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CoursJava4;

import CoursJava4.dao.GererDonnees;
import CoursJava4.enum_.Droits;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Mike
 */
public class Cours4 {

    /**
     * @param args the command line arguments
     */
    public static void afficher(ArrayList liste){
        for int u = 0 u< liste.size(); u++ ;{
            System.out.println(liste.get(u));}
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        //Utilisateur u = new Utilisateur();
        //GererDonnees<Utilisateur>;
        
        //GererDonnees<Utilisateur> gereUti        
        
        ArrayList<Utilisateur> liste = new ArrayList<Utilisateur>;
        ArrayList<Utilisateur> admins = new ArrayList<Admin>;
        ArrayList<? extends Utilisateur> tous = new ArrayList<Utilisateur>;
        
        liste.add(new Utilisateur);
        liste.add(new Admin);
        
        // liste admins
        
        Hashtable ht = new Hashtable();
        
        ht.put(1,"printemps");
        ht.put(10,"été");
        ht.put(1,"automne");
        ht.put("45",new Utilisateur());
        
        Enumeration e = ht.elements();
        
        while (e.hasMoreElements()) {
            Object nextElement = e.nextElement();
            
        }
        
        
        ArrayList liste2 = new ArrayList();
        
        //LinkedList liste = new LinkedList();
        //liste.add("Bonjour");
        //liste.add(123);
        //liste.add('C');

        //for (int i = 0; i < liste.size(); i++) {
        //      System.out.println(i + " " + liste.get(i));
        //   }
        
        
       // ListIterator li = liste.listIterator();
        //while (li.hasNext()) {
        //    System.out.println(li.previous());
        //}
        //LinkedList liste = new LinkedList();
        LinkedList listeUtilisateur = new LinkedList();
        listeUtilisateur.add(new Utilisateur("Lavie", "EstBelle"));
        listeUtilisateur.add(new Utilisateur("Mikael", "toto",Droits.ADMINISTRATEUR));
        listeUtilisateur.add( new Utilisateur("login2", "motdepass2",Droits.OPERATEURSDECOMPTE)); // cas droit inexistant
        listeUtilisateur.add(new Utilisateur());
        
        //for (int i = 0; i < liste.size(); i++) {
          //    System.out.println(i + " " + liste.get(i));
        //   }
        ListIterator li = listeUtilisateur.listIterator();
        while (li.hasNext()) {
            System.out.println(li.next());
        }
    }

}
