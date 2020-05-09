package com.company.tasks.sixth;

import java.util.ArrayList;
import java.util.List;

/**
 * Имеется набор вещей, которые необходимо поместить в рюкзак.
 * Рюкзак обладает заданной грузоподъемностью.
 * Вещи в свою очередь обладают двумя параметрами — весом и стоимостью.
 * Цель задачи заполнить рюкзак не превысив его грузоподъемность и максимизировать суммарную ценность груза.
 */

public class SixthTask {
    private List<Thing> things;
    Bag bag = new Bag(15);

    private void addThingsForTest(){
        things = new ArrayList<>();
        things.add(new Thing(1, 1));
        things.add(new Thing(2, 2));
        things.add(new Thing(3, 3));
        things.add(new Thing(4, 4));
        things.add(new Thing(5, 5));
        things.add(new Thing(6, 6));
    }

    public void solve (){
        bag.findAllLists(things);
        List<Thing> result = bag.getBestList();
        System.out.println(result);
    }
}
