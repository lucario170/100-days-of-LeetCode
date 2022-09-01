import java.util.*;
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         int n = mat.length;
        int m = mat[0].length;
        int[] output = new int[n*m];
        Hashtable<Integer, ArrayList<Integer>> hashtable = new Hashtable<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int key = i+j;
                if (hashtable.get(key) ==null) {
                    hashtable.put(i + j, new ArrayList<>());
                }
                hashtable.get(key).add(mat[i][j]);
            }
        }
        int index=0;
        int keyIndex=0;
        while(index!=m*n){
            ArrayList<Integer> numberList = hashtable.get(keyIndex);
            if(keyIndex++%2==0)
                Collections.reverse(numberList);
            for (Integer number : numberList)
                output[index++] = number;
        }

    return output;
    }
}