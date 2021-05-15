class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int rows = twoDimArray.length;
        int columns = twoDimArray[0].length;

        System.out.println(twoDimArray[0][0] + " " + twoDimArray[0][columns - 1]);
        System.out.println(twoDimArray[rows-1][0] + " " + twoDimArray[rows - 1][columns - 1]);

    }
}