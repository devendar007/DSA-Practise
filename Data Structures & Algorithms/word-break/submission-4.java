class Solution {
    public boolean helper(int idx, String s, Set<String> wordDict, Boolean[] memo) {
        if (idx >= s.length()) return true;
        if (memo[idx] != null) return memo[idx];

        for (int i = idx; i < s.length(); i++) {
            String sub = s.substring(idx, i + 1);
            if (wordDict.contains(sub) && helper(i + 1, s, wordDict, memo)) {
                return memo[idx] = true;
            }
        }

        return memo[idx] = false;
    }

    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return helper(0, s, dict, memo);
    }
}
