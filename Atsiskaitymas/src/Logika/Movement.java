/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

/**
 *
 * @author gaded
 */
public class Movement {
    private int [][] table;
    int aktyvus;
    int gameIsOver;

    public Movement(int[][] table, int aktyvus, int gameIsOver) {
        this.table = table;
        this.aktyvus = aktyvus;
        this.gameIsOver = gameIsOver;
    }

    public int[][] getTable() {
        return table;
    }

    public void setTable(int[][] table) {
        this.table = table;
    }

    public int getAktyvus() {
        return aktyvus;
    }

    public void setAktyvus(int aktyvus) {
        this.aktyvus = aktyvus;
    }

    public int getGameIsOver() {
        return gameIsOver;
    }

    public void setGameIsOver(int gameIsOver) {
        this.gameIsOver = gameIsOver;
    }

    
    
}
