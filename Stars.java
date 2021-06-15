//Richard Famoroti
//Second period
public class Stars{
   public static void main(String[] args){

     drawV();
    System.out.println();
    drawCone();
    System.out.println();
    drawRightTriangle(6);
    System.out.println();
    drawRightTriangle(10);
    System.out.println();
    drawRightTriangle(14);
    System.out.println();
    drawArrowhead();
    drawDiamond();
    }
    
    public static void drawV() {
       for (int line = 1; line <= 5; line++) {
          for (int i = 1; i <= (line - 1); i++) {
             System.out.print(" ");
          }
          for (int i = 1; i <= (11 - 2 * line); i++) {
             System.out.print("*");
          }
          System.out.println();
       } 
    } 
   
   
   
   public static void drawCone() {
       for (int line = 5; line >= 1; line--)
        {
          for (int i = 1; i <= (line - 1); i++) {
             System.out.print(" ");
          }
          for (int i = 1; i <= (11 - 2 * line); i++) {
             System.out.print("*");
          }
          System.out.println();
        }
     }
    public static void drawRightTriangle(int rows){
            int entered = rows;
       for (rows = 1 ;rows <= entered;rows++){
           for (int line = 1; line <= rows; line++){
             System.out.print("*");
            }
      
        System.out.println();
        }
    }
    


   public static void drawArrowhead(){
    for (int i = 1; i<=4; i++)
         {
       for (int j= 1; j<=i; j++)
         {
           System.out.print("* ");
         }
     System.out.println("");
     }
        for (int x = 3; x >= 0; x--)
         {
       for (int y= 1; y<=x; y++)
         {
           System.out.print("* ");
         }
     System.out.println("");
     }
   }
 
  public static void drawDiamond(){
    for (int i = 1; i < 10; i += 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }

    for (int i = 7; i > 0; i -= 2) {
      for (int j = 0; j < 9 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");

      System.out.print("\n");
    }
  }

 }
