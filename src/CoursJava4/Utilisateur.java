/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava4;

import CoursJava4.enum_.Droits;
import java.util.Scanner;

/**
 *
 * @author Mike
 */
public class Utilisateur {

    private String login;
    private String password;
    private Droits droit;

    public Utilisateur() {
        this.login = "Login";
        this.password = "motdepass";
        this.droit = Droits.UTILISATEUR;
    }

    public Utilisateur(String login, String motdepass) {
        this.login = login;
        this.password = motdepass;
        this.droit = Droits.UTILISATEUR;
    }

    public Utilisateur(String login, String motdepass, Droits droit) {
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
                + "droit : " + droit +"\n";
      return resultat;
    }
}
