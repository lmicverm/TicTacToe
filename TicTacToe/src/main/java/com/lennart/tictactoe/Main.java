/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lennart.tictactoe;

import com.lennart.tictactoe.Players.PlayerO;
import java.util.Scanner;

/**
 *
 * @author vermeirl
 */
public class Main {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the height of the playfield: ");
        int height = obj.nextInt();
        System.out.println("Enter the width of the playfield: ");
        int width = obj.nextInt();
        Game game = new Game(height, width);
        game.getBoard().drawBoard();
        game.getTurn();
        boolean winnerKnown = false;
        while(!winnerKnown){
            System.out.println("Enter x and y values, separated by a space to make the next move: ");
            int x = obj.nextInt();
            int y = obj.nextInt();
            boolean moveOK = game.makeMove(x, y);
            if (moveOK){
                winnerKnown = game.isEnded();
            }
        }
        game.printWinner();
    }
}
