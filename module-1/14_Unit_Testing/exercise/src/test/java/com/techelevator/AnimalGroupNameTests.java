package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {

    AnimalGroupName tests = new AnimalGroupName();

    //Testing each animal
    @Test
    public void test_rhino_method() {
        Assert.assertEquals("Rhino should return 'Crash'", "Crash", tests.getHerd("Rhino"));
    }

    @Test
    public void test_giraffe_method() {
        Assert.assertEquals("Giraffe should return Tower", "Tower", tests.getHerd("Giraffe"));
    }

    @Test
    public void test_elephant_method() {
        Assert.assertEquals("Elephant should return Herd", "Herd", tests.getHerd("Elephant"));
    }

    @Test
    public void test_lion_method() {
        Assert.assertEquals("Lion should return Pride", "Pride", tests.getHerd("Lion"));
    }

    @Test
    public void test_crow_method() {
        Assert.assertEquals("Crow should return Murder", "Murder", tests.getHerd("Crow"));
    }

    @Test
    public void test_pigeon_method() {
        Assert.assertEquals("Pigeon should return Kit", "Kit", tests.getHerd("Pigeon"));
    }

    @Test
    public void test_flamingo_method() {
        Assert.assertEquals("Flamingo should return Pat", "Pat", tests.getHerd("Flamingo"));
    }

    @Test
    public void test_deer_method() {
        Assert.assertEquals("Deer should return Herd", "Herd", tests.getHerd("Deer"));
    }

    @Test
    public void test_dog_method() {
        Assert.assertEquals("Dog should return Pack", "Pack", tests.getHerd("Dog"));
    }

    @Test
    public void test_crocodile_method() {
        Assert.assertEquals("Crocodile should return Float", "Float", tests.getHerd("Crocodile"));
    }

    @Test
    public void test_for_unknown() {
        Assert.assertEquals("String entered is not correct", "unknown", tests.getHerd("Unicorn"));
    }

    @Test
    public void test_for_null() {
        Assert.assertEquals("String entered is not correct", "unknown", tests.getHerd(null));

    }


}
