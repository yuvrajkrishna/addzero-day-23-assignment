public class searchinrowwiseandcolumnwisematrixbyrpluscstaircase {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target = 8;
        int i = 0;
        int j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {

            if (arr[i][j] == target) {
                // found
                System.out.println("Present");
                return;
            } else if (arr[i][j] < target) {
                i++; // down
            } else {
                j--; // left
            }
        }
        System.out.println("Not present");
    }
}
