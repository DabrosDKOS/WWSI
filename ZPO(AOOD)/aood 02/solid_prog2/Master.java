/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ewa
 */
public class Master {
     private ArrayList<Person> listOfInhabitants;
  
     public Master(){   
        listOfInhabitants = new ArrayList();   
     }
     public void show(){
        for(Person p : listOfInhabitants){
            System.out.println(p.describe());
        }
    }
     public void play(){
        Random random = new Random();
        for(int i=1;i<50;i++){
            int inhabitantIndex=random.nextInt(listOfInhabitants.size());
            Person p =  listOfInhabitants.get(inhabitantIndex);
            System.out.println(inhabitantIndex+": "+p.describe());
            do{
                if(p.getRole().equals("Knight")){
                    System.out.println(((Knight) p).fight());
                }
                else if(p.getRole().equals("Gardener")){
                    System.out.println(((Gardener) p).plant());              
                }                    
            }while(random.nextFloat()<0.5);
        }
    }     
     public void getInhabitants(){
        listOfInhabitants.add(new Gardener("Greenleaf",'m',"Brownleaf","Goldendaisy"));
        listOfInhabitants.add(new Knight("Quickhand",'m',"Bravedeed",
                "Sunbell","bow","eagle"));
        listOfInhabitants.add(new Knight("Truefriend",'m',"Highspirit",
                "Mistymorning","sword","horse"));
        listOfInhabitants.add(new Gardener("Slenderwillow",'f',"Oldoak","Sunnydaisy"));
     }
}