class Solution {
    public int firstUniqChar(String s) {
        int result = -1;
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a'] ++;
        }
        for(int i = 0; i < s.length(); i ++){
            if(count[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return result;
    }


    public int addDigits(int num) {
       while(num >= 10){
           int temp = num;
           num = 0;
           while(temp != 0){
               num += temp % 10;
               temp /= 10;
               }
       }
       return num;
   }


   public void moveZeroes(int[] nums) {
        if(nums.length > 1){
            int i = 0, j = i + 1;
         while(i < nums.length && j < nums.length && i < j){
                if(nums[i] == 0 && nums[j] == 0){
                    j++;
                }
                else if(nums[i] == 0 && nums[j] != 0){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++; j++;
                }
                else{
                    i++; j++;
                }
            }
        }
    }

public String longestPalindrome(String s) {
  int n = s.length();
  String ans = "";
  boolean[][] judge = new boolean[n][n];
 for(int i = n - 1; i >= 0; i--){
   for(int j = i; j < n; j++){
     judge[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || judge[i + 1][j - 1]);
     if(judge[i][j] && (ans == null || j - i + 1 > ans.length())){
       ans = s.substring(i, j + 1);
     }
   }
 }
 return ans;
}


public void rotate(int[][] matrix) {
   if (matrix == null || matrix.length == 0) {
       return;
   }

   final int L = matrix.length;

   for (int i = 0; i < (L + 1) / 2; ++i) {
       for (int j = 0; j < L / 2; ++j) {
           rotate(matrix, i, j);
       }
   }
}
private void rotate(int[][] matrix, int i, int j) {
   int L = matrix.length;
   int temp = matrix[i][j];
   matrix[i][j] = matrix[L - 1 - j][i];
   matrix[L - 1 - j][i] = matrix[L - 1 - i][L - 1 - j];
   matrix[L - 1 - i][L - 1 - j] = matrix[j][L - 1 - i];
   matrix[j][L - 1 - i] = temp;
}





}
