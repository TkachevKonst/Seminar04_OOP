package org.example;

import java.util.ArrayList;

public class Program {

    /**
     Домашняя работа, задача:
     ========================

     a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
     b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
     поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
     c. Для хранения фруктов внутри коробки можно использовать ArrayList;
     d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
     вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
     e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
     подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
     Можно сравнивать коробки с яблоками и апельсинами;
     f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
     Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
     Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
     g. Не забываем про метод добавления фрукта в коробку.
     */
    public static void main(String[] args) {
        Box<Orange> orangeBox = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Apple apple = new Apple();


        Orange orange = new Orange();

        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);
        appleBox.add(apple);




        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);
        orangeBox.add(orange);


        System.out.println(appleBox);
        System.out.println("****");
        System.out.println(orangeBox);
        System.out.println("****");
        appleBox.compare(orangeBox);
        System.out.println("****");
        Box<Fruit>fruitBox = new Box<>();
        fruitBox.add(apple);

        System.out.println(fruitBox);
        System.out.println("****");
        appleBox.transferFruits(fruitBox, 9);
        System.out.println("****");
        System.out.println(fruitBox);
        System.out.println("****");
        System.out.println(appleBox);
    }

}

