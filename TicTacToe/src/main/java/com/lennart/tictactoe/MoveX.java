/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe;

/**
 *
 * @author vermeirl
 */
public class MoveX implements Move{
    private final Coordinate coordinate;
    private final String indicationCharacter;
    
    public MoveX(int x, int y){
        coordinate = new Coordinate(x, y);
        indicationCharacter = "X";
    }
    
    @Override
    public void draw() {
        System.out.print("X");
    }

    @Override
    public String getIndication() {
        return indicationCharacter;
    }
    
    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }
}