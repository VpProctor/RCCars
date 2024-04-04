package com.rccars.model.view;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.base.AbstractRCCar;

import java.util.ArrayList;
import com.rccars.model.base.Accessory;
import com.rccars.model.sub.KnobbyTireOption;
import com.rccars.model.sub.SlickTireOption;

import java.math.BigDecimal;

public class Program {

        public static void main(String[] args){
            Order myOrder = new Order();
            myOrder.welcomeMessage();
        }

        public static void receiptTest(){
            ArrayList<AbstractRCCar> carList = new ArrayList<>();
            ArrayList<AbstractRCCar> customUpgradesList = new ArrayList<>();
            InventoryGenerator generator = new InventoryGenerator();

            carList.add(generator.getSuvList().get(0));
            carList.add(generator.getSportCarList().get(0));
            carList.add(generator.getClassicList().get(0));
            carList.add(generator.getAtvList().get(0));
            carList.add(generator.getCrawlerList().get(0));
            AbstractRCCar custom = generator.getDuneBuggyList().get(1);
            custom = new KnobbyTireOption(custom);
            custom = new SlickTireOption(custom);
            carList.add(custom);
            customUpgradesList.add(custom);

            ArrayList<Accessory> accessories = new ArrayList<>();
            accessories.add(0, new Accessory("Chassis Converter Kit", BigDecimal.valueOf(39.99)));
            new Receipt(carList, customUpgradesList, accessories);
        }
}// End Class
