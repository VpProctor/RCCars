package com.rccars.model.base;

import com.rccars.model.impl.forSale;

import java.math.BigDecimal;

public abstract class AbstractRCCar implements forSale {

    // variables
    private String motorNumber;


    // Abstract Methods
    public abstract BigDecimal getSaleValue();
    public abstract String getUPC();
    public abstract String getWheelType();
    public abstract int getStartingNumber();


    //abstract methods
    public void setMotorNumber(String motorNumber) {
        this.motorNumber = motorNumber;
    }

    public String getMotorNumber() {
        return motorNumber;
    }


    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(0.0);
    }

    public String getUpgradeName(){
        return "";
    }

} // End Class
