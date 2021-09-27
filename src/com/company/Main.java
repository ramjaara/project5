package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int usersNumber = input.nextInt();

	    for(int i = 0;i<usersNumber;i++){
            for(int j =0;j<usersNumber;j++){
                System.out.println(j);
            }
        }
    }
}
