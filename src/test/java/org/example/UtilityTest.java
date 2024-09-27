package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class UtilityTest {

    // Тест на печать массива символов (имитация вывода в консоль)
    @Test
    public void testPrintCharArray() {
        char[] board = {'X', 'O', 'X', 'O', 'X', 'O', 'X', 'O', 'X'};
        Utility.print(board);
    }

    // Тест на печать массива целых чисел
    @Test
    public void testPrintIntArray() {
        int[] board = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Utility.print(board);
    }

    // Тест на печать списка возможных ходов
    @Test
    public void testPrintMoveList() {
        ArrayList<Integer> moves = new ArrayList<>();
        moves.add(1);
        moves.add(2);
        moves.add(3);
        Utility.print(moves);
        // Проверка аналогично предыдущим тестам
    }
}
