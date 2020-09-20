package Basics.Operators;

public class Conditional {

    public static void conditional(int age, String job) {

        basicConditional(age);
        stringConditional(job);

    }

    private static void basicConditional(int age){
        if (age < 0) {
            System.out.println("Incorrect Age");
            return;
        }

        if (age < 13 && age > 0){
            System.out.println("You are a child");
        } else if (age < 18) {
            System.out.println("You are a teenager");
        } else if (age < 30) {
            System.out.println("You are a young adult");
        } else {
            System.out.println("You are Old");
        }
    }

    private static void stringConditional(String job) {
        if (job.equals("developer")){
            System.out.println("Great Job Choice!");
        }

    }
}
