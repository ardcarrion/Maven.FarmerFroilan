package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

public class CropRowTest {

    @Test
    public void removeCropsTest1() {
        CropRow<SoyPlant> soy = new CropRow<>();
        soy.addCrop(new SoyPlant());
        soy.removeCrops();
        Assert.assertEquals(soy.getCropRow().size(), 0);
    }

    @Test
    public void removeCropsTest2() {
        CropRow<CornStalk> corn = new CropRow<>();
        corn.addCrop(new CornStalk());
        corn.addCrop(new CornStalk());
        corn.addCrop(new CornStalk());
        corn.removeCrops();
        Assert.assertEquals(corn.getCropRow().size(), 0);
    }

    @Test
    public void fertilizeCropTest1() {
        CropRow<CornStalk> corn = new CropRow<>();
        corn.addCrop(new CornStalk());
        corn.addCrop(new CornStalk());
        corn.addCrop(new CornStalk());
        corn.fertilizeCrops();
        for (Crop crop: corn.getCropRow()) Assert.assertTrue(crop.hasBeenFertilized);
    }

}