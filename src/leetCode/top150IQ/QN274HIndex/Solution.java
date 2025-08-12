package leetCode.top150IQ.QN274HIndex;

public class Solution {

    public static void main(String[] args) {
        int[] citations = {0,1,3,5,6};
        int result = hIndex(citations);
        System.out.println(result);
    }

   // private static int hIndex(int[] citations) {
//        Arrays.sort(citations); //0 1 3 5 6
//        for(int i = 0, j = citations.length - 1; i < j; i++, j--){
//            int temp = citations[i];
//            citations[i] = citations[j];
//            citations[j] = temp;
//        }
//        //6 5 3 1 0
//        int h = 0;
//        for(int i = 0; i < citations.length; i++){
//            if(!(citations[i] >= (i + 1))){
//                return h;
//            }
//            h++;
//        }
//        return h;
        public static int hIndex(int[] citations) {
           int n = citations.length;
           int[] bucket = new int[n + 1];
           for(int num: citations) bucket[Math.min(num, n)]++;
           int papers = 0;
           for(int h = n; h >= 0; h--){
               papers += bucket[h];
               if(papers >= h) return h;
           }
           return 0;
    }
}



/*
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
Example 2:

Input: citations = [1,3,1]
Output: 1
 */