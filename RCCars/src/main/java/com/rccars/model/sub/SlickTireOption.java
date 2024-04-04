package com.rccars.model.sub;

import com.rccars.model.base.AbstractRCCar;
import com.rccars.model.base.AbstractRCUpgrade;

import java.math.BigDecimal;

public class SlickTireOption extends AbstractRCUpgrade {

    public SlickTireOption(AbstractRCCar car) {
        super(car);
    }

    @Override
    public BigDecimal getUpgradeAmount() {
        return BigDecimal.valueOf(24.99);
    }

    @Override
    public String getUpgradeName() {
        return "Slick Tires Upgrade";
    }

    @Override
    public String toString() {
        return upgradesCar.toString();
    }
    }
