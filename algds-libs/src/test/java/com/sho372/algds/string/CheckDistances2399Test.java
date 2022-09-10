package com.sho372.algds.string;

import com.sho372.algds.leetcode.CheckDistances2399;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckDistances2399Test {

    @Test public void testCase1() {
        CheckDistances2399 cd = new CheckDistances2399();
        boolean got = cd.checkDistance("abaccb", new int[]{1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertTrue(got);
    }

    @Test public void testCase2() {
        CheckDistances2399 cd = new CheckDistances2399();
        boolean got = cd.checkDistance("aa", new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
        assertFalse(got);
    }

}
