/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid_prog2;

/**
 *
 * @author Ewa
 */
public class Person {
    protected String name;
    protected char gender;
    protected String fatherName;
    protected String motherName;
    protected String role = "";
    public Person(String name,char gender,String fatherName,String motherName){
        this.name=name;
        this.gender=gender;
        this.fatherName=fatherName;
        this.motherName=motherName;
    }
    public String describe(){
        return (name+", "+(gender=='m'?"son":"daughter")+
                    " of "+fatherName+" and "+motherName+".");
    }
    public String getRole(){
        return role;
    }
}
