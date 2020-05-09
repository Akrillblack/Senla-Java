package com.company.tasks.sixth;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Thing> bestList = null;
    private double maxWeight;
    private double maxCost;

    public Bag(double maxWeight) {
        this.maxWeight = maxWeight;
    }
        // calculating sum of weight in things list
    private double calculateWeight(List<Thing> things){
        double sumWeight = 0;
        for (Thing a: things) {
            sumWeight += a.weigh;
        }
        return sumWeight;
    }
        // calculating sum of costs in things list
    private double calculateCost(List<Thing> things){
        double sumCost = 0;
        for (Thing a : things) {
            sumCost += a.cost;
        }
        return sumCost;
    }
        // checking if it is the best things list
    private void checkThingList(List<Thing> things){
        if (bestList == null){
            if (calculateWeight(things) <= maxWeight){
                bestList = things;
                maxCost = (calculateCost(things));
            }
        }else {
            if (calculateWeight(things) <= maxWeight && calculateCost(things) > maxCost){
                bestList = things;
                maxCost = calculateCost(things);
            }
        }

    }
    // finding all of thing lists
    public void findAllLists(List<Thing> things){
        if(things.size() > 0){
            checkThingList(things);
            for(int i = 0; i < things.size(); i ++){
                List<Thing> tempList = new ArrayList<>(things);
                tempList.remove(i);
                findAllLists(tempList);
            }
        }
    }

    public List<Thing> getBestList(){
        return bestList;
    }


}
