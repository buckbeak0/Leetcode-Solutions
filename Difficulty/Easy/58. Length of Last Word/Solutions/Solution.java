class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split("\\s+"); // Trim removes leading/trailing spaces
        return words[words.length - 1].length();
    }
}
