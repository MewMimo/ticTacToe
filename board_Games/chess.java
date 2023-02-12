import java.util.Scanner;
 class chess
{
  public static void printArray(char[][] c)  {
    for(int i=0;i<c.length;i++)
      {
        for(int j=0;j<c[i].length;j++)  {
          System.out.print(c[i][j]);
        System.out.print("  ");
     } 
    System.out.println ("\n");
}
}
    
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    char board[][]={{'R','N','B','Q','K','B','N','R'},{'i','i','i','i','i','i','i','i'},
{'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'} ,
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'-','-','-','-','-','-','-','-'},
                    {'R','N','B','Q','K','B','N','R'},{'i','i','i','i','i','i','i','i'}};
    printArray(board);
    
}}