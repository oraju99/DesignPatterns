package com.example.tiktactoe;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.List;

public class Board {
    int size;
    PlayingPiece[][] board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece piece) {
        if (board[row][column] != null) {
            return false;
        } else {
            board[row][column] = piece;
            return true;
        }
    }

    // TODO complete this method
//    public List<Pair<Integer, Integer>> getFreeCells() {
//        List< Pair<Integer, Integer> > freeCells = new ArrayList<>();
//        for (int i=0;i<size;i++) {
//            for(int j=0;j<size;j++) {
//                if (board[i][j] == null) {
//                    Pair<Integer, Integer> rowColumn = new Pair<>(i, j);
//                    freeCells.add()
//                }
//            }
//        }
//    }

    public void printBoard() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] != null) {
                    System.out.print(board[i][j].pieceType.name() + "   ");
                } else {
                    System.out.print("    ");

                }
                System.out.print(" | ");
            }
            System.out.println();

        }
    }

}
