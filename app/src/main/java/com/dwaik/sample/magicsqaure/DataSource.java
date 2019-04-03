package com.dwaik.sample.magicsqaure;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    List<Integer> data;

    public DataSource(int size, BaseConstructor constructor) {
        data = new ArrayList<>();
        if (constructor != null) {
            int[][] arr = constructor.construct(size);
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    data.add(arr[i][j]);
                }
            }
        }
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

}
