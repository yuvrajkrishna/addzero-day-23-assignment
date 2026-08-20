public class searchinrowwiseandcolumnwisematrixbyrplusc {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

        int target = 2;

        int row = -1;

        // Find the possible row
        for (int i = 0; i < arr.length; i++) {

            int lastElement = arr[i][arr[0].length - 1];

            if (lastElement < target) {
                continue;
            }
            else if (lastElement == target) {
                System.out.println("Present");
                return;
            }
            else {
                row = i;
                break;
            }
        }

        // If no possible row exists
        if (row == -1) {
            System.out.println("Not Present");
            return;
        }

        // Search in the selected row
        for (int j = 0; j < arr[0].length; j++) {

            if (arr[row][j] == target) {
                System.out.println("Present");
                return;
            }
        }

        System.out.println("Not Present");
    }
}