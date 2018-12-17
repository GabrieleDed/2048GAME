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
public class GameOver {
    public void isGameOver (int [][]table, int gameIsOver){
      for (int i = 0; i < 4; i++){
          for (int j = 0; j < 4; j++){   
            if (i==3&&j==3&&table[i][j]!=0){
              gameIsOver=1;
          System.out.println("Game over");
            }
            if (table[i][j]==0){
              i=3;
              j=3;
              gameIsOver=0;
            }
          }
         }
        
};
}
