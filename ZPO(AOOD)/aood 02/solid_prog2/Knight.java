package solid_prog2;

/**
 *
 * @author Ewa
 */
public class Knight extends Person {
    private String weapon;  
    private String mount;
    double strength=1.0;
    public Knight(String name,char gender,String fatherName,
                String motherName,String weapon,String mount){
        super(name,gender,fatherName,motherName);
        this.weapon=weapon;
	this.mount=mount;     
        role = "Knight";
    }
    @Override
    public String describe(){
        return super.describe()+"Works as Knight. Fights with a "+weapon+
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
