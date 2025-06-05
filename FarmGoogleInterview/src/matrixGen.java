public class matrixGen {
    
    public static final matrixGen instance = new matrixGen();

    public static matrixGen getInstance(){
        return instance;
    }

    public int[][] HugeBinaryMatrix(){
        // Define a 25x30 matrix
        int[][] matrix = new int[100][100];

        // Initialize all elements to 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 0;
            }
        }

        // --- Place the squares of 1s ---

        // 1. A large 24x24 square
        // Upper-left corner at (row 3, col 4)
        for (int r = 3; r < 3 + 24; r++) {
            for (int c = 4; c < 4 + 24; c++) {
                matrix[r][c] = 1;
            }
        }

        // 2. A 4x4 square
        // Upper-left corner at (row 1, col 18)
        for (int r = 1; r < 1 + 4; r++) {
            for (int c = 18; c < 18 + 4; c++) {
                matrix[r][c] = 1;
            }
        }

        // 3. Another 4x4 square
        // Upper-left corner at (row 15, col 2)
        for (int r = 15; r < 15 + 4; r++) {
            for (int c = 2; c < 2 + 4; c++) {
                matrix[r][c] = 1;
            }
        }

        // 4. A 3x3 square
        // Upper-left corner at (row 10, col 25)
        for (int r = 10; r < 10 + 3; r++) {
            for (int c = 25; c < 25 + 3; c++) {
                matrix[r][c] = 1;
            }
        }

        // 5. A 2x2 square
        // Upper-left corner at (row 20, col 15)
        for (int r = 20; r < 20 + 2; r++) {
            for (int c = 15; c < 15 + 2; c++) {
                matrix[r][c] = 1;
            }
        }

        // --- Print the matrix for visualization ---
        System.out.println("Generated HUGE Binary Matrix (25x30):");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------");

        // --- Summarize the placed squares ---
        System.out.println("\n--- Identified Squares of 1s ---");
        System.out.println("- A **24x24 square** with its upper-left corner at **(row 3, col 4)**");
        System.out.println("- A **4x4 square** with its upper-left corner at **(row 1, col 18)**");
        System.out.println("- A **4x4 square** with its upper-left corner at **(row 15, col 2)**");
        System.out.println("- A **3x3 square** with its upper-left corner at **(row 10, col 25)**");
        System.out.println("- A **2x2 square** with its upper-left corner at **(row 20, col 15)**");

        return matrix;
    }
}
