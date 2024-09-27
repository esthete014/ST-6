package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    // Тест установки символа игрока
    @Test
    public void testPlayerSymbol() {
        Player player = new Player();
        player.symbol = 'X';
        assertEquals('X', player.symbol);
    }

    // Тест установки шага игрока
    @Test
    public void testPlayerMove() {
        Player player = new Player();
        player.move = 5;
        assertEquals(5, player.move);
    }

    // Тест установки статуса выигрыша игрока
    @Test
    public void testPlayerWin() {
        Player player = new Player();
        player.win = true;
        assertTrue(player.win);
    }

    // Тест выбора игрока
    @Test
    public void testPlayerSelected() {
        Player player = new Player();
        player.selected = true;
        assertTrue(player.selected);
    }
}