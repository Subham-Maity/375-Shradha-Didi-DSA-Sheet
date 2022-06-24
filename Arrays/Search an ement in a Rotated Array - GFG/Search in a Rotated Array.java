
// Brute 
// Time Complxity - O(n)
// Space Complxity - O(1)


class Solution
{
    int search(int A[], int l, int h, int key)
    {
       for(int i=0;i<h;i++){
           if(A[i]==key){
               return i;
           }
       }
        return -1;
       
   }
}




//Another Approach - Using Binary search -  O(log n) Time Complexity and space O(1)


/*
Approach: Instead of two or more passes of binary search the result can be found in one pass of binary search. 
The binary search needs to be modified to perform the search. T
he idea is to create a recursive function that takes l and r as a range in input and the key.

1) Find middle point mid = (l + h)/2
2) If key is present at middle point, return mid.
3) Else If arr[l..mid] is sorted
    a) If key to be searched lies in range from arr[l] to arr[mid], recur for arr[l..mid].
    b) Else recur for arr[mid+1..h]
4) Else (arr[mid+1..h] must be sorted)
    a) If key to be searched lies in range from arr[mid+1]to arr[h], recur for arr[mid+1..h].
    b) Else recur for arr[l..mid] 
*/

class Solution {


    int search(int arr[], int l, int h, int key) {
        if (l <= h) {//if l is less than or equal to h
            int mid = (l + h) / 2;//mid is the midpoint of the array
            if (arr[mid] == key) {//if the midpoint of the array is equal to the key
                return mid;//return mid
            }
            //left sorted
            if (arr[mid] >= arr[l]) {//if the midpoint of the array is greater than or equal to the left side of the array
                if(key >= arr[l] && key <= arr[mid - 1]) {//if the key is greater than or equal to the left side of the array and less than or equal to the midpoint of the array minus 1
                    return search(arr, l, mid - 1, key);//return the search function with the left side of the array, midpoint of the array minus 1, and the key
                }
                else{
                    return search(arr, mid + 1, h, key);//return the search function with the midpoint of the array plus 1, and the right side of the array, and the key
                }
            }
            else {
                if(key >= arr[mid + 1] && key < arr[h]) {//if the key is greater than or equal to the midpoint of the array plus 1 and less than the right side of the array
                    return search(arr, mid + 1, h, key);//return the search function with the midpoint of the array plus 1, and the right side of the array, and the key
                }
                else {
                    return search(arr, l, mid - 1, key);//return the search function with the left side of the array, midpoint of the array minus 1, and the key
                }
            }
        }
        return -1;//if l is greater than h, return -1

    }
}

