/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4;

import evaluationcours4.enum_.Profils;
import evaluationcours4.exception_.IntrusionException;

/**
 *
 * @author Mike
 */
public class Connexion {

    private Profils profil;
    private boolean connectee = false;
    public static int tentativesRatees = 0;

    Connexion() {

    }

    Connexion(String login, String passe) throws IntrusionException {
        System.out.println("tentativesRatees : " + tentativesRatees);
        if (login.equals(Profils.AGENTDESAISIE.getLogin()) && passe.equals(Profils.AGENTDESAISIE.getPass())) {
            System.out.println("\nAgent de saisie".toUpperCase());
            this.profil = Profils.AGENTDESAISIE;
            this.connectee = true;
            tentativesRatees = 0;
        } else if (login.equals(Profils.CHEF.getLogin()) && passe.equals(Profils.CHEF.getPass())) {
            System.out.println("Chef".toUpperCase());
            this.profil = Profils.CHEF;
            this.connectee = true;
            tentativesRatees = 0;
        } else {
            tentativesRatees++;
            System.out.println("\nLogin ou mot de passe incorrect\n");
        }
        if (tentativesRatees == 2) {
            throw new IntrusionException();
        }
        System.out.println("tentativesRatees here : " + tentativesRatees);
    }

    /**
     * @return the profil
     */
    public Profils getProfil() {
        return profil;
    }

    /**
     * @param profil the profil to set
     */
    public void setProfil(Profils profil) {
        this.profil = profil;
    }

    /**
     * @return the connectee
     */
    public boolean isConnectee() {
        return connectee;
    }

    /**
     * @param connectee the connectee to set
     */
    public void setConnectee(boolean connectee) {
        this.connectee = connectee;
    }

}