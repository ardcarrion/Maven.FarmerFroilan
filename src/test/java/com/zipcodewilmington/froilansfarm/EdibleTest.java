package com.zipcodewilmington.froilansfarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class EdibleTest {

    @Test
    public void toString1() {
        Edible food = Edible.EARCORN;
        assertEquals("ear of corn", food.toString());
        food = Edible.EGG;
        assertEquals("egg", food.toString());
        food = Edible.POTATO;
        assertEquals("potato", food.toString());
        food = Edible.EDAMAME;
        assertEquals("edamame", food.toString());
    }
}