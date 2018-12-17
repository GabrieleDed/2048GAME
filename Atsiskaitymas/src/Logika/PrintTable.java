/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Random;

public class PrintTable {
    private int [][] lentele;
    
    private int height;
    private int length;
    private int randomplace;

    public PrintTable(int[][] lentele, int height, int length, int randomplace) {
        this.lentele = lentele;
        this.height = height;
        this.length = length;
        this.randomplace = randomplace;
    }

    public int[][] getLentele() {
        return lentele;
    }

    public void setLentele(int[][] lentele) {
        this.lentele = lentele;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getRandomplace() {
        return randomplace;
    }

    public void setRandomplace(int randomplace) {
        this.randomplace = randomplace;
    }

   
    
    
}
