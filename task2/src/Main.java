import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the amount of people in the room.");
        int inroom = sc.nextInt();
        if (inroom <= 100) {
            System.out.println("Thank you, there is " + inroom + ", person in the room!");
            System.out.println("Please input amount of people which are still in the queue!");
            int inqueue = sc.nextInt();
            System.out.println("Thank you, there is " + inqueue + ", person still in the queue!");
            int space = 100-inroom;
            int nogoin = inqueue-space;
            if (inqueue>=space) {
                System.out.println("Thank you, " + space + ", person can go in!" + nogoin + "person is still waiting!");
            }
            else if (inqueue<space) {
                System.out.println("Thank you, all person in the queue can go in!");
            }

        }

        else {
            System.out.println("Sorry, rented room can house only 100 people!");
        }
    }
}

// very polite bot
