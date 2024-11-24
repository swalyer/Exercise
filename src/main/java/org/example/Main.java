package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalc SumCalc = (x,y) -> x+y;
        System.out.println(SumCalc.sum(12, 24));
        System.out.println(SumCalc.sum(34,22));
        SumCalc sum = new SumCalc() {
            @Override
            public int sum(int a, int b) {
                return a * b;
            }
        };
        System.out.println(sum.sum(23,32));
        SumCalc sum1 = new SumCalc() {
            @Override
            public int sum(int a, int b) {
                return a/b;
            }
        };
        System.out.println(sum1.sum(32, 6));


    }
}