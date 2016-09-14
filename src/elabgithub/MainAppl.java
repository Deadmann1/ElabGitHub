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
        
        vecPersons.add(new Person("Sammer", "Seas"));
        vecPersons.add(new Person("Lackna", "Öhsers"));
        
        for(Person p : vecPersons)
        {
            System.out.println(p.toString());         
        }
    }
    
}
