package com.zipcodewilmington.froilansfarm;

public class OkraPlant extends Crop {

    public OkraPlant() {
        super(false, false);
    }

    public Edible yield() {
            if (this.getReadyForHarvest()) {
                this.setHasBeenFertilized(false);
                this.setReadyForHarvest(false);
                return Edible.OKRA;
            } else {return null;}
        }

    @Override
    public String getName() {
        return "okra";
    }
}
