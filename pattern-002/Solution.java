class Solution {
    public void pattern15(int n) {
        for (int i =n;i>=1;i--){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
        

    }
}