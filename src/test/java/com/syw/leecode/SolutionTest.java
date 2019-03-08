package com.syw.leecode;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SolutionTest {

    static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);

    @Test
    public void test() {
        Solution sou = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] result = sou.twoSum(nums, 9);
        for (int i : result) {
            LOG.info("{}", i);
        }
    }
}
