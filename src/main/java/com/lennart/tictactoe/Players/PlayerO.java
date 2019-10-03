/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.Players;

import com.lennart.tictactoe.Moves.Move;
import com.lennart.tictactoe.Moves.MoveFactory;
import com.lennart.tictactoe.Moves.MoveOFactory;

/**
 *
 * @author vermeirl
 */
public class PlayerO implements Player{
    private final MoveFactory moveFactory;
    
    public PlayerO(){
        moveFactory = MoveOFactory.getInstance();
    }
    
    public Move createMove(int x, int y){
        return moveFactory.makeMove(x, y);
    }
}
