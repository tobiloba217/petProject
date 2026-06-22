/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import java.util.Scanner;
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
   // Scanner input = new Scanner (System.in);
   // System.out.println("Enter your name: ");
    //String name = input.nextLine();
    //Student student1 = new Student(59, 55, 50);
    //int answer = student1.CalculateTotalscore();
    //System.out.println(answer);
    //int average = student1.calculateAverage();
    //System.out.println(average);
   // student1.determinegrade();
    BankAccount bank1 = new BankAccount(8198, "Tobi", 1000);
    int deposited = bank1.deposit(9000);
    System.out.println(deposited);
    int answer = bank1.withDraw(2000);
    System.out.println(answer);
    bank1.checkBalance();
    
    
   
    
    

    
}
    

    
}
