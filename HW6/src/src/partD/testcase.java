package src.partD;

import static src.partD.solution.findClosestIndex;

public class testcase {
    public static void main(String[] args) {
        int[] A = new int[]{1,3,3,4};
        int[] B = new int[]{0,1,5};
        int r1 = findClosestIndex(A,2);
        int r2 = findClosestIndex(B, 7);
        System.out.println(r1);
        System.out.println(r2);
    }


}
