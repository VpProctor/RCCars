package com.rccars.model.view;

import com.rccars.controller.InventoryGenerator;
import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.Accessory;
import com.rccars.model.sub.KnobbyTireOption;
import com.rccars.model.sub.MilitaryShellOption;
import com.rccars.model.sub.SlickTireOption;
import com.rccars.model.sub.TruckShellOption;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Order {
    private final ArrayList<AbstractRCCar> carOrder;
    private final ArrayList<AbstractRCCar> customOptions;
    private final ArrayList<Accessory>accessoryOrder;
    private Scanner userIn;
    private final InventoryGenerator inventory;
    private AbstractRCCar carChoice;
    private AbstractRCCar optionChoice;
    private Accessory carExtra;


    public Order(){
        carOrder = new ArrayList<>();
        customOptions = new ArrayList<>();
        accessoryOrder = new ArrayList<>();
        inventory = new InventoryGenerator();
    }
    public void welcomeMessage(){
        System.out.println("Hello and welcome to our RC Car Shop");
        System.out.println("The one and only place for all things RC Cars.");
        orderGenerator();
    }

    private void orderGenerator(){
        String value = buySomething();
        if(value.isBlank() || value.isEmpty()){
            value = buySomething();
        } if (value.equals("1")){
            buyAccessories();
        }else {
            buyRC();
        }
    }

    private String buySomething(){
        System.out.println("So what are you lookin' for; cars or accessories?");
        System.out.println("Here's your options: \n1 Accessories \n2 Car ");
        String pattern = "[1-2]+";
        return verifyResult(pattern);
    }

    private void buyRC(){
        System.out.println("What kind of car are you thinking?");
        System.out.println("We've got :\n1- Sport\n2 - SUV \n3 - Classic"+
                "\n4 - ATV \n5 - Dune Buggy \n6 - Crawler");
        String pattern = "[1-6]+";
        String answer = verifyResult(pattern);
        switch (answer){
            case "1":
                carChoice = inventory.getSportCarList().get(0);
                inventory.getSportCarList().remove(0);
                break;
            case"2":
                carChoice= inventory.getSuvList().get(0);
                inventory.getSuvList().remove(0);
                break;
            case"3":
                carChoice = inventory.getClassicList().get(0);
                inventory.getClassicList().remove(0);
                break;

            case "4":
                carChoice = inventory.getAtvList().get(0);
                inventory.getAtvList().remove(0);
                break;
            case "5":
                carChoice = inventory.getDuneBuggyList().get(0);
                inventory.getDuneBuggyList().remove(0);
                break;
            case "6":
                carChoice = inventory.getCrawlerList().get(0);
                inventory.getCrawlerList().remove(0);
                break;
            default:
                buyRC();
        }
        upgradeOffer();
        carOrder.add(carChoice);
        anotherCar();
        orderDone();
    }

    private void buyAccessories(){
        System.out.println("What accessories are you interested in? ");
        System.out.println("We got: \n1 Chassis Converter Kit\n2 Turn Signal" +
                "\n3 Car Work Stand\n4 Optional Battery");
        String pattern = "[0-4]+";
        String item = userIn.next(pattern);
        accessoryChoice(item);
        accessoryOrder.add(carExtra);
        moreAccessories();
    }
    private void accessoryChoice(String item){
        switch (item){
            case "1":
                carExtra = new Accessory("Chassis Converter Kit", BigDecimal.valueOf(39.99));
                break;
            case "2":
                carExtra = new Accessory("Turn Signal Lamp", BigDecimal.valueOf(15.99));
                break;
            case "3":
                carExtra = new Accessory("Car Work Stand", BigDecimal.valueOf(20.99));
                break;
            case "4":
                carExtra = new Accessory("Optional Battery", BigDecimal.valueOf(40.99));
                break;
            default:
                System.out.println("That's not an option, try another.");
                buyAccessories();

        }

    }

    private void upgradeOffer(){
        System.out.println("Here are some upgrades we offer, take a look.");
        System.out.println("We offer the following:\n1 Military Shell\n2 Truck Shell" +
                "\n3 Knobby Tires\n4 Slick Tires\n0 None ");
        String pattern = "[0-4]+";
        String answer = verifyResult(pattern);
        switch (answer){
            case "0":
                optionChoice = null;
                break;
            case "1":
                optionChoice = new MilitaryShellOption(carChoice);
                break;
            case "2":
                optionChoice = new TruckShellOption(carChoice);
                break;
            case "3":
                optionChoice = new KnobbyTireOption(carChoice);
                break;
            case "4":
                optionChoice = new SlickTireOption(carChoice);
                break;
            default:
                upgradeOffer();
        }
        if (optionChoice != null){
            customOptions.add(optionChoice);
            moreUpgrades();
        }
    }

    private void moreUpgrades(){
        System.out.println("Do you want to add another Upgrade? Yes or No?");
        String val = userIn.next();
        switch (val){
            case "Yes":
                upgradeOffer();
                break;
            case "No":
                break;
            default:
                System.out.println("That's not an option. Try again.");
                moreUpgrades();
        }

    }

    private void anotherCar(){
        System.out.println("Do you want to add another car? Yes or No?");
        String answer = userIn.next();
        switch (answer.toLowerCase()){
            case "yes":
                carChoice = null;
                buyRC();
                break;
            case "no":
                buyAccessories();
                break;
            default:
                System.out.println("That's not an option. Try again.");
                anotherCar();
        }
    }

    private void moreAccessories(){
        System.out.println("Wanna add another Accessory? Yes or No?");
        String val = userIn.next();
        switch (val){
            case "Yes":
                carExtra = null;
                buyAccessories();
                break;
            case "No":
                break;
            default:
                System.out.println("That's not an option. Try again.");
                moreAccessories();
        }

    }

    private void orderDone(){
        new Receipt(carOrder,customOptions, accessoryOrder);
    }

    private String verifyResult(String pattern){
        String answer = "";
        try{
            userIn = new Scanner(System.in);
            answer = userIn.next(pattern);
        }catch (InputMismatchException ex){
            System.out.println("That's not an option. Try again.");
        }
        return answer;
    }

}// End Class
