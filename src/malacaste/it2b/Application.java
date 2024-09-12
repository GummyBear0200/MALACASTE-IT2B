package malacaste.it2b;

import java.util.Scanner;

class Application {
    int id;
    String name;
    int age;
    double bmi;
    String fitnessGoals;

    public Application(int id, String name, int age, double bmi, String fitnessGoals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fitnessGoals = fitnessGoals;
    }

    public boolean isEligible() {
        return age < 65; 
    }

    @Override
    public String toString() {
        String eligibilityStatus = isEligible() ? "Eligible" : "Not Eligible (Age too high)";
        return String.format("ID: %d\nName: %s\nAge: %d\nBMI: %.1f\nFitness Goals: %s\nEligibility Status: %s",
                id, name, age, bmi, fitnessGoals, eligibilityStatus);
    }
}


