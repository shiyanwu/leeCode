package com.syw.leecode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

public class SolutionTest {

    static final Logger LOG = LoggerFactory.getLogger(SolutionTest.class);

    @Test
    public void test() {
        Solution sou = new Solution();
        int[] nums = {2, 7, 11, 15};
        int[] result = sou.twoSum(nums, 9);
        Collections.singletonList(result).forEach(i -> LOG.info("{}", i));

    }
}
