package com.rccars.model.sub;

import com.rccars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class ATV extends AbstractOffRoad {

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(99.00);
    }

    @Override
    public String getUPC() {
        return "113342";
    }

    @Override
    public int getStartingNumber() {
        return 8488;
    }

    @Override
    public String getMotorNumber() {
        return "ORAT2400";
    }

    @Override
    public String toString(){
        return "ATV Off-Road Car";
    }
} // End Class
