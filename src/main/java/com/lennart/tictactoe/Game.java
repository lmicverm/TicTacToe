/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe;

import com.lennart.tictactoe.Moves.Move;
import com.lennart.tictactoe.Players.Player;
import com.lennart.tictactoe.Players.PlayerO;
import com.lennart.tictactoe.Players.PlayerX;
import com.lennart.tictactoe.State.PlayerOState;
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
    private Move lastMove = null;
    
    public Game(int height, int width){
        Board.init(height, width);
        board = Board.getInstance();
        playerO = new PlayerO();
        playerX = new PlayerX();
        state = new PlayerOState();
    }
    
    public void setState(PlayerState newState){
        this.state = newState;
    }
    
    public boolean makeMove(int x, int y){
        Game newGame = state.makeMove(x, y, this);
        state = newGame.getState();
        board = newGame.getBoard();
        if(newGame.getLastMove()==null){
            return false;
        }
        lastMove = newGame.getLastMove();
        return true;
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
    
    public void getTurn(){
        state.getTurn();
    }
    
    public boolean isEnded(){
        return board.winningMove(lastMove);
    }

    public Move getLastMove() {
        return lastMove;
    }

    public void setLastMove(Move lastMove) {
        this.lastMove = lastMove;
    }
    
    public void printWinner(){
        System.out.println("Player " + lastMove.getIndication() + " wins the game!");
    }

    public PlayerState getState() {
        return state;
    }
    
    
}
