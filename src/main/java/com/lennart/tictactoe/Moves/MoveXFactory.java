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
public class MoveXFactory implements MoveFactory {

    private MoveXFactory() {
    }

    @Override
    public Move makeMove(int x, int y) {
        return new MoveX(x, y);
    }

    public static MoveFactory getInstance() {
        return MoveXFactoryHolder.INSTANCE;
    }

    private static class MoveXFactoryHolder {
        private static final MoveFactory INSTANCE = new MoveXFactory();
    }

}
