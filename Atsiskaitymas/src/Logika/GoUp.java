
package Logika;


public class GoUp extends AddNumbers{
    public void goingUp (int [][]table, int aktyvus){
        AddNumbers num = new AddNumbers();
        int number =0;
     for (int i = 0; i < 3; i++){
            for (int j = 0; j <= 3; j++){
              if (table[i][j]==0&&table[i+1][j]>0){
                table[i][j]=table[i+1][j];
                table[i+1][j]=0;
                aktyvus = 1;
              }
              if (table[i][j]==table[i+1][j]&&table[i+1][j]>0&&table[i][j]>0){
                table[i][j]=table[i+1][j]*2;
                table[i+1][j]=0;
                
                aktyvus = 1;
              }
            }
          }
           for (int i = 3; i > 0; i--){
            for (int j = 3; j >= 0; j--){
              if (table[i-1][j]==0&&table[i][j]>0){
                table[i-1][j]=table[i][j];
                table[i][j]=0;
                aktyvus = 1;
              }   
              if (table[i-1][j]==table[i][j]&&table[i-1][j]>0){
                    number=table[i-1][j];
                table[i-1][j]=num.AddNumber(number);
                table[i][j]=0;
              }
            }
          }
};
}
