package org.example;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Tree {
    Main main = new Main();
    private TreeSet<Integer> tree1 = new TreeSet<>();
    private TreeMap<Integer, String> tree = new TreeMap<>();
    private int[] data = main.getData();
    private String data1 = main.getData1();
    protected void treeMapDataInsert(){
        for (int datum : data){
            tree.put(datum, data1);
        }
    }
    protected void treeMapDataShow(){
        tree.forEach ((key, value ) -> System.out.println(key + " " + value));
    }
    protected void treeSetDataInsert(){
        for( int datum : data){
            tree1.add(datum);
        }
    }
    protected void treeSetDataShow(){
        tree1.forEach(System.out::println);
    }

}
