package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {

    @Test
    public void makeNoise() {
        Tractor tractor = new Tractor();
        String actual = tractor.makeNoise();
        String expected = "Purrrrrrr";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getName() {
        Tractor tractor = new Tractor();
        String actual = tractor.getName();
        String expected = "Tractor";

        Assert.assertEquals(expected, actual);
    }

   @Test
    public void setRider(){
       Tractor tractor = new Tractor();
       Rider rider = Froilan.getInstance();

       tractor.setRider(rider);
       Rider expected = rider;
       Rider actual = tractor.getRider();

       Assert.assertEquals(expected, actual);
   }

   @Test
    public void getRider(){
       Tractor tractor = new Tractor();
       Rider rider = Froilan.getInstance();

       tractor.setRider(rider);
       Rider expected = rider;
       Rider actual =  tractor.getRider();


       Assert.assertEquals(expected, actual);
   }

   @Test
    public void removeRider(){
       Tractor tractor = new Tractor();
       Rider rider = Froilan.getInstance();

       tractor.setRider(rider);
       tractor.removeRider();

       Rider expected = null;
       Rider actual =  tractor.getRider();

       Assert.assertEquals(expected, actual);
   }

    @Test
    public void getINSTANCE() {
        Tractor tractor = new Tractor();
        Rider rider = Froilan.getInstance();
        rider.mount(tractor);
        Rider actual = tractor.getRider();
        Rider expected = rider;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void harvest() {
        Tractor tractor = new Tractor();
        Rider rider = Froilan.getInstance();
        Crop crop = new CornStalk();
        Tractor.getINSTANCE().harvest(crop);
        Assert.assertFalse(crop.readyForHarvest);
    }
}