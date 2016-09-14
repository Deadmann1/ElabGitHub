/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elabgithub;

/**
 *
 * @author schueler
 */
public class Person {
    private String name;
    private String greetMsg;

    public Person(String name, String greetMsg) {
        this.name = name;
        this.greetMsg = greetMsg;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", greetMsg=" + greetMsg + '}';
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreetMsg() {
        return greetMsg;
    }

    public void setGreetMsg(String greetMsg) {
        this.greetMsg = greetMsg;
    }
    
    
}
