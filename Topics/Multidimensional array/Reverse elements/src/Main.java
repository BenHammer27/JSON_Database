class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {


        int rows = twoDimArray.length;
        int columns = twoDimArray[0].length;

        int[][] reversed = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                reversed[i][j] = twoDimArray[i][columns - 1 - j];
            }
        }
        for (int k = 0; k < rows; k++) {
            for (int l = 0; l < columns; l++) {
                twoDimArray[k][l] = reversed[k][l];
            }
        }

    }
}