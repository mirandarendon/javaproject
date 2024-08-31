import java.util.Scanner;


public class helloworld {
    
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scnr.nextLine();

        System.out.println("How old are you?");
        int age = scnr.nextInt();

        System.out.println("Hi " + name + " you are " + age + " years old.");


scnr.close();
    }
}