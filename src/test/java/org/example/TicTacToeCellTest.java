package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeCellTest {

    // Тест на создание ячейки и проверку номера ячейки
    @Test
    public void testTicTacToeCellNumber() {
        TicTacToeCell cell = new TicTacToeCell(0, 0, 0);
        assertEquals(0, cell.getNum());
    }

    // Тест установки и получения маркера ячейки
    @Test
    public void testSetMarker() {
        TicTacToeCell cell = new TicTacToeCell(1, 0, 0);
        cell.setMarker("X");
        assertEquals('X', cell.getMarker());
    }

    // Тест на текстовое представление маркера в ячейке
    @Test
    public void testSetText() {
        TicTacToeCell cell = new TicTacToeCell(0, 0, 0);
        cell.setMarker("O");
        assertEquals("O", cell.getText());
    }
}
