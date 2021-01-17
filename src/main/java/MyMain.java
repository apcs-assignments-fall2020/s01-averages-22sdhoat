public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        double total = 0;
        int totallength = 0;
        for(int i = 0; i <mat.length; i++) {
            for(int j = 0; j <mat[i].length; j++) {
                total += mat[i][j];
                totallength++;
            }
        }
        return total/(totallength);
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        double[] single = new double[mat.length * mat[0].length];
        double temp = 0;
        int counter = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                single[counter] = mat[i][j];
                counter++;
            }
        }
        if (single.length % 2 != 0){
            temp = single[single.length/2];
        }
        else {
            temp = (single[single.length/2] + single[(single.length/2) - 1])/2;
        }
        return temp;
    }
    
    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        double[] single = new double[mat.length * mat[0].length];
        double mode = 0;
        int amount = 0;
        int counter_1 = 0;  
        int counter_2 = 0;     
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                single[counter_1] = mat[i][j];
                counter_1++;
            }
        }
        for (int x = 0; x < single.length; x++) {
            counter_2 = 0;
            for (int y = 0; y < single.length; y++) {
                if (single[x] == single[y]) {
                    counter_2++;
                    if (counter_2 > amount) {
                        amount = counter_2 - 1;
                        mode = single[x];
                    }
                }
            }
        }
        return mode;   
    }

    public static void main(String[] args) {
    }
}
