package sef.module3.sample;

public class WhileLoopSample {

    public static void main(String[] args) {

        System.out.println("While Loop");
        int counter = 60;
        while (counter < 50) {
            System.out.println("The value of counter is : " + counter);
            counter++;
        }

        System.out.println("\n\nDo-While Loop");
        counter = 60;
        do {
            System.out.println("The value of counter is : " + counter);
            counter++;
        } while (counter < 10);
    }
}
