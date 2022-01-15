/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4.enum_;

/**
 *
 * @author Mike
 */
public enum Droits {

    CHEF("chef", "ABCDEF"),
    AGENTDESAISIE("user", "123456");
    //OPERATEURSDECOMPTE(3),    
    //OPERATEURSDESAUVEGARDE(4),    
    //UTILISATEURDUDOMAINE(5),
    //UTILISATEUR(6);

    private String login;
    private String pass;

    private Droits(String login, String pass) {

        this.login = login;
        this.pass = pass;
    }

    public String getLogin() {
        return this.login;
    }

    public String getPass() {
        return this.pass;
    }
}
