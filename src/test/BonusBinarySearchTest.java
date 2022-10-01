package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BonusBinarySearchTest {


    @Test
    public void firstTestPass() {
        assertEquals(BonusBinarySearch.binarySearch(new int[]{1, 2, 3, 4, 5, 6}, 6),5,0.01);

    }
    @Test
    public void secondTestFail() {
        assertEquals(BonusBinarySearch.binarySearch(new int[]{1,2,4,6,78},5),-1,0.01);
    }
}
