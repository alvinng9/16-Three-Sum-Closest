package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void threeSumClosestTest() {
        Solution solution = new Solution();
        assertEquals(2, solution.threeSumClosest(new int[]{-1,2,1,-4},1));
        assertEquals(0, solution.threeSumClosest(new int[]{0,0,0},1));
    }

}