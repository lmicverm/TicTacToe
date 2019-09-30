package com.lennart.tictactoe;

import com.lennart.tictactoe.Players.Player;
import com.lennart.tictactoe.Moves.Move;
import com.lennart.tictactoe.State.PlayerState;

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
    
    public boolean winningMove(Move move){
        return false;
    }
}
