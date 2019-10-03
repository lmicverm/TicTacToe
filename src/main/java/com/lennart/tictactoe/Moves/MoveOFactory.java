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
public class MoveOFactory implements MoveFactory{

    
    private MoveOFactory() {
    }

    @Override
    public Move makeMove(int x, int y) {
        return new MoveO(x, y);
    }

    public static MoveFactory getInstance() {
        return MoveOFactoryHolder.INSTANCE;
    }
    
    private static class MoveOFactoryHolder{
        private static final MoveOFactory INSTANCE = new MoveOFactory();
    }
}
