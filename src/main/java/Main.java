/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author decagon
*/
public class Main {
     
public  static void main(String[] args) {
    
    //Pet pet1 = new Pet("jakii", "Dog", 100);
    //Pet pet2 = new Pet("lucy", "cat", 89);
    //Pet pet3 = new Pet("shrek", "lion", 500);
    
    //pet1.status();
    //pet2.play();
    //pet1.sleep();
    //pet3.status();
    Scanner input = new Scanner (System.in);
    System.out.println("Enter your name: ");
    String name = input.nextLine();
    Student student1 = new Student();
    int answer = student1.addtotalscore();
    System.out.println(answer);
    int average = student1.averagescore();
    System.out.println(average);
    student1.determinegrade();
    
    

    
}
    

    
}
