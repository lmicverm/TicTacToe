/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.State;

import com.lennart.tictactoe.Game;

/**
 *
 * @author vermeirl
 */
public interface PlayerState {
    public void makeMove(int x, int y, Game game);
}
