/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.Players;

import com.lennart.tictactoe.Moves.Move;
import com.lennart.tictactoe.Moves.MoveFactory;
import com.lennart.tictactoe.Moves.MoveXFactory;

/**
 *
 * @author vermeirl
 */
public class PlayerX implements Player{
    private final MoveFactory moveFactory;
    
    public PlayerX(){
        moveFactory = MoveXFactory.getInstance();
    }
    
    public Move createMove(int x, int y){
        return moveFactory.makeMove(x, y);
    }
}
