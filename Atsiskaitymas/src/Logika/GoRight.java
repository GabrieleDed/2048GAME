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
public class GoRight extends AddNumbers{
    public void goingRight (int [][]table, int aktyvus){
        AddNumbers num = new AddNumbers();
        int number =0;
      for (int i = 3; i >= 0; i--){
            for (int j = 3; j >0; j--){
              if (table[i][j]==0&&table[i][j-1]>0){
                table[i][j]=table[i][j-1];
                table[i][j-1]=0;
                aktyvus = 1;
              }
              if (table[i][j]==table[i][j-1]&&table[i][j]>0&&table[i][j-1]>0){
                table[i][j]=table[i][j-1]*2;
                table[i][j-1]=0;
                aktyvus = 1;
              }   
            }
          }
          for (int i = 0; i <= 3; i++){
            for (int j = 0; j < 3; j++){
              if (table[i][j+1]==0&&table[i][j]>0){
                table[i][j+1]=table[i][j];
                table[i][j]=0;
                aktyvus = 1;
              }
              if (table[i][j+1]==table[i][j]&&table[i][j+1]>0){
                  number=table[i][j+1];
                table[i][j+1]=num.AddNumber(number);
                table[i][j]=0;
              }
            }
          }
          
};
}
