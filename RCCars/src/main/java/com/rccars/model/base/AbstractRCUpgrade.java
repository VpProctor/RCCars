package com.rccars.model.base;

import java.math.BigDecimal;

public abstract class AbstractRCUpgrade extends AbstractRCCar {

    protected AbstractRCCar upgradesCar;

    public AbstractRCUpgrade(AbstractRCCar car) {
        upgradesCar = car;
    }
    /* Methods below are not needed, but are required.
     * Pass values back using variable RCUpgrades.*/
    @Override
    public BigDecimal getSaleValue() {
        return upgradesCar.getSaleValue();
    }
    @Override
    public String getUPC() {
        return upgradesCar.getUPC();
    }

    @Override
    public String getWheelType() {
        return upgradesCar.getWheelType();
    }

    @Override
    public int getStartingNumber(){
        return upgradesCar.getStartingNumber();
    }

    @Override
    public String getMotorNumber(){
        return upgradesCar.getMotorNumber();
    }
} // End CLass
