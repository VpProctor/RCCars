package com.rccars.model.base;

import model.base.AbstractRC;

import java.math.BigDecimal;

public  abstract class AbstractRcOptions extends AbstractRC {

    protected AbstractRC RCUpgrades;

    public AbstractRcOptions(AbstractRC RCCar) {
        super(RCCar.getShellFrame());
        RCUpgrades = RCCar;
    }

    /* Methods below are not needed, but are required.
     * Pass values back using variable RCUpgrades.*/
    @Override
    public BigDecimal getSaleValue() {
        return RCUpgrades.getSaleValue();
    }

    @Override
    public String getPrefix() {
        return RCUpgrades.getPrefix();
    }

    @Override
    public String getWheelType() {
        return RCUpgrades.getWheelType();
    }

    @Override
    public int getStartNumber(){
        return RCUpgrades.getStartNumber();
    }

    @Override
    public String getSerialNumber(){
        return RCUpgrades.getSerialNumber();
    }
} // End CLass
