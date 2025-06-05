public class code {

    private static code instance = new code();

    int smaller_size;
    int ret = 0;
    boolean found = false;

    static public code getInstance(){
        return instance;
    }

    /**
     * Takes the input_matrix[i][j] element and tries to find a submatrix of all 1s of which input_matrix[i][j] is the upper-left corner
     * @param input_matrix
     * @param i
     * @param j
     * @param length
     * @param height
     * @param current_submatrix_size
     * @return Wether if it's possible to find a current_submatrix_size-sized submatrix of all 1s for the given input_matrix[i][j] element
     */
    private boolean FindSubmatrix(int[][] input_matrix, int i, int j, int length, int height, int current_submatrix_size){

        /**
         * Using another set of coordinates it tries to find the square of all 1s. The conditions inside the for loops are
         * there to check if a submatrix of the given size is possible without going out of bound
         */
        for(int k = i; k < i + current_submatrix_size && k < height; k++){
            for(int y = j; y < j + current_submatrix_size && y < length; y++){
                //System.out.println("Iterating through: " + k + " " + y + ". value: " + input_matrix[k][y]+ " current_submatrix_size: " + current_submatrix_size);
                if(input_matrix[k][y] == 0){
                    //System.out.println("false");
                    return false;
                }
            }
        }
        /**
         * Updating the bigger submatrix found until now
         */
        if(current_submatrix_size > ret-1){
            //System.out.println("\nUpdating ret: " + current_submatrix_size + "\n");
            ret++;
            // if the biggest possible square submatrix is found, terminate both methods
            if(ret++ == smaller_size)
                found = true;
        }
        return true;
    }

    public int find_farmable_land(int[][] input_matrix){

        int length = input_matrix[0].length;
        int height = input_matrix.length;

        int current_submatrix_size = length;

        /**
         * The size of a square submatrix of a mxn matrix can only be equal to the smaller dimension
         */
        if(length > height)
            current_submatrix_size = height;

        // since current_submatrix_size is modified inside the while loop, its previous value is saved
        // in a temp variable.
        smaller_size = current_submatrix_size;

        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                //System.out.println("\nStarting element: i: " + i + " j: " + j + ". value: " + input_matrix[i][j] + "\n");
                // For each input_matrix[i][j] element, FindSubmatrix() is called to try every submatrix size possible
                while(!found && i < length && j < height -1 && input_matrix[i][j] == 1 && current_submatrix_size > 0 && !FindSubmatrix(input_matrix, i, j, length, height, current_submatrix_size)){
                    current_submatrix_size--;
                    //System.out.println("Trying with a smaller submatrix...");
                }
                // Restoring the original value
                current_submatrix_size = smaller_size;
            }
        }

        return ret;
    }

}
