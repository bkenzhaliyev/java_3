package java3_hw1;

import java.util.Arrays;

public class MyArray<T> {
    private T[] arr;
    private T elem;

    public MyArray(T... arr) {
        this.arr = arr;
    }

    public void elemChange(int e1, int e2) {
        if (e1 <= arr.length && e2 <= arr.length) {
            elem = arr[e1];
            arr[e1] = arr[e2];
            arr[e2] = elem;
        } else {
            System.out.println("Ошибка индекса");
        }
    }

    public void printArr() {
        System.out.println();
          for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i] + " ");
        }
    }
}
