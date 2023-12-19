class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
      for(int i =1;i<=n;i++){
            int temp = i;
            int count = 0 ;
            while(temp != 0){ 
                temp = temp & (temp-1);
                count++;
        //counting number of bits using brian kernighan's algorithm of counting number of 1 
        //adding comments decreases runtime and increases memory consumption
        //you can add comments here, but remember in competitive coding dont add comments
        //adding comments here will not affect anything

            }
            arr[i] = count;
        }
        

        return arr;
        
    }
}