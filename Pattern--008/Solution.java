class Solution {
    public void pattern20(int n) {
          for (int i =n;i>=1;i--){
            for (int j =1;j<=n-(i-1);j++){
                System.out.print("*");
            }
            for (int m =1;m<(2*i)-1;m++){
                System.out.print(" ");
            }
            for (int k=1;k<=n-(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
          }
          for(int a=n-1;a>=1;a--){
            for(int b=1;b<=a;b++){
                System.out.print("*");
            }
            for(int c=1;c<(2*(n-a)+1);c++){
                System.out.print(" ");
            }
              for (int q=1;q<=a;q++){
                System.out.print("*");
              }
              System.out.println();
          }
    }
}