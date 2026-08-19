class Solution {
    public boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        if (revs(x,0)==x){
            return true;
        }
        return false;
    }
    public static int revs(int n,int rev){
        if (n==0){
            return rev;
        }
        rev=(rev*10)+(n%10);
        return revs(n/10,rev);
            
    }
}