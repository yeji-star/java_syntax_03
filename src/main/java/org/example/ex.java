package org.example;

import java.util.Scanner;

class ex {
    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);
        //자바는 int, string과 달리 char형을  Scanner을 통해 바로 받을 수 없다.
        //따라서 next를 통해 Scanner를 받은 다음,charAt()로 char형으로 바꿔줘야 한다.
        //여기서 0은 문자의 위치를 뜻한다.

        System.out.println(c);


    }
}
