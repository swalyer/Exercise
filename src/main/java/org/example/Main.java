package org.example;

import java.util.function.BiFunction;

public class Main {
 final  static private int a=12;
  final static  private int b=32;
  static  BiFunction<Integer,Integer,Integer>multiply = (x,y) -> x*y;




    public static void main(String[] args) {
        System.out.println(apply(a,b));



    }public static int apply(int x, int y){
        return multiply.apply(x,y);
    }
}