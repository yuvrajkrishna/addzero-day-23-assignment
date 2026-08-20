public class findelementfromsortedmatrixlogrowlogcol {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int target = 5;

        int rowStart = 0;
        int rowEnd = arr.length - 1;
        int row = -1;

        // Binary Search on rows
        while (rowStart <= rowEnd) {

            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (arr[mid][0] <= target &&
                target <= arr[mid][arr[0].length - 1]) {

                row = mid;
                break;
            }

            else if (arr[mid][0] > target) {
                rowEnd = mid - 1;
            }

            else {
                rowStart = mid + 1;
            }
        }

        // Binary Search inside selected row
        if (row != -1) {

            int colStart = 0;
            int colEnd = arr[0].length - 1;

            while (colStart <= colEnd) {

                int mid = colStart + (colEnd - colStart) / 2;

                if (arr[row][mid] == target) {
                    System.out.println("Present");
                    return;
                }

                else if (arr[row][mid] < target) {
                    colStart = mid + 1;
                }

                else {
                    colEnd = mid - 1;
                }
            }
        }

        System.out.println("Not Present");
    }
}