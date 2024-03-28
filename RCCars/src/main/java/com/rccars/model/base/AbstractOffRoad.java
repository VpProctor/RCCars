package com.rccars.model.base;

import  java.math.BigDecimal;

public abstract class  AbstractOffRoad extends AbstractRC{

        public AbstractOffRoad(ShellFrame type) {
            super(type);
        }

        @Override
        public String getWheelType() {
            return "Wide Wheel and Tire";
        }
}// End Class
