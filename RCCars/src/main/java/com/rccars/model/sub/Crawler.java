package com.rccars.model.sub;

import com.rccars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class Crawler extends AbstractOffRoad {

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(250.00);
    }

    @Override
    public String getUPC() {
        return "756643";
    }

    @Override
    public int getStartingNumber() {
        return 3398;
    }

    @Override
    public String getMotorNumber(){
        return "ORCR4600";

    }
    @Override
    public String toString() {
        return " Crawler Off-Road Car";
    }

}// End Class
