package flow_of_program;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapyear = (year % 4 ==0 && year % 100 !=0) || (year % 400 ==0);

        if(isLeapyear){
            System.out.println(year + " is a leapyear");
        } else {
            System.out.println(year + " not a leapyear");
        }
    }
}
