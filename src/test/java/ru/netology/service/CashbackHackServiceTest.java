package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowIfUnder1000() {
        int amount = 890;

        int actual = service.remain(amount);
        int expected = 110;

        assertEquals(expected, actual);
    }

    @Test
   public void shouldShowIfOver1000() {
        int amount = 1733;

        int actual = service.remain(amount);
        int expected = 267;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldShowIfEqual1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }


}