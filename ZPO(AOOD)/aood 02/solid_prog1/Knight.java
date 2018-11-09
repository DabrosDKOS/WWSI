/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog1;

/**
 *
 * @author Ewa
 */
public class Knight {
    private String name;
    private char gender;
    private String fatherName;
    private String motherName;
    private String weapon;  
    private String mount;
    double strength=1.0;
    public Knight(String name,char gender,String fatherName,String motherName,
            String weapon, String mount){
        this.name=name;
        this.gender=gender;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.weapon=weapon;
	this.mount=mount;     
        this.weapon=weapon;
    }       
    public String describe(){
        return name+", "+(gender=='m'?"son":"daughter")+
                    " of "+fatherName+" and "+motherName+
                ". Works as Knight. Fights with a "+weapon+
                ", rides on a "+mount+". "+(strength>0?"Can fight":"Needs a rest")+".";
        }
    public String fight(){
        if(strength<=0){
            strength=1.0;
            return "Resting...";
        }
        strength-=0.25;
        return "Figting...";
    }
}
