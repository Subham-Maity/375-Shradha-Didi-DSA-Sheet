
/*Approach- When you sort this array you don't need to traverse on entire array and find the minimum gap 
to avoid this you can simply sort this then if the student is only 5 then traverse length will max 5
so the condition will be something like that i+m < n
where m is student and i is the chocolate and n is the length
now just iterate and take the minimal difference 


example :
3  4  1  9  56  7  9  12
sort this 

1 3 4 7 9 9 12 56

a+m < n

so minimal difference is the

9-1 = 8 (where first pointer i is 1 and 9 is j)
9-3 = 6 (where first pointer i is 3 and 9 is j)
12-4 = 8 (where first pointer i is 4 and 12 is j)
56-7 = 49 (where first pointer i is 7 and 56 is j)

so minimal difference is 6 */







// Time Complexity - O(n Log n)
// Space Complexity - O(1)





// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
                // your code here
        Collections.sort(a);//sort this first
        long minDiff = Long.MAX_VALUE; //minimum difference  
        for(int i=0;i+m-1<n;i++) //i+m-1 -> length is 5 means 0-4 so m-1  
        {
            minDiff = Math.min(a.get(i+(int)m-1)-a.get(i),minDiff); //compare with minDiff(which is our recent value) and a.get(i+(int)m-1)-a.get(i) this is basically->(i+m-1) which is pointer 1 and i is pointer 2 
        }
        return minDiff;
    }
}


//same 
class Solution
{
   public long findMinDiff (ArrayList<Long> a, long n, long m)
   {
       Collections.sort(a);
       int ans=Integer.MAX_VALUE;
       for(int i=(int)m-1,j=0;i<n;i++,j++){
           ans=Math.min(ans,(int)(a.get(i)-a.get(j)));
       }
       return ans;
   }
}