class Solution {
    
    static int MOD = (int)(1e9 + 7);
    
    int nodesSum;
    long maximumProduct;
    public int maxProduct(TreeNode root) {
        
        nodesSum = getAllNodeSum(root);
        
        maximumProduct = 0l;
        
        findMaxProduct(root);
        
        return (int)(maximumProduct % MOD);
    }
    
    private int getAllNodeSum(TreeNode node){
        if(node == null) return 0;
        
        return getAllNodeSum(node.left) + getAllNodeSum(node.right) + node.val;
    }
    
    
    private int findMaxProduct(TreeNode node){
        if(node == null) return 0;
        
        int substree1Sum = findMaxProduct(node.left) + findMaxProduct(node.right) + node.val;
    
        int substree2Sum = nodesSum - substree1Sum;
        
        maximumProduct = Math.max(maximumProduct, (long)substree1Sum * substree2Sum);
        
        return substree1Sum;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(N)

// Date :- 10/12/2022