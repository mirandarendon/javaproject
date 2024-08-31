import java.util.Scanner;


public class helloworld {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scnr.nextLine();

        System.out.println("Hi " + name);

scnr.close();
    }
}