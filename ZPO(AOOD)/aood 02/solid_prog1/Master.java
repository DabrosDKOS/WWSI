/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Ewa
 */
public class Master {
         private ArrayList<Knight> listOfKnights;
         private ArrayList<Gardener> listOfGardeners;
  
     public Master(){   
        listOfKnights = new ArrayList();   
        listOfGardeners = new ArrayList();  
     }
     public void show(){
        for(Knight k : listOfKnights){
            System.out.println(k.describe());
        }
        for(Gardener g : listOfGardeners){
            System.out.println(g.describe());
        }
    }
     public void play(){
        Random random = new Random();
        for(int i=1;i<50;i++){
            int inhabitantIndex=random.nextInt(listOfKnights.size()+listOfGardeners.size());
            if(inhabitantIndex<listOfKnights.size()){ //the inhabitant is a Knight
                Knight k =  listOfKnights.get(inhabitantIndex);
                System.out.println(inhabitantIndex+": "+k.describe());
                do{
                    System.out.println(k.fight());
                }while(random.nextFloat()<0.5);
            }
            else{ //the inhabitant is a Gardener
                Gardener g =  listOfGardeners.get(inhabitantIndex-listOfKnights.size());
                System.out.println(inhabitantIndex+": "+g.describe());
                do{
                    System.out.println(g.plant());

                }while(random.nextFloat()<0.5);
            }
        }
     }
     public void getInhabitants(){
        listOfGardeners.add(new Gardener("Greenleaf",'m',"Brownleaf","Goldendaisy"));
        listOfGardeners.add(new Gardener("Slenderwillow",'f',"Oldoak","Sunnydaisy"));
        listOfKnights.add(new Knight("Quickhand",'m',"Bravedeed",
                "Sunbell","sword","horse"));
        listOfKnights.add(new Knight("Truefriend",'m',"Highspirit",
                "Mistymorning","spear","dragon"));
     }
}
