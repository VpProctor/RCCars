package com.rccars.model.sub;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.AbstractRCUpgrade;

import java.math.BigDecimal;

public class TruckShellOption extends AbstractRCUpgrade {

    public TruckShellOption (AbstractRCCar car) {
        super (car);
    }

    @Override
    public BigDecimal getUpgradeAmount() {
        return BigDecimal.valueOf(70.00);
    }

    @Override
    public String getUpgradeName() {
        return "Truck Shell Option";
    }

    @Override
    public String toString(){
        return upgradesCar.toString();
    }

}// End Class
