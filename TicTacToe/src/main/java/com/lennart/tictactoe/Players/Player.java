package com.lennart.tictactoe.Players;

import com.lennart.tictactoe.Moves.Move;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vermeirl
 */
public interface Player {
    public Move createMove(int x, int y);
}
