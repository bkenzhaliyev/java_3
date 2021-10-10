package java3_hw1;

import java3_hw1.fruits.Apple;
import java3_hw1.fruits.Fruit;
import java3_hw1.fruits.Orange;

public class Main {
    public static void main(String[] args) {
        changeArray();
        System.out.println();
        transform();
        fruitsBox();

    }

    public static void changeArray() {
        MyArray<Integer> numArr = new MyArray<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        MyArray<String> strArr = new MyArray<>("A", "B", "C", "D", "I");
        numArr.printArr();
        numArr.elemChange(2, 6);
        numArr.printArr();

        strArr.printArr();
        strArr.elemChange(1, 3);
        strArr.printArr();
    }

    public static void transform() {
        TransformToList<Integer> numArr = new TransformToList<>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numArr.transform();
    }

    public static void fruitsBox() {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box boxWithApple = new Box(apple, apple, apple, apple, apple);
        Box boxWithOrange = new Box(orange, orange, orange);
        Box boxWithOrange1 = new Box();

        System.out.println("вес коробки c яблоками " + boxWithApple.getWeight());
        System.out.println("вес коробки c апельсинами " + boxWithOrange.getWeight());

        System.out.println("сравнение коробок " + boxWithApple.compare(boxWithOrange));

        boxWithOrange.transfer(boxWithOrange1);
        System.out.println("Добавляем еще один апельсин");
        boxWithOrange1.addFruit(orange);
        System.out.println("вес коробки c апельсинами " + boxWithOrange1.getWeight());
    }
}
