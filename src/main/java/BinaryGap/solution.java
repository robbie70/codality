package BinaryGap;

class Solution {
    public int solution(int numberToTest) {
        // write your code in Java SE 8

        int maxGap = 0;
        int currentGap =0;
        boolean counting = false;

        // Using the "concept of bit manipulation" and "& operation"

        while( numberToTest !=0 ){

            if(!counting){    // for the first "1"
                if( (numberToTest&1) == 1){      // note: cannot use n&1 without"()"
                    counting = true;  // start to count
                }
            }
            else{                    // counting = true
                if( (numberToTest&1) ==0){      // note: cannot use n&1 without "()"
                    currentGap ++;
                }
                else{ // N & 1 == 1
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0; // reset
                }
            }

            numberToTest = numberToTest >> 1; // shift by one (right side)
            // note: cannot just write "N >> 1"
        }

        return maxGap;
    }
}
