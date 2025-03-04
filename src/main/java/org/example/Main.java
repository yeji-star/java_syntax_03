package org.example;


class Main {
    public static void main(String[] args) {

        int x = 10;

        System.out.println("x"); // 출력 : x
        System.out.println(x); // 출력 : 10
        System.out.println("x" + x); // 출력 : x10
        System.out.println("x : " + x); // 출력 : x : 10


        System.out.println("x : " + x * 5);

        // 연산자 우선 순위에 의해서 처리됨

        System.out.println("x : " + x + 5);

        // "x : " + x + 5 -> "x : " + "10" + 5 -> "x : 10" + 5 -> "x : 10" + "5" -> "x : 105"

        System.out.println("x : " +(x+5));

    }
}