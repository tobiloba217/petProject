/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author decagon
 */
public class Student {
    private String name;
    private int englishScore;
    private int physicsScore;
    private int chemistryScore;
    private int averageScore;
    private int totalScore;
    
    public Student(int englishScore, int physicsScore, int chemistryScore){
        this.englishScore = englishScore;
        this. physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

        
    
    


public int CalculateTotalscore(){
    totalScore = englishScore + physicsScore + chemistryScore;
    return totalScore;
}


public int calculateAverage(){ 
    averageScore = totalScore /3;
   return averageScore;
}
public void determinegrade(){
    
    if(averageScore >= 70){
        System.out.println('A');
    }

    else if (69 >= averageScore && averageScore >= 60 ){
        System.out.println('B');
    }      
    else if (59 >= averageScore  && averageScore >= 50){
        System.out.println('C');
    }
    else if(49 >= averageScore  && averageScore >= 40){
        System.out.println('D');
    }
     else if(39>= averageScore  && averageScore >= 30){
        System.out.println('E');
    }else{
          System.out.println('F');
     }
        
    
}

}
    
    


            
    
