import java.util.Scanner;
public class tictac {
  public static void printArray(char[][] c)  {
    for(int i=0;i<c.length;i++)
      {
        for(int j=0;j<c[i].length;j++)  {
          System.out.print(c[i][j]);
        System.out.print("  ");
     } 
    System.out.println ("\n");
}}


    
  public static boolean check(char[][] arr)
  {
  for(int i=0;i<3;i++)
    {
      if(arr[i][0]==arr[i][1] &&arr[i][1]==arr[i][2]) {
        if(!(arr[i][0]=='-')) 
        return true;
    }}
    for(int j=0;j<3;j++)
      {
      if(arr[0][j]==arr[1][j] && arr[1][j]==arr[2][j])   {
        if(!(arr[0][j]=='-'))
        return true;
    }}
    if (arr[0][0]==arr[1][1] && arr[1][1]==arr[2][2]) {
      if(!(arr[0][0]=='-'))
      return true;
}
    if (arr[2][0]==arr[1][1] && arr[1][1]==arr[0][2]) {
      if(!(arr[0][2]=='-'))
      return true;
      }
return false;
    }
    
    


public static void main(String args[])  {
    Scanner in=new Scanner(System.in ); 
      char tic[][]={{'-','-','-'},
                    {'-','-','-'},
                    {'-','-','-'}};
    int x,y;
  boolean e=true;
    while(true)
      {
        printArray(tic);
        System.out.println ("Enter your move");
        x=in.nextInt()-1;
        y=in.nextInt()-1;
        if((x<3 && x>=0) && (y<3 && y>=0))
          {
        if (tic[x][y]=='-') {
            tic[x][y]=e?'X':'O';
             if(check(tic))  {
printArray(tic);
               System.out.println("You won");
        break;
          }
        }
          else
          System.out.println ("Wrong choice");
            }
      else 
          System.out.println("Wrong choice ");

        }

  }}