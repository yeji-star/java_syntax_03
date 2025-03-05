package org.example;


class Main5 {
    public static void main(String[] args) {

        char c = 'a';

        System.out.println(c);
        System.out.printf("%c\n", c);
        // %는 지정자. %c는 문자 지정자. 이 문장은 c라는 서식으로 "%c\n"을 출력하겠다.

        int a = 97;

        System.out.println(a);
        System.out.printf("%d", a);
        //decimal <- 10진수(정수) 그렇기에 %d로 해서 정수 지정자를 한 것.
        //%c면 그냥 a만 출력된다.
        //%d 정수(10진수), %f 실수 , %c 문자, %s 문장


    }
}
