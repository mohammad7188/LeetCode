class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while(cur!= null ||!st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            ans.add(cur.val);
            cur = cur.right;
            
        }
    return ans;
    }
}
