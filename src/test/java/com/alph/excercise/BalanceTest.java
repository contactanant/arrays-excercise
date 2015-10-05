package com.alph.excercise;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by alpha on 05/10/2015.
 */
public class BalanceTest {

    Balance balance = new Balance();

    @Test
    public void testCanBalance() throws Exception {

        assertThat(balance.canBalance(new int[]{1, 1, 1, 2, 1}), is(true));
        assertThat(balance.canBalance(new int[]{2, 1, 1, 2, 1}), is(false));
        assertThat(balance.canBalance(new int[]{10, 10}), is(true));

    }
}