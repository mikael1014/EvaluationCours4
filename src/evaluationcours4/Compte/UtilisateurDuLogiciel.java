/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4.Compte;

import evaluationcours4.enum_.Droits;
import evaluationcours4.exception_.ArticleException;
import evaluationcours4.exception_.PasswordException;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class UtilisateurDuLogiciel {

    public static int nombreConnexion;
    //atribut d'inctance

    private String login;
    private String password;
    private Droits droit;

    public UtilisateurDuLogiciel() {
        this.login = "Login";
        this.password = "motdepass";
        this.droit = Droits.AGENTDESAISIE;
    }

    public UtilisateurDuLogiciel(String login, String motdepass) throws PasswordException {
        nombreConnexion++;
        if (nombreConnexion < 2) {
            throw new PasswordException();
        } else {
            this.login = login;
            this.password = motdepass;
            this.droit = Droits.AGENTDESAISIE;
        }

    }

    public UtilisateurDuLogiciel(String login, String motdepass, Droits droit) {
        this.login = login;
        this.password = motdepass;
        this.droit = droit;
    }

    public String getNomUtilisateur() {
        return this.login;
    }

    public void setNomUtilisateur(String login) {

        this.login = login;

    }

    public String getPassUtilisateur() {
        return this.password;
    }

    public void setPassUtilisateur(String pass) {

        this.password = pass;

    }

    public Droits getDroitsUtilisateur() {
        return this.droit;
    }

    public void setDroitsUtilisateur(Droits droituser) {

        this.droit = droituser;

    }

    public String toString() {
        String resultat = "login : " + login + "\n"
                + "passe : " + password + "\n"
                + "droit : " + droit + "\n";
        return resultat;
    }
}
