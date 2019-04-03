package com.dwaik.sample.magicsqaure;

public class SquareConstructor implements BaseConstructor {

    public int[][] construct(int size) {
        int[][] arr = new int[size][size];
        int value = 1;
        int i = size - 1;
        int j = (size - 1) / 2;
        int tmpI;
        int tmpJ;

        while (value <= size * size) {
            arr[i][j] = value;
            tmpI = (i + 1) % size;
            tmpJ = (j + 1) % size;
            if (arr[tmpI][tmpJ] != 0) { //already visited
                i = i == 0 ? size - 1 : i - 1;
            } else {
                i = tmpI;
                j = tmpJ;
            }
            value++;
        }
        return arr;
    }
}
