package org.example;

// -100부터 25까지의 합을 출력해주세요.
public class Main6 {
    public static void main(String[] args) {

        int i = 0;
        int j = -100;

        while (j <= 25) {
            i += j;
            System.out.println(i);
            j++;
        }



        System.out.println("====");
        System.out.println(i);



    }
}
