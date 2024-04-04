package com.rccars.model.sub;
import com.rccars.model.base.AbstractStreetCar;

import java.math.BigDecimal;

public class Classic extends AbstractStreetCar {

    @Override
    public BigDecimal getSaleValue () {
        return BigDecimal.valueOf(197.00);
    }

   @Override
   public String getUPC() {
        return "315790";
   }

   @Override
    public int getStartingNumber() {
        return 7326;
   }

   @Override
   public String getMotorNumber(){
        return "ClS4019";
   }

   @Override
    public String toString() {
        return "Classic Street Car";
   }

}// End Class
