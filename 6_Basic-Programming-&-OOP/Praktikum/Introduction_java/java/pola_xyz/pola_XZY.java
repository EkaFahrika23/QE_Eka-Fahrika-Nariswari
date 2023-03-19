package pola_xyz;

public class pola_XZY {
    public static void main(String[] args) {
//        int height = 5;
        drawXYZ(5);
    }
    public static void drawXYZ(int height) {
        // Initialize variables for counting odd and even multiples
        int odd = 2;
        int even = 3;

        // Loop through the height of the pattern
        for (int i = 1; i <= height; i++) {
            // Initialize empty string to hold the pattern for this row
            String rowPattern = "";

            // Loop through the width of the pattern for this row
            for (int j = 1; j <= height; j++) {
                // Determine which symbol to add to the row pattern based on the multiples of 3, odd, and even
                if (j % 3 == 0) {
                    rowPattern += "X ";
                } else if (j % 2 == 1) {
                    rowPattern += "Y ";
                    odd += 3;
                } else {
                    rowPattern += "Z ";
                    even += 2;
                }
            }

            // Print out the pattern for this row
            System.out.println(rowPattern);
        }
    }

}
