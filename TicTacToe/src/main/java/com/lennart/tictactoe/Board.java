package com.lennart.tictactoe;

import com.lennart.tictactoe.Moves.Move;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author vermeirl
 */
public class Board {

    private final int height;
    private final int width;
    private Move[][] board;
    private static Board boardInstance = null;
    private String upperline;
    private String numberIndication;

    private Board(int height, int width) {
        this.height = height;
        this.width = width;
        board = new Move[height][width];
        upperline = "  ";
        numberIndication = "  ";
        for (int j = 0; j < width; j++) {
            upperline += "+---";
            numberIndication += "  " + j + " ";
        }
        upperline += "+";
    }

    public static Board getInstance() {
        if (boardInstance == null) {
            throw new AssertionError("Please first call init");
        }
        return boardInstance;

    }

    public synchronized static Board init(int height, int width) {
        if (boardInstance != null) {
            throw new AssertionError("You have already initialized the board");
        }
        boardInstance = new Board(height, width);
        return boardInstance;
    }

    public void drawBoard() {
        System.out.println("Current board: ");
        System.out.println("");
        System.out.print(numberIndication);
        System.out.println("");
        for (int i = 0; i < height; i++) {
            System.out.print(upperline);
            System.out.println("");
            System.out.printf("%d ", i);
            for (int j = 0; j < width; j++) {
                System.out.printf("| %s ", board[i][j] == null ? " " : board[i][j].getIndication());
            }
            System.out.println("|");
        }
        System.out.println(upperline);
    }

    public Move[][] getBoard() {
        return board;
    }

    public void setBoard(Move[][] board) {
        this.board = board;
    }

    public boolean winningMove(Move move) {
        int x = move.getCoordinate().getX();
        int y = move.getCoordinate().getY();
        String winningString = move.getIndication() + move.getIndication() + move.getIndication();
        String[] temp = new String[12];
        Arrays.fill(temp, "");
        for (int i = 0; i < 3; i++) {
            if (x + i < 0 || y + i < 0 || x + i >= width || y + i >= height || board[y + i][x + i] == null) {
                temp[0] += " ";
            } else {
                temp[0] += board[y + i][x + i].getIndication();
            }
            if (x - i < 0 || y - i < 0 || x - i >= width || y - i >= height || board[y - i][x - i] == null) {
                temp[1] += " ";
            } else {
                temp[1] += board[y - i][x - i].getIndication();
            }
            if (x + i < 0 || y - i < 0 || x + i >= width || y - i >= height || board[y - i][x + i] == null) {
                temp[2] += " ";
            } else {
                temp[2] += board[y - i][x + i].getIndication();
            }
            if (x - i < 0 || y + i < 0 || x - i >= width || y + i >= height || board[y + i][x - i] == null) {
                temp[3] += " ";
            } else {
                temp[3] += board[y + i][x - i].getIndication();
            }
            if (y + i < 0 || y + i >= height || board[y + i][x] == null) {
                temp[4] += " ";
            } else {
                temp[4] += board[y + i][x].getIndication();
            }
            if (y - i < 0 || y - i >= height || board[y - i][x] == null) {
                temp[5] += " ";
            } else {
                temp[5] += board[y - i][x].getIndication();
            }
            if (x + i < 0 || x + i >= width || board[y][x + i] == null) {
                temp[6] += " ";
            } else {
                temp[6] += board[y][x + i].getIndication();
            }
            if (x - i < 0 || x - i >= width || board[y][x - i] == null) {
                temp[7] += " ";
            } else {
                temp[7] += board[y][x - i].getIndication();
            }
        }
        for (int i = -1; i < 2; i++) {
            if (x + i < 0 || y + i < 0 || x + i >= width || y + i >= height || board[y + i][x + i] == null) {
                temp[8] += " ";
            } else {
                temp[8] += board[y + i][x + i].getIndication();
            }
            if (x - i < 0 || y + i < 0 || x - i >= width || y + i >= height || board[y + i][x - i] == null) {
                temp[9] += " ";
            } else {
                temp[9] += board[y + i][x - i].getIndication();
            }
            if (y + i < 0 || y + i >= height || board[y + i][x] == null) {
                temp[10] += " ";
            } else {
                temp[10] += board[y + i][x].getIndication();
            }
            if (x + i < 0 || x + i >= width || board[y][x + i] == null) {
                temp[11] += " ";
            } else {
                temp[11] += board[y][x + i].getIndication();
            }
        }
        for (String t : temp) {
            if (t.equals(winningString)) {
                return true;
            }
        }
        return false;
    }
}
