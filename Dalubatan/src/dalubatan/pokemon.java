/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antiola;

import java.io.Serializable;

/**
 *
 * @author Zaira
 */
public class pokemon implements Serializable{
    String id;
    String name;
    String level;
    String weight;
    String type;
    String ability;
    
    pokemon(String id, String name, String level, String weight, String type, String ability){
        this.id = id;
        this.name = name;
        this.level= level;
        this.weight = weight;
        this.type = type;
        this.ability = ability;
    }
    
    public String getid(){return id;}
    public String getname(){return name;}
    public String getlevel(){return level;}
    public String getweight(){return weight;}
    public String gettype(){return type;}
    public String getability(){return ability;}   
}
