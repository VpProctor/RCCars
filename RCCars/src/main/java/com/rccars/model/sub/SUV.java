package com.rccars.model.sub;

import com.rccars.model.base.AbstractStreetCar;


import java.math.BigDecimal;

public class SUV extends AbstractStreetCar {

    @Override
    public BigDecimal getSaleValue() {
        return BigDecimal.valueOf(210.00);
    }

    @Override
    public String getUPC() {
        return "642852";
    }
    @Override
    public int getStartingNumber() {
        return 9753;
    }

    @Override
    public String getMotorNumber(){
        return "SUV3019";
    }
        @Override
    public String toString() {
        return "SUV Street Car";
    }


}// End Class
