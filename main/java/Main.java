package main.java;

import main.java.implementation.Operators;
import main.java.interfaces.IOperators;

public class Main {

    public static void main(String[] args) throws Exception {
       int A[][] = {{3,5,9}, {7,6,2}, {4,3,5}};
       int B[][] = {{1,0,0}, {0,1,0}, {0,0,1}};
       int res[][] = Operators.multiplyMatrix(A,B);
       for(int r[]: res){
           for(int x: r){
               System.out.printf("%d ", x);
           }
           System.out.println("");
       }
    }
}

/**
 * literals with same value refer to same memory address in pool
 * String is immutable, any operation performed returns new string stored in heap
 * String.valueOf() returns string of any datatype passed as param
 */