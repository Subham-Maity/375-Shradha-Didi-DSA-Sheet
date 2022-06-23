

// take a empty array and reverse the main array and add every character with empty one
class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {         
        
        String reverse = "";
        //first type of reverse string
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
              }
    return reverse ;
     }
}



// Find middle and swap each elements

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
   {
      char[] s= str.toCharArray();
      int n=s.length;
      int halflength=n/2;
      for(int i=0;i<halflength;i++){
          char temp=s[i];
          s[i]=s[n-1-i];
          s[n-1-i]=temp;
      }
      return new String(s);
   }
}