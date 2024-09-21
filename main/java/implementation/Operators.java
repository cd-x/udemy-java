package main.java.implementation;

import main.java.interfaces.IOperators;

public class Operators implements IOperators {

    @Override
    public float getArea(float base, float height) {
        return base*height/2;
    }

    @Override
    public double[] getRoots(int a, int b, int c) {
        return new double[]{(-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a, (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a};
    }

    public static int[][] multiplyMatrix(int[][] A, int[][] B) throws Exception {
        int r1 = A.length, r2 = B.length;
        int c1 = A[0].length, c2 = B[0].length;
        if(c1 != r2) throw new Exception("invalid matrix size");
        int res[][] = new int[r1][c2];
        for(int _r1 = 0;_r1<r1;_r1++){
            for(int _c2=0;_c2<c2;_c2++){
                for(int com = 0;com<c1;com++) res[_r1][_c2] += A[_r1][com] * B[com][_c2];
            }
        }
        return res;
    }
}
