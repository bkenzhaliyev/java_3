package java3_hw1;

import java3_hw1.fruits.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> container;

    public Box(List<T> container) {
        this.container = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.container = new ArrayList(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : container) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void transfer(Box<? super T> another) {
        if (another == this) {
            return;
        }
        another.container.addAll(this.container);
        this.container.clear();
    }

    public boolean compare(Box<? super T> another){
        return Math.abs(getWeight() - another.getWeight()) < 0.001;
    }

    public void addFruit(T fruit){
        this.container.add(fruit);
    }
}
