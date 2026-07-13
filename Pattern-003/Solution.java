class Solution {
    public void pattern17(int n) {
        int breakpoint=0;
       for (int i =0;i<n;i++){
           for (int j =1;j<n-i;j++){
               System.out.print(" ");
           }
                 breakpoint=(2*i+1)/2;
                 char ch='A';
               for (int m=1;m<=(2*i+1);m++){
                   
                   System.out.print(ch);
                   if(m<=breakpoint){
                    ch++;
                   }
                   else{
                    ch--;
                   }
                   
                   
               }
               System.out.println();
       }
    }
}