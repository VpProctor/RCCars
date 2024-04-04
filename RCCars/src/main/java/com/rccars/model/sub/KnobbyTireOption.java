package com.rccars.model.sub;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.AbstractRCUpgrade;

import java.math.BigDecimal;

public class KnobbyTireOption extends AbstractRCUpgrade {

    public KnobbyTireOption(AbstractRCCar car){
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount(){
        return BigDecimal.valueOf(34.97);
    }

    @Override
    public String getUpgradeName() {
        return "Knobby Tires Option";
    }

    @Override
    public String toString(){
        return upgradesCar.toString();
    }

}// End Class
