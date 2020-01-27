package com.github.vitalliuss.helloci.taskcollections;

import com.github.vitalliuss.helloci.taskcollections.stones.Stone;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private List<Stone> stoneList = new ArrayList<>();

    public List<Stone> getStoneList() {
        return stoneList;
    }

    public void setStoneList(List<Stone> stoneList) {
        this.stoneList = stoneList;
    }

    public int getNeckWeight (){
        int neckWeight = 0;
        for (Stone stone: stoneList) {
            neckWeight += stone.getWeight();
        }
        return neckWeight;
    }

    public int getNeckPrice (){
        int neckPrice = 0;
        for (Stone stone: stoneList) {
            neckPrice += stone.getPrice();
        }
        return neckPrice;
    }

    public void sortByPrice(){
        stoneList.sort((o1, o2)->o1.getPrice() - o2.getPrice());
    }

    public List<Stone> findByTransparency(int fromTransparency, int toTransparency){
        ArrayList <Stone> listByTransparency = new ArrayList<>();
        for (Stone stone: stoneList) {
            if (stone.getTransparency() >= fromTransparency && stone.getTransparency() <=toTransparency){
                listByTransparency.add(stone);
            }
        }
        return listByTransparency;
    }

}
