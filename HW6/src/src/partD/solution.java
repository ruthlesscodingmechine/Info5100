package src.partD;

public class solution {
    public static int findClosestIndex(int[] A, int target){
        int abs = Integer.MAX_VALUE, idx = -1;
        for(int i = 0; i < A.length; i++){
            if(Math.abs(A[i] - target) < abs){
                abs = Math.abs(A[i] - target);
                idx = i;
            }
        }
        return idx;
    }
}
