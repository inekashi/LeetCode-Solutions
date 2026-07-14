class Solution {
    public void pattern9(int n) {
    for (int i =0;i<=n-1;i++){
        for (int j =1;j<=n-i-1;j++){
            System.out.print(" ");
        }
        for (int k =1;k<=2*i+1;k++){
            System.out.print("*");
        }
        System.out.println();

    }
    for (int i =n;i>=1;i--){
        for (int j =1;j<=n-i;j++){
            System.out.print(" ");
        }
        for (int m=1;m<=2*i-1;m++ ){
            System.out.print("*");
        }
        System.out.println();
    }

    }
}