// Brute 
//Time Complexity - O(nlogn)
//Space Complexity - O(1)
class Compute 
{
   static pair getMinMax(long a[], long n)  
   {
      
       Arrays.sort(a);
       long min=a[0];
       long max=a[a.length-1];
       return new pair(min, max);
   }
}



//optimal
//Time Complexity - O(n)
//Space Complexity - O(1)
class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
    long min=0, max=0;//min maxinitialize with zero
    
       if(n > 0){ //array size in n here  
           min = a[0]; 
           max = a[0];
           for(long x : a){ //for each loop
               if(min > x){
                   min = x;
               }
               if(max < x){
                   max = x;
               }
           }
       }
       
       //pair p = new pair(min, max); //same 
       
       return new pair(min, max);
       
   }
}