package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    void shouldShowIfUnder1000() {
        int amount = 890;

        int actual = service.remain(amount);
        int expected = 110;

        assertEquals(actual, expected);
    }

    @Test
    void shouldShowIfOver1000() {
        int amount = 1733;

        int actual = service.remain(amount);
        int expected = 267;

        assertEquals(actual, expected);
    }

    @Test
    void shouldShowIfEqual1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


}