/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.Moves;

/**
 *
 * @author vermeirl
 */
public interface MoveFactory {
    public Move makeMove(int x, int y);
}
