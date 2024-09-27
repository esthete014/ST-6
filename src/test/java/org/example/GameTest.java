package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class GameTest {

    // Проверка выигрыша ноликов
    @Test
    public void testCheckStateOWin1() {
        Game game = new Game();
        char[] board = {'X', 'X', 'X', ' ', ' ', ' ', ' ', ' ', ' '};
        game.symbol = 'X';
        assertEquals(State.XWIN, game.checkState(board));
    }

    // Проверка выигрыша ноликов
    @Test
    public void testCheckStateOWin2() {
        Game game = new Game();
        char[] board = {' ', ' ', ' ', 'O', 'O', 'O', ' ', ' ', ' '};
        game.symbol = 'O';
        assertEquals(State.OWIN, game.checkState(board));
    }

    // Проверка выигрыша ноликов
    @Test
    public void testCheckStateOWin3() {
        Game game = new Game();
        char[] board = {' ', ' ', ' ', ' ', ' ', ' ', 'O', 'O', 'O'};
        game.symbol = 'O';
        assertEquals(State.OWIN, game.checkState(board));
    }

    // Проверка ничьи
    @Test
    public void testCheckStateDraw() {
        Game game = new Game();
        char[] board = {'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X'};
        assertEquals(State.DRAW, game.checkState(board));
    }

    // Проверка продолжающейся игры
    @Test
    public void testCheckStatePlaying() {
        Game game = new Game();
        char[] board = {'X', 'O', 'X', ' ', ' ', ' ', ' ', ' ', ' '};
        assertEquals(State.PLAYING, game.checkState(board));
    }

    // Тест на генерацию возможных ходов
    @Test
    public void testGenerateMoves() {
        Game game = new Game();
        char[] board = {'X', 'O', 'X', ' ', ' ', ' ', ' ', 'O', 'X'};
        ArrayList<Integer> moves = new ArrayList<>();
        game.generateMoves(board, moves);
        assertEquals(4, moves.size());
        assertTrue(moves.contains(3));
        assertTrue(moves.contains(4));
        assertTrue(moves.contains(5));
    }

    @Test
    public void testEvaluatePositionDraw() {
        Game game = new Game();
        Player player = new Player();
        player.symbol = 'X';
        char[] board = {'X', 'O', 'X', 'X', 'O', 'O', 'O', 'X', 'X'};
        assertEquals(0, game.evaluatePosition(board, player));
    }

    @Test
    public void testEvaluatePositionPlaying() {
        Game game = new Game();
        Player player = new Player();
        player.symbol = 'X';
        char[] board = {'X', 'O', 'X', ' ', ' ', ' ', ' ', 'O', 'X'};
        assertEquals(-1, game.evaluatePosition(board, player));
    }

    // Тест на работу MiniMax алгоритма
    @Test
    public void testMiniMaxBestMove() {
        Game game = new Game();
        Player player = new Player();
        player.symbol = 'O';
        char[] board = {'X', 'O', 'X', 'O', ' ', ' ', ' ', 'X', ' '};
        int move = game.MiniMax(board, player);
        assertEquals(5, move); // Ожидаемый ход, чтобы заблокировать победу 'X'
    }

    // Тест на минимальный ход
    @Test
    public void testMinMove() {
        Game game = new Game();
        Player player = new Player();
        player.symbol = 'O';
        char[] board = {'X', 'O', 'X', ' ', ' ', ' ', ' ', 'X', ' '};
        int move = game.MinMove(board, player);
        assertNotEquals(Game.INF, move); // Ожидается, что ход не даст моментальной победы
    }

    // Тест на изменение текущего игрока
    @Test
    public void testSwitchPlayer() {
        Game game = new Game();
        game.cplayer = game.player1;
        assertEquals('X', game.cplayer.symbol);
        game.cplayer = game.player2;
        assertEquals('O', game.cplayer.symbol);
    }
}
