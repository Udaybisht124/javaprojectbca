 class equalmatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};
        boolean areEqual1And2 = areMatricesEqual(matrix1, matrix2);
        System.out.println("Matrix 1 and Matrix 2 are equal: " + areEqual1And2);
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length) {
            return false; // Matrices have different dimensions
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false; // Found a non-matching element
                }
            }
        }

        return true; // Matrices are equal
    }
}
