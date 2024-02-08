package ru.netology.service;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    @Test
    public void testCorrectAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 700;

        int actual = service.remain(amount);
        int expected = 300;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReturnZeroIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testReturn1000IfAmountIsZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected, actual);
    }
}