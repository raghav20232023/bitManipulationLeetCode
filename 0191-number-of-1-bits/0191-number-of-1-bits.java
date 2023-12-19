public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        //most optimal solution using brian kernighan's algorithm

        int setBitCount = 0;
        
		while (n != 0) {
            n &= (n - 1);
            ++setBitCount;
        }
		
        return setBitCount;
        
    }
}