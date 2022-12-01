class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int max = 0;
        for(int i=0;i<n;i++){
            if(A[i]>max){
                max = A[i];
            }
        }
        int arr[] = new int[max+1];
        for(int i=0;i<n;i++){
            if(A[i]>0){
                arr[A[i]] = 1;
            }
        }
        for(int i=1;i<max+1;i++){
            if(arr[i]==0){
                return i;
            }
        }
        return max+1;
    }
}