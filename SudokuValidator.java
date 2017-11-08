public class SudokuValidator {
    /**
     * Checks each row for the valid sum of 45
     */
    public static boolean check(int[][] sudoku) {
        for(int x = 0; x<sudoku.length; x++){
              if(rowSum(sudoku[x]) != 45){             
                 return false;
                }       
        }      
        return true;
    }
    
    public static int rowSum(int[] row){
      int sum = 0;
      for(int i = 0; i<row.length; i++){
        sum = sum+ row[i];     
      }
      return sum;
    }
}
