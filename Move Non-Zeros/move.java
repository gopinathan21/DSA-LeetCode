public class move {
  static  void pushZerosToEnd(int[] arr, int n) {
       
	     // Use a pointer to keep track of where the next non-zero element should be placed
         int nonZeroPointer = 0;

         // Traverse through the array
         for (int i = 0; i < n; i++) {
             // If the current element is non-zero, move it to the position pointed by nonZeroPointer
             if (arr[i] != 0) 
             {
                 // Only perform the swap if nonZeroPointer is different from i
                 if (nonZeroPointer != i) {
                     arr[nonZeroPointer] = arr[i];
                     arr[i] = 0; // Place zero at the current position
                 }
                 nonZeroPointer++; // Move the nonZeroPointer to the next position
             }
         }
        System.out.println("j");
    }
    public static void main(String[] args) {
        int[] r = {1 , 1, 1 , 0};
        pushZerosToEnd(r, r.length);
        
    }
}
