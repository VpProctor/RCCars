package com.rccars.model.sub;

import com.rccars.model.base.AbstractStreet;

import java.awt.*;
import java.math.BigDecimal;

public class Sport extends AbstractStreet {
    super (Frame.GREEN);

    public Sport() {
        super(Frame.);
    }

    @Override
    public BigDecimal getSaleValue(){
        return BigDecimal.valueOf(150.00);
    }
    @Override
    public String getPrefix(){
        return "Sport"
    }

    @Override
    public int getStartNumber() {
         return 9753;
    }

    @Override
    public String toString() {
        return "Street Sport Remote Control Car";
    }

}// End Class
