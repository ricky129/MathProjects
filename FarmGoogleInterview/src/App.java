public class App {
    public static void main(String[] args) throws Exception {
        code C1 = code.getInstance();
        matrixGen MG1 = matrixGen.getInstance();
        int[][] input_matrix = MG1.HugeBinaryMatrix();
                                
        System.out.println("Farm: " + C1.find_farmable_land(input_matrix));

    }
}
