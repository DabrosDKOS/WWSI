package solid_prog2;

import java.util.Random;

/**
 *
 * @author Ewa
 */
public class Gardener extends Person{
    private static final double NICE_WEATHER_PROBABILITY = 0.75; // all the object share this constant
    private int numberOfPlantedTrees=0;
    Random randomGenerator;

    public Gardener(String name,char gender,String fatherName,String motherName, String dateOfBirth){
        super(name,gender,fatherName,motherName,dateOfBirth);
        randomGenerator = new Random(); 
        role = "Gardener";
    }
    @Override
    public String describe(){
        return super.describe()+ "Works as Gardener. Planted "+numberOfPlantedTrees+" trees"+".";
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
