class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                int[] newMatrix = new int[matrix.length * matrix[0].length];
        int count = 0;
        for(int[] arr : matrix) {
            for(int i : arr){
                newMatrix[count++] = i;
            }
        }
        int l=0,r=newMatrix.length-1,mid=0;
        while(l<=r){
            mid = (l+r)/2;
            if(newMatrix[mid] == target)
                return true;
            else if(target > newMatrix[mid])
                l = mid+1;
            else
                r = mid-1;
        }
        return false;
    }
}
