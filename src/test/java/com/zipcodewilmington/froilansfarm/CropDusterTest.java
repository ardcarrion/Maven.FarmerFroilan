package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CropDusterTest {

    @Test
    public void makeNoise() {
        CropDuster cropDuster = new CropDuster();
        String actual = cropDuster.makeNoise();
        String expected = "PshhhPshhhPshhh";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getName() {
        CropDuster cropDuster = new CropDuster();
        String actual = cropDuster.getName();
        String expected = "crop duster";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setRider() {
        Froilanda rider = new Froilanda();
        CropDuster cd = new CropDuster();
        cd.setRider(rider);

    }

    @Test
    public void removeRider() {
        Froilanda rider = new Froilanda();
        CropDuster cd = new CropDuster();
        cd.setRider(rider);
        cd.removeRider();
    }

    @Test
    public void fertilize() {
        Froilanda rider = new Froilanda();
        CropDuster cd = new CropDuster();
        cd.setRider(rider);
        cd.fertilize();
    }

    @Test
    public void fly() {
        Froilanda rider = new Froilanda();
        CropDuster cd = new CropDuster();
        cd.setRider(rider);
        String actual = cd.fly();
        String expected = "Setting off into the air";
    }
}