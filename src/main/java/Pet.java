/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author decagon
 */
public class Pet { 
        // global and local varaibles
        private String name ;
         
         private String animalType ;
         
        private int energylevel ;
        
        
        public Pet(String name, String animalType, int energylevel){
            this.name = name; 
            this.animalType = animalType;
            this.energylevel = energylevel;
        }
        
        
 public void feed(){  
     
System.out.println(this.name + " is eating a yummy bone! Yum Yum");

 }
public void play(){
    
System.out.println(name + " is chasing a ball! so fun!");
}

public void sleep(){
    System.out.println(name + "is taking a nap. zzzzz😴");
    
}
public void status(){
    System.out.println(name +", " + animalType + " " + "and " + energylevel + " level");
}
}

        



         
         
    

