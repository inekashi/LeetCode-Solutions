class Solution {
    public void pattern19(int n) {
     for (int i =0;i<=n-1;i++){
        for (int j =1;j<=n-i;j++){
            System.out.print("*");
        }
        for (int m=1;m<(2*i+1);m++){
            System.out.print(" ");
        }
        for(int k=n-i;k>=1;k--){
            System.out.print("*");
        }
        System.out.println();
     }
     for (int a=n;a>=1;a--){
        for(int s=1;s<=(n-(a-1));s++){
            System.out.print("*");
        }
        for(int x=1;x<(2*a-1);x++){
            System.out.print(" ");
        }
        for(int f=1;f<=(n-(a-1));f++ ){
            System.out.print("*");
        }
        System.out.println();
     }
    }
}