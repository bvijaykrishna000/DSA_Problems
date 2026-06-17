class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = m - 1;


        while(top <= bottom && left <= right) {


            // Left to Right
            for(int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;


            // Top to Bottom
            for(int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;


            // Right to Left
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }


            // Bottom to Top
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }

        }

        return ans;
    }
}