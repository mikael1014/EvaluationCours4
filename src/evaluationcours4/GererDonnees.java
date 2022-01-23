/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluationcours4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mike
 */
public class GererDonnees <T> {
    
    private List<T> liste = new ArrayList<T>();
    
    public void ajouter(T objet) {
        liste.add(objet);
    }
    
    public void remplacer(int i, T objet) {
        liste.set(i, objet);
    }
    
    public List<T> getAll() {
        return liste;
    }
    
    public T get(int id) {
        return liste.get(id);
    }

    @Override
    public String toString() {
        String chaine = "";
        for (T objet: liste) {
            chaine = chaine + objet.toString() + "\n";
        }
        return chaine;
    }
    
    
    
}