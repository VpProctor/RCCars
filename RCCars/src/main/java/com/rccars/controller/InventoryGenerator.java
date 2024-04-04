package com.rccars.controller;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.sub.Classic;
import com.rccars.model.sub.SUV ;
import com.rccars.model.sub.Sport;
import com.rccars.model.sub.DuneBuggy;
import com.rccars.model.sub.ATV;
import com.rccars.model.sub.Crawler;

import java.util.ArrayList;
import java.util.function.Supplier;

public class InventoryGenerator {
    private final ArrayList<AbstractRCCar> sportCarList = new ArrayList<>();
    private final ArrayList<AbstractRCCar> suvList= new ArrayList<>();
    private final ArrayList <AbstractRCCar> classicList = new ArrayList <>();
    private final ArrayList <AbstractRCCar> AtvList = new ArrayList<>();
    private final ArrayList <AbstractRCCar> crawlerList = new ArrayList<>();
    private final ArrayList <AbstractRCCar> duneBuggyList = new ArrayList <>();
    private final SerialNumberGenerator generator;

    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        buildRcInventory(sportCarList,()-> new Sport());
        buildRcInventory(classicList,()-> new Classic());
        buildRcInventory(suvList,()-> new SUV());
        buildRcInventory(AtvList,() -> new ATV());
        buildRcInventory(crawlerList,() -> new Crawler());
        buildRcInventory(classicList,() -> new Classic());
        buildRcInventory(duneBuggyList,()-> new DuneBuggy());
    }
    public InventoryGenerator(SerialNumberGenerator generator){
        this.generator = generator;
    }

    public ArrayList<AbstractRCCar>getSuvList(){
        return suvList;
    }

    public ArrayList<AbstractRCCar>getSportCarList() {
        return sportCarList;
    }

    public ArrayList<AbstractRCCar> getAtvList() {
        return AtvList;
    }

    public ArrayList<AbstractRCCar> getCrawlerList() {
        return crawlerList;
    }

    public ArrayList<AbstractRCCar> getDuneBuggyList() {
        return duneBuggyList;
    }

    public ArrayList<AbstractRCCar> getClassicList() {
        return classicList;
    }

    private void buildRcInventory(ArrayList<AbstractRCCar> carList, Supplier<AbstractRCCar> carSupply) {
        generator.startGeneration(carSupply.get().getUPC(),carSupply.get().getStartingNumber(),carSupply.get().getMotorNumber());


        for (int i = 0; i < 100 ; i++) {
            AbstractRCCar car = carSupply.get();
            car.setMotorNumber(generator.getNextSerial());
            carList.add(i,car);
        }
    }
}// End Class
