package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmHouseTest {

    @Test
    public void remove() {
        FarmHouse.getInstance().add(Froilan.getInstance());
        FarmHouse.getInstance().remove(Froilan.getInstance());
        Assert.assertNotNull(FarmHouse.getInstance().getInhabitants());
        Assert.assertEquals(0, FarmHouse.getInstance().getInhabitants().size());
    }

    @Test
    public void add() {
        FarmHouse.getInstance().add(Froilan.getInstance());
        FarmHouse.getInstance().add(Froilanda.getInstance());
        Assert.assertNotNull(FarmHouse.getInstance().getInhabitants());
        Assert.assertEquals(2, FarmHouse.getInstance().getInhabitants().size());
    }
}