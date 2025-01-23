import java.util.*;
/*
Dominic shriver
Java 2805
D2 assignment
23 Jan 2025
-main calss for the Scanner example code
I DID NOT USE AI TO MAKE THIS PROGRAM
*/
public class Main {
  
  public static void main(String[] args) {

    Scanner name = new Scanner(System.in);//creates the specific scanner for getting a name input
    System.out.println("What is your name?");
    String nameIn = name.nextLine();//retrives the name from the user 
    System.out.println(nameIn);//prints the name retrived from user
    
  }

}