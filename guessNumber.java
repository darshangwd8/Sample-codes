//Leetcode 374
/*
We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

You call a pre-defined API int guess(int num), which returns three possible results:

-1: Your guess is higher than the number I picked (i.e. num > pick).
1: Your guess is lower than the number I picked (i.e. num < pick).
0: your guess is equal to the number I picked (i.e. num == pick).
Return the number that I picked.

*/
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low=0;
        int high = n;
        int mid=0;
        while(low<=high){
            mid= low+(high- low)/2;
            int flag=guess(mid);
            if(flag <0){
                high=mid-1;
            }
            else if(flag>0){
                low=mid+1;
            }
            else return mid;
        }
        return -1;
    }
}
