/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.State;

import com.lennart.tictactoe.Game;
import com.lennart.tictactoe.Moves.Move;

/**
 *
 * @author vermeirl
 */
public class PlayerOState implements PlayerState{

    @Override
    public boolean makeMove(int x, int y, Game game) {
        Move[][] board = game.getBoard().getBoard();
        if(board[x][y]==null){
            Move newMove = game.getPlayerO().createMove(x, y);
            board[x][y] = newMove;
            game.getBoard().setBoard(board);
            game.setState(new PlayerXState());
            game.setLastMove(newMove);
            return true;
        } else {
            System.out.printf("Board at position " + board[x][y].getCoordinate() + " is already taken by " + board[x][y] + ". Try again.");
            return false;
        }
    }

    @Override
    public void getTurn() {
        System.out.println("Player O can make the next move");
    }
    
}
