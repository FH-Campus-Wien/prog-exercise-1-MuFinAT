package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here

        char lit1 = 'Z';
        int lit2 = 0xface;
        int lit3 = 012; //octal literal
        long lit4 = 80L;
        float lit5 = 44e-1f, lit6 = 5.5f;
        double lit7 = 8.88e1;
        double lit8 = 99.9;
        int sum = (((int) lit1) + lit2 + lit3 + ((int) lit4) + ((int) lit5) + ((int) lit6) + ((int) lit7) + ((int) lit8));//double and other need int before the chosen names
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int numberone = scanner.nextInt();
        int numbertwo = scanner.nextInt();
        System.out.println(numberone+numbertwo);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        x = x ^ y ^ (y = x);
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else if (n1 == n2) {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();
        if (0 > revenue || revenue >= 100000)
        {
            System.out.println("Invalid Revenue");
        } else if (0 <= revenue && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (20000 <= revenue && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (50000 <= revenue && revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (80000 <= revenue && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int comissionclass = scanner.nextInt();
        switch (comissionclass)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
                break;
        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if ((year % 4 != 0) || (year %100 == 0 && year %400 != 0))
        {
            System.out.println("Not a Leapyear");
        }
        else
        {
            System.out.println("Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        while(number != 0)
        {
            System.out.print(number % 10);
            number = number / 10;  //also possible ""number/= 10"
        }
        System.out.println("");
    }

// did this with the help of this forum post https://www.java-forum.org/thema/zahl-umdrehen.168457/ I DIDN´T take any code from it!
    //on they forum they used loops and so on which were not asked for in Task 10

    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}