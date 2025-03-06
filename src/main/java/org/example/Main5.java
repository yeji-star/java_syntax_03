package org.example;

//구구단

import java.util.Scanner;

class Main5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수 입력 ");

        int dan = sc.nextInt();

        System.out.println("당신이 입력한 숫자는 : " + dan);

        for (int num = 1; num <= 9; num++) {

            System.out.println(dan + " * " + num + " = " + dan * num );

        }

        // dan을 입력 받고
        //num은 9보다 작거나 같을 떄까지
        //dan*num

    }
}
