package org.example;

// 조건문의 가장 기본적인 형태

class Main {
    public static void main(String[] args) {

        int age = 19;

        System.out.println("당신의 나이 : " + age);

        if (19 >= age) { // 논리형
            System.out.println("미성년자");

        }

        if (20 <= age) {
            System.out.println("성인");
        }
    }
}