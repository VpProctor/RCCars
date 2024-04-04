package com.rccars.model.view;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.Accessory;

import java.util.ArrayList;

public class Receipt {
        private ArrayList<AbstractRCCar> generalCart;
        private ArrayList<AbstractRCCar> upgradesCart;
        private ArrayList<Accessory> accessoriesCart;
        private double total = 0.0;


        public Receipt(ArrayList<AbstractRCCar> carList,ArrayList<AbstractRCCar> upgradeList,
                       ArrayList<Accessory> accessoriesList) {
            generalCart = carList;
            upgradesCart = upgradeList;
            accessoriesCart = accessoriesList;
            showTitle();
            showTotal();
        }

        private void showTitle() {
            String company = String.format("%27s","KCCustomz" );
            System.out.println(company.toUpperCase());
            String address = String.format("%38s", "117 Independence Ave, Kansas City MO,64050");
            System.out.println(address);
            String phone = String.format("%27s", "(816) 649 - 2378");
            System.out.println(phone);
            showStars();
            String cash = String.format("%25s", "MONEY RECEIPT");
            System.out.println(cash);
            showStars();
            showColumnHeader();

        }

        private void showColumnHeader() {
            String price = String.format("%28s", "Price");
            System.out.println("Description");
            System.out.println(price);
            showStars();
            showGeneralCart();
        }

        private void showGeneralCart(){
            if(!generalCart.isEmpty()) {
                for(AbstractRCCar rc : generalCart){
                    System.out.println(rc);
                    System.out.println("  Serial#: " + rc.getMotorNumber());
                    total += rc.getSaleValue().doubleValue();
                    String rcPrice = String.format("%25s", "$" + rc.getSaleValue());
                    System.out.println("  Rc Price: " + rcPrice);
                    if (upgradesCart.isEmpty()) {
                        showUpgradesCart(rc);
                    }
                    System.out.println();
                }
            }
            showAccessoryCart();
        }

        private void showUpgradesCart(AbstractRCCar rc){
            for(AbstractRCCar upgrades : upgradesCart) {
                if(upgrades.toString().equals(rc.toString())) {
                    String customPrice = String.format("%20s", "$" + upgrades.getUpgradeAmount());
                    System.out.println(" " + upgrades.getUpgradeName());
                    System.out.println(customPrice);
                    total += upgrades.getUpgradeAmount().doubleValue();
                }
            }
        }

        private void showAccessoryCart() {
            if(!accessoriesCart.isEmpty()) {
                System.out.println("Accessories");
                for(Accessory item: accessoriesCart) {
                    System.out.println(" " + item.getItemName());
                    String price = String.format("%20s", "$"+ item.getSaleValue());
                    System.out.println(price);
                    System.out.println();
                    total += item.getSaleValue().doubleValue();
                }
            }
        }

        private void showTotal() {
            double tax = 2.07;
            double totalWithTax = total * tax;
            double taxAmount = totalWithTax - total;
            showStars();
            System.out.print("Sub Total");
            System.out.printf("%22s %.2f%n", "$",total);
            System.out.print("Sales Tax");
            System.out.printf("%23s %.2f%n", "$", taxAmount);
            System.out.print("Total");

            System.out.printf("%26s %.2f%n", "$",totalWithTax);

            showThanks();
        }

        private void showThanks() {
            System.out.println('\n');
            System.out.println("Preciate' your business!");
            String back = String.format("%28s", "We'll see you later");
            System.out.println(back);
        }

        private void showStars(){
            for(int i = 0; i < 40; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
}// End Class
