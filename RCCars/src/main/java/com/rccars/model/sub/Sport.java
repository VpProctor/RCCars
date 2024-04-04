package com.rccars.model.sub;

import com.rccars.model.base.AbstractStreetCar;

import java.math.BigDecimal;

public class Sport extends AbstractStreetCar {


    @Override
    public BigDecimal getSaleValue(){
        return BigDecimal.valueOf(150.00);
    }

    @Override
    public String getUPC(){
        return "MB605";
    }

    @Override
    public String getMotorNumber() {
        return "SPT2019";
    }

    @Override
    public int getStartingNumber() {
         return 258456;
    }

    @Override
    public String toString() {
        return "Sport Street Car";
    }

}// End Class
