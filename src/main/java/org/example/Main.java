package org.example;
public class Main {
  private  int[] data = new int[] {1,2,5,3,4};
   private  String  data1 ="i am a string";


    public int[] getData() {
        return data;
    }
    public String getData1() {
        return data1;
    }
    Main(){
        data = this.data;
        data1 = this.data1;
    }

    public static void main(String[] args) {
        /* HashTable hash = new HashTable();
        hash.hashMapDataInsert();
        hash.hashMapDataShower();
        hash.hashSetDataInsert();
        hash.hashSetDataShower();*/
        /* Tree tree = new Tree();
        tree.treeMapDataInsert();
        tree.treeMapDataShow();
        tree.treeSetDataInsert();
        tree.treeSetDataShow();*/


    }

}