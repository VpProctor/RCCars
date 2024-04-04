package com.rccars.model.sub;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.AbstractRCUpgrade;

import java.math.BigDecimal;

public class MilitaryShellOption extends AbstractRCUpgrade{

    public  MilitaryShellOption (AbstractRCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount() {
        return BigDecimal.valueOf(85.00);
    }

    @Override
    public String getUpgradeName() {
        return "Military Shell Option";
    }


    @Override
    public String toString(){
       return upgradesCar.toString();
    }


}//End Class
