import java.util.Arrays;

// Count minimum number of subsets (or subsequences) with consecutive numbers 
public class CountMinimumNumberOfSubsets{
    public static void main( String args[])
    {
        int inputArray[] = {100,56, 5, 6, 102, 58, 101, 57, 7, 103, 59};
        Arrays.sort(inputArray);
        int count =1;
         for ( int i =0; i< inputArray.length-1; i++)
         {
             if ( inputArray[i]+1 != inputArray[i+1])
             { count++;
             }
         }
         System.out.println(" \n minimum number of subsets (or subsequences) with consecutive numbers : "+ count);

    }
}