package com.rccars.model.sub;

import com.rccars.model.base.AbstractOffRoad;

import java.math.BigDecimal;

public class DuneBuggy extends AbstractOffRoad {

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(200.00);
    }

    @Override
    public String getUPC() {
        return "885532";
    }

    @Override
    public int getStartingNumber() {
        return 7446;
    }

    @Override
    public String getMotorNumber(){
        return "ORDB3400";
    }

    @Override
    public String toString() {
        return "Dune Buggy Off-Road Car ";
    }


} // End Class

