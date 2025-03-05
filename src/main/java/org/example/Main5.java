package org.example;


class Main5 {
    public static void main(String[] args) {

        int age = 25;
        double income = 55000;
        boolean hasCriminalRecord = false;

        if(age > 21 &&  (income > 50000 || income <= 0) && !hasCriminalRecord) {
            System.out.println("dd");
        } else {
            System.out.println("ss");
        }


    }
}
