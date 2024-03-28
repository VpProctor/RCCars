package com.rccars.model.base;

import com.rccars.model.impl.forSale;

import java.math.BigDecimal;

public abstract class AbstractRC implements forSale {

    // variables
    private ShellFrame Type;
    private String serialNumber;

    // constructor
    public AbstractRC(ShellFrame Type) {this.Type = Type;
    }


    //Arrange Abstract Methods
    public abstract BigDecimal getSaleValue();
    public abstract String getPrefix();
    public abstract String getWheelType();
    public abstract int getStartNumber();

    //methods
    public void paintFrame(ShellFrame Type) {
        this.Type = Type;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {return serialNumber; }

    public ShellFrame getColor() {return Type;}

    public BigDecimal getOptionAmount(){
        return BigDecimal.valueOf(0.0);
    }

    public String getOptionName(){
        return "";
    }

} // End Class
