package java3_hw1;

import java.util.Arrays;
import java.util.List;

public class TransformToList<T> {
    private T[] arr;

    public TransformToList(T... arr) {
        this.arr = arr;
    }

    public void transform(){
        List<T> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
