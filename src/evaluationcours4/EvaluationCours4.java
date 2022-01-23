/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluationcours4;

import evaluationcours4.Produit.Article;
import evaluationcours4.enum_.Profils;
import evaluationcours4.exception_.IntrusionException;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class EvaluationCours4 {

    public static GererDonnees<Article> gererArticle = new GererDonnees<Article>();

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

    public static Article saisirArticle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nom de l'article : ");
        String nom = sc.nextLine();
        Article article = new Article(nom);
        return article;
    }
//    public static boolean logger(Scanner sc) {
//        System.out.println("\nVeuillez entrer vos identifiant ");
//        String reponse = sc.nextLine();
//        return (getNom(sc).equals(Profils.AGENTDESAISIE.getLogin())
//                && getPass(sc).equals(Profils.AGENTDESAISIE.getPass()))
//                || (getNom(sc).equals(Profils.CHEF.getLogin())
//                && getPass(sc).equals(Profils.CHEF.getPass()));
//    }

    private static void connecter() throws IntrusionException {
        Connexion connexion = new Connexion();

        while (!connexion.isConnectee()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez vous connecter");
            System.out.print("Login : ");
            String login = sc.nextLine();
            System.out.print("Passe : ");
            String passe = sc.nextLine();
            connexion = new Connexion(login, passe);
        }

        if (connexion.getProfil().equals(Profils.AGENTDESAISIE)) {
            char reponse = 'O';
            do {
                Article article = saisirArticle();

                gererArticle.ajouter(article);

                System.out.println(article);

                // System.out.println(gererArticle);
                Scanner sc = new Scanner(System.in);
                System.out.print("Voulez vous continuer : ");

                String saisie = sc.nextLine();
                reponse = saisie.toUpperCase().charAt(0);
            } while (reponse == 'O');
        }

        if (connexion.getProfil().equals(Profils.CHEF)) {
            int reponse = -1;
            do {
                System.out.println(gererArticle);
                Scanner sc = new Scanner(System.in);
                System.out.print("id de l'article à valider : ");
                reponse = sc.nextInt();
                sc.nextLine();
                if (reponse != -1) {
                    gererArticle.get(reponse - 1).setValidee(true);
                }
            } while (reponse != -1);

        }
    }

    public static void afficher(String[] groupe2) {
        for (String nom : groupe2) {
            System.out.print(nom + ", ");
        }
        System.out.println("");
    }

    public static void lancementAplication() throws IntrusionException {
        while (true) {
            System.out.println("");
            connecter();
        }
    }
//        boolean continuer = true;
//        //String[] groupechef = new String[0];
//        //String[] groupeuser = new String[0];
//        Scanner sc = new Scanner(System.in);
//        String nom = getNom(sc);
//        String pass = getPass(sc);
//
//        if (nom.equals(Profils.AGENTDESAISIE.getLogin())
//                & pass.equals(Profils.AGENTDESAISIE.getPass())) {
//            System.out.print("bienvenue user : ");
//        } else if (nom.equals(Profils.CHEF.getLogin())
//                & pass.equals(Profils.CHEF.getPass())) {
//            System.out.print("bienvenue chef : ");
//        } else {
//            System.out.print("PasswordException");
//
//        }
//
//        do {
//
//            //char premierLettre = nom.toUpperCase().charAt(0);
//            //Droits droituser =  Droits.sc.getValeur();
//            switch (nom) {
//                case "chef":
//                    //groupechef = ajouter(groupechef, nom);
//
//                    break;
//                default:
//                    //groupeuser = ajouter(groupeuser, nom);
//                    continuer = continuer(sc);
//                    System.out.println(" ");
//                    //Article article = new Article();
//                    //Article article2 = new Article("Smartphone", 5);
//                    //ArticleLuxe article3 = new ArticleLuxe();
//                    //ArticleLuxe article4 = new ArticleLuxe("Télévision","TV");
//                    String[] groupe1 = new String[0];
//                    for (int i = 0; i < nombreObjetCrée; i++) {
//
//                        String[] groupeintermediaire1 = new String[groupe1.length + 1];
//                        groupeintermediaire1[i] = groupe1[i];
//                        System.out.println("Entrez nom de l'article");
//                        String nomarticle = sc.nextLine();
//                        Article article = new Article(nomarticle);
//                        article.setID(i);
//                        //Article article5 = new Article("Smartphone", 5,-10); //tp erreur
//                        //Article article6 = new Article("S", 5,10); //tp erreur
//                        System.out.println("L'ID et nom de l'article est :");
//                        System.out.println(article.getID() + " : " + article.getNom());
//                        //System.out.println(article.getID() + " : " + article.getNom());
//
//                        System.out.println("L'ID et nom de l'article est :");
//                        //System.out.println(article2.code + " : " + article2.nom);
//                        //System.out.println(article2.getID() + " : " + article2.getNom());
//                    }
//            }
//
//        } while (continuer);

    //System.out.print("Groupe chef : ");
    //afficher(groupechef);
    //System.out.print("Groupe user : ");
    //afficher(groupeuser);
    //}
    public static void main(String[] args) throws IntrusionException {

        lancementAplication();

    }

}
