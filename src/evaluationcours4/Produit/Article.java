/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4.Produit;

import evaluationcours4.enum_.*;
import evaluationcours4.exception_.ArticleException;
/**
 *
 * @author Mike
 */
public class Article {
    private static int nbArticlesCrees = 0;
    private int id;
    private String nom;
    private boolean validee;
    
    
    public Article(String nom) {
        nbArticlesCrees++;
        this.id = nbArticlesCrees;
        this.nom = nom;
    }


    public static int getNbArticlesCrees() {
        return nbArticlesCrees;
    }

    public static void setNbArticlesCrees(int aNbArticlesCrees) {
        nbArticlesCrees = aNbArticlesCrees;
    }

    public boolean isValidee() {
        return validee;
    }

    public void setValidee(boolean validee) {
        this.validee = validee;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
       return this.id + " " + this.nom + (this.validee ? " validee": "");
    }
    
    
}
