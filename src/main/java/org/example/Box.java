package org.example;

import java.util.ArrayList;


public class Box <T extends Fruit> {


    private int lastIndex = -1;
    private ArrayList<T> fruits = new ArrayList<>();


    public float getWeight(){
        return this.size()*this.getFruit(0).getWeight();
    }

    /**
     * Сравнение ящика с текущим
     * @param o1
     * @return
     */
    public boolean compare(Box o1) {
        if (o1.getWeight() == this.getWeight()){
            System.out.println("Ящики равны");
            return true;
        }else {
            System.out.println("Ящики не равны");
            return false;
        }
    }

    /**
     * Перенос фруктов определенное количество
     * @param fruits2
     * @param count
     * @return
     */
    public boolean transferFruits(Box fruits2, int count){
        if(fruits2.add(this.getFruit(0))){
            this.removeFruit(0);
            for (int i = 1; i < count; i++) {
                fruits2.add(this.getFruit(0));
                this.removeFruit(0);
            }
            System.out.println("Пересыпали фрукты в другой ящик");
            return true;
        } else {
            System.out.println("Не возможно поместить в один ящик, разные фрукты");
            return false;
        }
    }

    /**
     * перенос всего ящика фруктов(перегрузка метода).
     * @param fruits2
     * @return
     */
    public boolean transferFruits (Box fruits2){
        this.transferFruits(fruits2, fruits.size());
        return false;
}

    /**
     * добавление фруктов в ящик
     * @param fruit
     * @return
     */
    public boolean add(T fruit){
        if (this.size() == 0){
            lastIndex++;
            fruits.add(lastIndex,fruit);
            return true;
        } else if (this.size() > 0) {
            if (fruit.getClass().equals(this.getFruit(lastIndex).getClass())){
                lastIndex++;
                fruits.add(lastIndex,fruit);
                return true;
            }
        }
        return false;
    }

    /**
     * вывод информации.
     * @return
     */
    @Override
    public String toString() {
        if (this.size() > 0) {
            return String.format("Количество %s равно %d, общий вес %.2f", this.getFruit(0).name, this.size(), this.getWeight());
        }
        return String.format("Ящик пустой");
        }

    public Fruit getFruit(int i){
        return fruits.get(i);
    }
    public void removeFruit(int i){
        fruits.remove(i);
        lastIndex--;
    }
    public int size(){
        return lastIndex + 1;
    }
    public void removeAllFruit(){
        while (lastIndex >= 0){
            this.removeFruit(lastIndex);
        }
    }
}