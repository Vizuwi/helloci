package com.github.vitalliuss.helloci.taskcollections;

import com.github.vitalliuss.helloci.taskcollections.stones.Diamond;
import com.github.vitalliuss.helloci.taskcollections.stones.Emerald;
import com.github.vitalliuss.helloci.taskcollections.stones.Ruby;

public class JewelryMain {
    public static void main(String[] args) {
        Necklace necklace = new Necklace();

        Diamond diamond1235 = new Diamond("Diamond_1235", 250, 15, 80, "circle");
        Diamond diamond2539 = new Diamond("Diamond_2539", 300, 20, 90, "square");
        Diamond diamond465 = new Diamond("Diamond_465", 150, 7, 60, "circle");
        Ruby ruby125 = new Ruby("Ruby_125", 120, 12, 60, 80);
        Ruby ruby15 = new Ruby("Ruby_15", 110, 12, 40, 90);
        Ruby ruby1265 = new Ruby("Ruby_1265", 160, 12, 25, 40);
        Emerald emerald123 = new Emerald("Emerald_123", 210, 5, 35, "LightGreen");
        Emerald emerald654 = new Emerald("Emerald_654", 120, 9, 70, "BlackGreen");
        Emerald emerald753 = new Emerald("Emerald_753", 90, 3, 15, "RedGreen");

        necklace.getStoneList().add(diamond1235);
        necklace.getStoneList().add(diamond2539);
        necklace.getStoneList().add(diamond465);
        necklace.getStoneList().add(ruby125);
        necklace.getStoneList().add(ruby15);
        necklace.getStoneList().add(ruby1265);
        necklace.getStoneList().add(emerald123);
        necklace.getStoneList().add(emerald654);
        necklace.getStoneList().add(emerald753);

        necklace.getNeckWeight();
        necklace.getNeckPrice();

        necklace.sortByPrice();

        necklace.findByTransparency(90, 100);

    }
}
