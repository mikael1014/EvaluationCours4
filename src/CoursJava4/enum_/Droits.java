/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoursJava4.enum_;

/**
 *
 * @author Mike
 */
public enum Droits {
    
    ADMINDUDOMAINE(1),
    ADMINISTRATEUR(2),
    OPERATEURSDECOMPTE(3),    
    OPERATEURSDESAUVEGARDE(4),    
    UTILISATEURDUDOMAINE(5),
    UTILISATEUR(6);

    private int valeur;

    Droits(int valeur) {
        this.valeur = valeur;
    }

    public int getValeur() {
        return this.valeur;
    }

}
