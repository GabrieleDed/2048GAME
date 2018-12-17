
package Logika;


public class GoLeft extends AddNumbers{
    public void goingLeft (int [][]table, int aktyvus){
        AddNumbers num = new AddNumbers();
        int number =0;
     for (int i = 0; i <= 3; i++){
            for (int j = 0; j <3; j++){
              if (table[i][j]==0&&table[i][j+1]>0){
                table[i][j]=table[i][j+1];
                table[i][j+1]=0;
                aktyvus = 1;
              }
              if (table[i][j]==table[i][j+1]&&table[i][j+1]>0&&table[i][j]>0){
                table[i][j]=table[i][j+1]*2;
                table[i][j+1]=0;
                aktyvus = 1;
              }   
            }
          }
         
          for (int i = 3; i >= 0; i--){
            for (int j = 3; j > 0; j--){
              if (table[i][j-1]==0&&table[i][j]>0){
                table[i][j-1]=table[i][j];
                table[i][j]=0;
                aktyvus = 1;
              }    
              if (table[i][j-1]==table[i][j]&&table[i][j-1]>0){
                table[i][j-1]=num.AddNumber(number);
                table[i][j]=0;
              }
            }
          }
        
};
}
