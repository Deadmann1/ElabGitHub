/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elabgithub;

import java.util.Vector;

/**
 *
 * @author schueler
 */
public class MainAppl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Person> vecPersons = new Vector<Person>();
        Vector<Viech> vecViecher = new Vector<Viech>();
        
        vecPersons.add(new Person("Sammer", "Seas"));
        vecPersons.add(new Person("Lackna", "Öhsers"));
        vecViecher.add(new Viech("Donkey", "IahIah"));
        vecViecher.add(new Viech("Schaf", "Bäähh"));
        
        for(Person p : vecPersons)
        {
            System.out.println(p.toString());         
        }
        
        for(Viech v : vecViecher)
        {
            System.out.println(v.toString());         
        }
    }
    
}
