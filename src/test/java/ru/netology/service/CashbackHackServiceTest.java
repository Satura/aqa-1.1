package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain900() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(900, service.remain(100));
    }

    @Test
    public void shouldRemain300() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(300, service.remain(700));
    }

    @Test
    public void shouldRemain0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }
}