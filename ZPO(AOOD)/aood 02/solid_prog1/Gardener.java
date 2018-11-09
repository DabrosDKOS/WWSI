/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog1;

import java.util.Random;

/**
 *
 * @author Ewa
 */
public class Gardener {
    private String name;
    private char gender;
    private String fatherName;
    private String motherName;
    private int numberOfPlantedTrees=0;
    Random randomGenerator;
    private static final double NICE_WEATHER_PROBABILITY = 0.75; 
    
    public Gardener(String name,char gender,String fatherName,String motherName){
        this.name=name;
        this.gender=gender;
        this.fatherName=fatherName;
        this.motherName=motherName;
        randomGenerator = new Random(); 
    }
    public String describe(){
        return (name+", "+(gender=='m'?"son":"daughter")+
                    " of "+fatherName+" and "+motherName + 
                ". Works as Gardener. Planted "+numberOfPlantedTrees+" trees"+".");
    }
    public String plant(){
        if(randomGenerator.nextFloat()<NICE_WEATHER_PROBABILITY){
            numberOfPlantedTrees++;
            return "Planting a tree...";
        }
        if(numberOfPlantedTrees !=0 )
            return "Looking at the trees growing in the rain...";      
        return "Waiting...";
     }
}
