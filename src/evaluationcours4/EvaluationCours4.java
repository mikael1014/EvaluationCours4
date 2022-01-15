/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluationcours4;

import evaluationcours4.Produit.Article;
import static evaluationcours4.Produit.Article.nombreObjetCrée;
import evaluationcours4.enum_.Droits;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class EvaluationCours4 {

    public static String getNom(Scanner sc) {
        System.out.println("");

        System.out.println("Votre nom utilisateur : ");
        return sc.nextLine();

    }

    public static String getPass(Scanner sc) {
        System.out.println("");

        System.out.println("Votre mot de passe : ");
        return sc.nextLine();
    }

    public static void lancementAplication() {

        boolean continuer = true;
        //String[] groupechef = new String[0];
        //String[] groupeuser = new String[0];
        Scanner sc = new Scanner(System.in);
        String nom = getNom(sc);
        String pass = getPass(sc);

        if (nom.equals(Droits.AGENTDESAISIE.getLogin())
                & pass.equals(Droits.AGENTDESAISIE.getPass())) {
            System.out.print("bienvenue user : ");
        } else if (nom.equals(Droits.CHEF.getLogin())
                & pass.equals(Droits.CHEF.getPass())) {
            System.out.print("bienvenue chef : ");
        } else {
            System.out.print("PasswordException");

        }

        do {

            //char premierLettre = nom.toUpperCase().charAt(0);
            //Droits droituser =  Droits.sc.getValeur();
            switch (nom) {
                case "chef":
                    //groupechef = ajouter(groupechef, nom);

                    break;
                default:
                    //groupeuser = ajouter(groupeuser, nom);
                    continuer = continuer(sc);
                    System.out.println(" ");
                    //Article article = new Article();
                    //Article article2 = new Article("Smartphone", 5);
                    //ArticleLuxe article3 = new ArticleLuxe();
                    //ArticleLuxe article4 = new ArticleLuxe("Télévision","TV");
                    for (int i = 0; i < nombreObjetCrée; i++) {
                        groupeintermediaire1[i] = groupe1[i];
                    
                    String nomarticle = sc.nextLine();
                    Article article = new Article(nomarticle);
                    article.setID(i);}
                    //Article article5 = new Article("Smartphone", 5,-10); //tp erreur
                    //Article article6 = new Article("S", 5,10); //tp erreur
                    System.out.println("L'ID et nom de l'article est :");
                    System.out.println(article.code + " : " + article.nom);
                    System.out.println(article.getID() + " : " + article.getNom());

                    System.out.println("L'ID et nom de l'article est :");
                //System.out.println(article2.code + " : " + article2.nom);
                //System.out.println(article2.getID() + " : " + article2.getNom());
            }

        } while (continuer);

        //System.out.print("Groupe chef : ");
        //afficher(groupechef);
        //System.out.print("Groupe user : ");
        //afficher(groupeuser);
    }

    public static String[] ajouter(String[] groupe1, String nom) {
        String[] groupeintermediaire1 = new String[groupe1.length + 1];
        if (0 < groupe1.length) {
            for (int index1 = 0; index1 < groupe1.length; index1++) {
                groupeintermediaire1[index1] = groupe1[index1];
            }
        }
        groupeintermediaire1[groupeintermediaire1.length - 1] = nom;
        return groupeintermediaire1;
    }

    public static boolean continuer(Scanner sc) {
        System.out.println("\nSouhaitez-vous entrer un autre article ?\nO: oui \nN: non ");
        String reponse = sc.nextLine();
        return reponse.toUpperCase().charAt(0) == 'O';
    }

    public static boolean logger(Scanner sc) {
        System.out.println("\nVeuillez entrer vos identifiant ");
        String reponse = sc.nextLine();
        return (getNom(sc).equals(Droits.AGENTDESAISIE.getLogin())
                & getPass(sc).equals(Droits.AGENTDESAISIE.getPass()))
                || (getNom(sc).equals(Droits.CHEF.getLogin())
                & getPass(sc).equals(Droits.CHEF.getPass()));
    }

    public static void afficher(String[] groupe2) {
        for (String nom : groupe2) {
            System.out.print(nom + ", ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        while (true) {
            lancementAplication();
            System.out.println("Nombre d'article ajouté");
        }
    }

}
