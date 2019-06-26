package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {

    public TomatoPlant() {
        super(false, false);
    }

    public Edible yield() {
        if (this.getReadyForHarvest()) {
            this.setHasBeenFertilized(false);
            this.setReadyForHarvest(false);
            return Edible.TOMATO;
        } return null;
    }

    @Override
    public String getName() {
        return "tomato";
    }
}
