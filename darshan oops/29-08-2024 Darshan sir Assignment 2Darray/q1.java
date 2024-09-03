public class q1 {
    public static void main(String[] args){
        int[][] matrix = {
            {4, 8, 5},
            {5, 9, 6},
            {8, 5, 8}
        };
        // Initialize sums with the sum of the first row and first column
        int maxRowSum = 0, maxColumnSum = 0,maxRowIndex = 0,maxColumnIndex = 0;
        
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0, columnSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
            if (columnSum > maxColumnSum) {
                maxColumnSum = columnSum;
                maxColumnIndex = i;
            }
        }
        // Print the row and column with the maximum sum
        System.out.println("row: " + (maxRowIndex));
        System.out.println("column: " + (maxColumnIndex));
    }
}
