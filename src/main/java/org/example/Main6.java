package org.example;

class Main6 {
    public static void main(String[] args) {

        int i = 5; // 초기 (값)

        while (i == 4) { //(종료) 조건
            System.out.println(i);
            i+= 4; //step(보폭, 방향)
        }

        int j = 10;

        while (j<=3) {
            System.out.println(2);
            i++; // **중요**
        }

        System.out.println("i = " + j);
    }
    }
