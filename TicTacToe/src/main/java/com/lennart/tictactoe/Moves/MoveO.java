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
public class MoveO implements Move{
    private final Coordinate coordinate;
    private final String indicationCharacter;
    
    public MoveO(int x, int y){
        coordinate = new Coordinate(x, y);
        indicationCharacter = "O";
    }

    @Override
    public String getIndication() {
        return indicationCharacter;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String toString() {
        return "MoveO{" + "coordinate=" + coordinate + ", indicationCharacter=" + indicationCharacter + '}';
    }
    
    
}
