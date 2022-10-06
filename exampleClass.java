//EXAMPLE OF A CLASS THAT WOULD USE THE INTERFACE
//BY SAMEER CHOWDHURY
//P.S DO NOT USE THIS FILE FOR THE PROJECT IT'S JUST AN EXAMPLE

import java.util.*;
class exampleClass implements statistics
  {
    //this is the first behavior
    public int[] sort(int list[])
    {
      Arrays.sort(list);
      return list;
    }
    
    //an example for the second behavior
    public int[] calculations(int list[])
    {
      for(int i=0,j=list.length;i<j;i++)
        {
          list[i]=3;
        }
      return list;
    }
    
    
  }
