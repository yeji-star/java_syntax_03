package org.example;

// 문제 : 1부터 3까지 출력하는 작업을 10번 해주세요.
// 조건 : 2중 while문 사용

public class Main7 {
    public static void main(String[] args) {

        // 출력

        int i= 0;

        while (i < 10) {

            i++;

            if (i==3){
                continue; //break // 반복문 컨트롤
            }

            System.out.println(" i= " + i);


            }

        }

        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
        // 1
        // 2
        // 3
    }
