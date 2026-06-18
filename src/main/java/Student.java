/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author decagon
 */
public class Student {
    public String name;
    public int EnglishScore = 987;
    public int PhysicsScore = 58;
    public int ChemistryScore = 40;
    
    


public int addtotalscore(){
    return EnglishScore + PhysicsScore + ChemistryScore;
}
public int averagescore(){ 
    
   return  addtotalscore() / 3;
}
public void determinegrade(){
   
    if(EnglishScore <= averagescore()){
        
        System.out.println('A');
        
    }else if (PhysicsScore <= averagescore()){
        
        System.out.println('B');
    }else if (ChemistryScore < averagescore()){
        
        System.out.println('C');
    }else{
        
        System.out.println('D');
    }
        
    
}

}
    
    


            
    
