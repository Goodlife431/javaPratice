package chapter7;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.AssertJUnit.assertEquals;

class DataStructureTest {
    @Test
    public void addItemListSizeIncreased(){
        ArrayList newArray = new ArrayList<>();
        newArray.add("Guitar");
        newArray.add("piano");
        assertEquals(2,newArray.size());
    }

}