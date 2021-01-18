package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class TravelerTest {

    Traveler traveler = new Traveler("Filmon","01AB3",3000.0);
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getName() {
        String expected = "Filmon";
        String actual = traveler.getName();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
    }

    @Test
    public void getPassPortNo() {
        String expected = "01AB3";
        String actual = traveler.getPassPortNo();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setPassPortNo() {
    }

    @Test
    public void getMoney() {
    Double expected = 2000.0;
    Double actual = traveler.getMoney(3000.0);
    }

    @Test
    public void setMoney() {

    }
}