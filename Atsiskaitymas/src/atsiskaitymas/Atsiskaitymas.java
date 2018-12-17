
package atsiskaitymas;

import java.util.Random;
import java.util.Scanner;
import Logika.*;

public class Atsiskaitymas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreateTable ctable = new CreateTable();
        Gameplay gam = new Gameplay();
        GoLeft gleft = new GoLeft();
        GoRight gright = new GoRight();
        GoUp gup = new GoUp ();
        GoDown gdown = new GoDown();
        GameOver gover = new GameOver();
        
        Random rand = new Random();
        
    int n = 0, x = 0, y = 0, sum_laisvi_skaiciai = 0, nauja_vieta_rasta=0, aktyvus = 1;
    
    String side;
    
    int [][] masyvas;
    masyvas= new int [4][4];

    
    ctable.sukurtiLentele(masyvas);
    ctable.findaRandomPlace(masyvas, aktyvus);
    gam.spausdintiLentele(masyvas);

    while (sum_laisvi_skaiciai==0){
        
      String left = "a", right = "d", up = "w", down = "s", stop = "o";
      Scanner scanner = new Scanner(System.in);
      String puse = scanner.nextLine();
        if (puse.equals(left))
        {
            side = "Kairen";
            System.out.println(side);
            gleft.goingLeft(masyvas, aktyvus);
                if (aktyvus == 0) System.out.println("Game over");
                else if (aktyvus == 1)
                {
                    ctable.findaRandomPlace(masyvas, aktyvus);
                }
          gam.spausdintiLentele(masyvas);
          System.out.println();
        }
        
        if (puse.equals(right)){
            side = "Desnen";
            System.out.println(side);
            gright.goingRight(masyvas, aktyvus);
                if (aktyvus == 0) System.out.println("Game over");
                else if (aktyvus == 1)
                {
                    ctable.findaRandomPlace(masyvas, aktyvus);
                }
          gam.spausdintiLentele(masyvas);
          System.out.println();
        }
          if (puse.equals(down)){
            side = "Zemyn";
            System.out.println(side);
          gdown.goingDown(masyvas, aktyvus);
                if (aktyvus == 0) System.out.println("Game over");
                else if (aktyvus == 1)
                {
                    ctable.findaRandomPlace(masyvas, aktyvus);
                }
           gam.spausdintiLentele(masyvas);
           System.out.println();
      }
      if (puse.equals(up))
        {
            side = "Aukstyn";
            System.out.println(side);
          gup.goingUp(masyvas, aktyvus);
                if (aktyvus == 0) System.out.println("Game over");
                else if (aktyvus == 1)
                {
                    ctable.findaRandomPlace(masyvas, aktyvus);
                }
          gam.spausdintiLentele(masyvas);
          System.out.println();
        }
       if (puse.equals(stop))
        {
          sum_laisvi_skaiciai=1;
          gam.spausdintiLentele(masyvas);
          System.out.println();
          System.out.println("Game over");
        }
       gover.isGameOver(masyvas, sum_laisvi_skaiciai);
        
        
    }
    }
    
}
