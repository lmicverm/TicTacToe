/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe.Moves;

import com.lennart.tictactoe.Utils.Coordinate;

/**
 *
 * @author vermeirl
 */
public interface Move {
    public String getIndication();
    public Coordinate getCoordinate();
}
