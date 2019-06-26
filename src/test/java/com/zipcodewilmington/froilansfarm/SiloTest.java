package com.zipcodewilmington.froilansfarm;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SiloTest {

    @Test
    public void getInstance() {
        Silo silo = new Silo();
        ArrayList<Edible> food = new ArrayList<>();
        food.add(Edible.EGG);
        food.add(Edible.EDAMAME);
        food.add(Edible.TOMATO);
        food.add(Edible.POTATO);
        food.add(Edible.OKRA);
        food.add(Edible.EARCORN);
        silo.add(Edible.EGG);
        silo.add(Edible.EDAMAME);
        silo.add(Edible.TOMATO);
        silo.add(Edible.POTATO);
        silo.add(Edible.OKRA);
        silo.add(Edible.EARCORN);
        Object actual = silo.getFood();
        Object expected = food;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        Silo silo = new Silo();
        ArrayList<Edible> food = new ArrayList<>();
        food.add(Edible.EGG);
        food.add(Edible.EDAMAME);
        food.add(Edible.TOMATO);
        food.add(Edible.POTATO);
        food.add(Edible.OKRA);
        silo.add(Edible.EGG);
        silo.add(Edible.EDAMAME);
        silo.add(Edible.TOMATO);
        silo.add(Edible.POTATO);
        silo.add(Edible.OKRA);
        silo.add(Edible.EARCORN);
        silo.remove(Edible.EARCORN);
        Object actual = silo.getFood();
        Object expected = food;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void add() {
        Silo silo = new Silo();
        ArrayList<Edible> food = new ArrayList<>();
        food.add(Edible.EGG);
        food.add(Edible.EDAMAME);
        food.add(Edible.TOMATO);
        food.add(Edible.POTATO);
        food.add(Edible.OKRA);
        food.add(Edible.EARCORN);
        silo.add(Edible.EGG);
        silo.add(Edible.EDAMAME);
        silo.add(Edible.TOMATO);
        silo.add(Edible.POTATO);
        silo.add(Edible.OKRA);
        silo.add(Edible.EARCORN);
        Object actual = silo.getFood();
        Object expected = food;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFood() {
        Silo silo = new Silo();
        ArrayList<Edible> food = new ArrayList<>();
        food.add(Edible.EGG);
        food.add(Edible.EDAMAME);
        food.add(Edible.TOMATO);
        food.add(Edible.POTATO);
        food.add(Edible.OKRA);
        food.add(Edible.EARCORN);
        silo.add(Edible.EGG);
        silo.add(Edible.EDAMAME);
        silo.add(Edible.TOMATO);
        silo.add(Edible.POTATO);
        silo.add(Edible.OKRA);
        silo.add(Edible.EARCORN);
        Object actual = silo.getFood();
        Object expected = food;
        Assert.assertEquals(expected,actual);
    }
}