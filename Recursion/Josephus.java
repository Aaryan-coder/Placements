/*
Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.
After each operation, the count will start from k+1th person. The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.

Example 1:

Input:
n = 3 k = 2
Output: 3
Explanation: There are 3 persons so 
skipping 1 person i.e 1st person 2nd 
person will be killed. Thus the safe 
position is 3.
 

Example 2:

Input:
n = 5 k = 3
Output: 4
Explanation: There are 5 persons so 
skipping 2 person i.e 3rd person will 
be killed. Thus the safe position is 4.
 */

class Solution
{
       int josephus(int n, int k)

    {

       return jos(n,k) +1;

    }
   public int jos(int n, int k)
    {
       if(n==0) {
			return 0;
		}
		return  (jos(n-1,k)+k)%n;
	}

}
