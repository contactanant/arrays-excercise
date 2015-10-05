package com.alph.excercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by alpha on 19/09/2015.
 */
public class MaxSpanTest {

    MaxSpan maxSpan = new MaxSpan();

    @Test
    public void testMaxSpan() throws Exception {

        assertThat(maxSpan.calculate(null), is(0));
        assertThat(maxSpan.calculate(new int[]{}), is(0));
        assertThat(maxSpan.calculate(new int[]{1}), is(1));
        assertThat(maxSpan.calculate(new int[]{1, 2, 1, 1, 3}), is(4));
        assertThat(maxSpan.calculate(new int[]{1, 4, 2, 1, 4, 1, 4}), is(6));
        assertThat(maxSpan.calculate(new int[]{1, 4, 2, 1, 4, 4, 4}), is(6));
    }
}