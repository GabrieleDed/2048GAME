/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logika;

import java.util.Random;

public class RandomPlace {
    public void findaRandomPlace (int [][]table, int aktyvus){
        Random rand = new Random();
        int nauja_vieta_rasta=0;
        int n = 0, x =0, y=0;
        if ( aktyvus == 1){
            while (nauja_vieta_rasta==0){
               n = rand.nextInt(15) + 1;
                y=n/4;
                x=n%4; 
              if (table [y][x] ==0){
                table [y][x] =2; 
                nauja_vieta_rasta=1;
              } 
            }
          nauja_vieta_rasta=0;
          }
          aktyvus = 0;
    };
}
