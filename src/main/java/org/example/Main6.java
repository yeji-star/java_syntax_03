package org.example;

// -100부터 25까지의 합을 출력해주세요.
public class Main6 {
    public static void main(String[] args) {

        int i = 0;
        int j = -100;

        while (j <= 25) {
            i += j;
            j++;
        }

        System.out.println(i);

        System.out.println("for문");

        i=0;
        for (j=-100;j<=25;j++) {
            i+=j;
        }
        System.out.println(i);



    }
}
