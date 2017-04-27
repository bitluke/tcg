package com.bfs;


import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppTest {

    @Test
    public void testAsArrays(){
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        List<int[]> asList = Arrays.asList(numbers);
        Assert.assertTrue(asList.size() == 1);
    }

    @Test
    public void testAsArraysWithProperContent(){
        Integer[] numbers = {0,1,2,3,4,5,6,7,8,9};
        List<Integer> collect = Arrays.stream(numbers).collect(Collectors.toList());

        Assert.assertThat(collect.size(),CoreMatchers.is(10));
    }
}
