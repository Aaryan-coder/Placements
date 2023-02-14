/*Sort an array of 0s, 1s and 2s
EasyAccuracy: 50.58%Submissions: 487K+Points: 2
Lamp
Don't Let the Fear of Missing Out Hold You Back from a Lucrative Career in Data Science. Try this course!

Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


Example 1:

Input: 
N = 5
arr[]= {0 2 1 2 0}
Output:
0 0 1 2 2
Explanation:
0s 1s and 2s are segregated 
into ascending order.
Example 2:

Input: 
N = 3
arr[] = {0 1 0}
Output:
0 0 1
Explanation:
0s 1s and 2s are segregated 
into ascending order.
*/


class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0 = 0;
        int count1 = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
            
        }
        for(int i = 0;i<count0;i++){
            a[i] = 0;
        }
        for(int i = count0;i<count0+count1;i++){
            a[i] = 1;
        }
        for(int i = count0+count1;i<a.length;i++){
            a[i] = 2;
        }
    }
}
