
package malacaste.it2b;

import java.util.Scanner;

public class FitnessApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Applications: ");
        int numberOfApplications = sc.nextInt();
        sc.nextLine(); 

        Application[] applications = new Application[numberOfApplications];

        for (int i = 0; i < numberOfApplications; i++) {
            System.out.println("Enter details of application " + (i + 1) + ":");
            
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            
            System.out.print("BMI: ");
            double bmi = sc.nextDouble();
            sc.nextLine(); 
            
            System.out.print("Fitness Goals: ");
            String fitnessGoals = sc.nextLine();
       
            applications[i] = new Application(id, name, age, bmi, fitnessGoals);
        }

      
        for (Application app : applications) {
            System.out.println("\n" + app);
        }

        sc.close();
    }
}
