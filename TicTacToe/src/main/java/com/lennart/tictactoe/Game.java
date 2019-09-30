/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe;

import com.lennart.tictactoe.Players.Player;
import com.lennart.tictactoe.Players.PlayerO;
import com.lennart.tictactoe.Players.PlayerX;
import com.lennart.tictactoe.State.PlayerState;

/**
 *
 * @author vermeirl
 */
public class Game {
    private Player playerX;
    private Player playerO;
    private Board board;
    private PlayerState state;
    
    public Game(int height, int width){
        Board.init(height, width);
        board = Board.getInstance();
        playerO = new PlayerO();
        playerX = new PlayerX();
    }
    
    public void setState(PlayerState newState){
        this.state = newState;
    }
    
    public void makeMove(int x, int y){
        state.makeMove(x, y, this);
    }

    public Player getPlayerX() {
        return playerX;
    }

    public Player getPlayerO() {
        return playerO;
    }

    public Board getBoard() {
        return board;
    }
}
