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
public class PlayerXState implements PlayerState{

    @Override
    public Game makeMove(int x, int y, Game game) {
        Move[][] board = game.getBoard().getBoard();
        if(board[y][x]==null){
            Move newMove = game.getPlayerX().createMove(x, y);
            board[y][x] = newMove;
            game.getBoard().setBoard(board);
            game.setState(new PlayerOState());
            game.setLastMove(newMove);
        } else {
            System.out.printf("Board at position " + board[y][x].getCoordinate() + " is already taken by " + board[y][x] + ". Try again.");
        }
        return game;
    }

    @Override
    public void getTurn() {
        System.out.println("Player X can make the next move.");
    }
    
}
