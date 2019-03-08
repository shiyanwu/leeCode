package com.syw.leecode;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;

public class SolutionTwoNumTest {

    static final Logger LOG = LoggerFactory.getLogger(SolutionTwoNumTest.class);

    @Test
    public void test() {
        SolutionTwoNum sou = new SolutionTwoNum();
        int[] nums = {2, 7, 11, 15};
        int[] result = sou.twoSum(nums, 9);
        Collections.singletonList(result).forEach(i -> LOG.info("{}", i));
    }

    @Test
    public void test2() {
        SolutionTwoNum sou = new SolutionTwoNum();
        int[] nums = {2, 7, 11, 15};
        int[] result = sou.twoSum2(nums, 9);
        Collections.singletonList(result).forEach(i -> LOG.info("{}", i));
    }
}
