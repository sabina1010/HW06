package com.company.test;

import com.company.Family;
import com.company.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FamilyTest {
    private final Human mother = new Human();
    private final Human father= new Human();
    private final Family family=new Family(mother,father);
    private final Human child= new Human();
    @Test
    void testAddChild(){
        family.addChild(child);
        assertEquals(1, family.getChildren().length);
    }

    @Test
    void testDeleteChild(){
        family.addChild(child);
        family.deleteChild(0);
        assertEquals(0, family.getChildren().length);

    }
    @Test
    void testCountFamily(){
    family.addChild(child);
    assertEquals(3, family.countFamily());
    }
    @Test
    void fakeTestDeleteChild(){
        family.addChild(child);
        family.deleteChild(1);
        assertNotEquals(0,family.getChildren().length);
    }
}