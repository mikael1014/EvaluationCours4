/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4.exception_;

/**
 *
 * @author Mike
 */
public class IntrusionException extends Exception {
    
    //public PasswordException(Double prix){
    //    System.out.println("Le prix est negatif");
    //}
    public IntrusionException(){
        //System.out.println("Veuillez rentrer un bon Nom d' Utilisateur/ Mot de passe ");
        System.out.println("Tentative d'intrusion");
    }
}