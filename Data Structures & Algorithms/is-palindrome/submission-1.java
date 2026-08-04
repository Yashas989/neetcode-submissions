class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder str = new StringBuilder();
        for (char aChar : chars) {
            if (aChar >= 'a' && aChar <= 'z'  || aChar >= '0' && aChar <='9') {
                str.append(aChar);
            }
        }
        char[] withoutSpaces = str.toString().toCharArray();
        // System.out.println("chars - " + Arrays.toString(chars));
        // System.out.println("withoutSpaces - " + Arrays.toString(withoutSpaces));
        for(int l=0, r=withoutSpaces.length-1; l<=r;) {
            if(l==r) break;
            else if(withoutSpaces[l] == withoutSpaces[r]){
                l++;
                r--;
            }
            else return false;
        }
        return true;
    }
}
