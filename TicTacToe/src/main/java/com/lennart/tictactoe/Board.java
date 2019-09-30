package com.lennart.tictactoe;

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

    private int height;
    private int width;
    private Player playerX;
    private Player playerO;
    private Move[] board;

    private Board(){};

    public Board getInstance() {
        return BoardHolder.INSTANCE;

    }
    
    private static class BoardHolder {
        private static final Board INSTANCE = new Board();
    }
    
    public void drawBoard(){
        System.out.println("Not implemented yet");
    }
}
