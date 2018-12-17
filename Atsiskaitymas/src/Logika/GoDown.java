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
public class GoDown extends AddNumbers{
    public void goingDown (int [][]table, int aktyvus){
        AddNumbers num = new AddNumbers();
        int number =0;
        
     for (int i = 3; i>0; i--){
         
            for (int j = 3; j >= 0; j--){
              if (table[i][j]==0&&table[i-1][j]>0){
                table[i][j]=table[i-1][j];
                table[i-1][j]=0;
                aktyvus = 1;
              }
              if (table[i][j]==table[i-1][j]&&table[i][j]>0&&table[i-1][j]>0){
                table[i][j]=table[i-1][j]*2;
                table[i-1][j]=0;
                aktyvus = 1;
              }       
            }
          }
          for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 3; j++){
              if (table[i+1][j]==0&&table[i][j]>0){
                table[i+1][j]=table[i][j];
                table[i][j]=0;
                aktyvus = 1;
              }
              if (table[i+1][j]==table[i][j]&&table[i+1][j]>0){
                  
                  number=table[i+1][j];
                  
                  table[i+1][j]=num.AddNumber(number);
                  table[i][j]=0;
                
              }
            }
          
}
};
}
