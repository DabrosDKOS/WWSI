/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog2;



/**
 *
 * @author Ewa Figielska
 */
public class Solid_exercise2 {

   
    
    public static void main(String[] args) {
        System.out.println("\n\nSOLID exercise 2\n");
        Master master = new Master();
        master.getInhabitants();
        System.out.println("\nList of inhabitants:\n");           
        master.show(); 
        System.out.println("\nPlaying:\n");      
        master.play();
    }
}
