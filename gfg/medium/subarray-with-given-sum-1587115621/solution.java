class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        long sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                ans.add(start + 1); // 1-based indexing
                ans.add(end + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}