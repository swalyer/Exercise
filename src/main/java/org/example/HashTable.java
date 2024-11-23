package org.example;

import java.util.HashMap;
import java.util.HashSet;

public class HashTable {
    Main main = new Main();
    private int[] data = main.getData();
    private String data1 = main.getData1();
    private HashMap<Integer, String> hashMap = new HashMap<>();
    private HashSet<Integer> hashSet = new HashSet<>();
    protected void hashMapDataInsert() {
        for (int datum : data) {
            hashMap.put(datum, data1);
        }
    }
        protected void hashMapDataShower() {
            hashMap.forEach((key, value) -> System.out.println(key + " " + value));
    }
    protected void hashSetDataInsert(){
        for(int datum: data){
            hashSet.add(datum);
        }
    }
    protected void hashSetDataShower(){
        hashSet.forEach(System.out::println);
    }


}
