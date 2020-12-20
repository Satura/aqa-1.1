package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(100), 900);
    }

    @Test
    public void shouldRemain300() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(700), 300);
    }

    @Test
    public void shouldRemain0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}