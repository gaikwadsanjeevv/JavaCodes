

 public class Main {


   public static void main(String[] args) {
       int marks [][] = {
           {76, 76, 87, 79},
               {87, 56, 76, 87},
               {87, 98, 76, 56}
       };
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 4; j++){
               System.out.print(marks[i][j] + "\t");
           }
           System.out.println();
       }


   }
}
