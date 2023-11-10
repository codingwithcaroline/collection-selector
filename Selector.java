import java.util.Arrays;

/**
*Defines a library of selection methods
*on arrays of ints.
*
*@author Caroline Kirkconnell (CarolineKirkconnell8@gmail.com
*@version TODAY
*
*/
public final class Selector {

   /**
   * Can't instantiate this class.
   *
   * DO NOT CHANGE THIS CONSTRUCTOR
   *
   */
   private Selector() {}
  
  
  /**
   * Selects the minimum value from the array a. This method
   * throws IllegalArgumentException if a is null or has zero
   * length. The array a is not changed by this method.
   */
   public static int min(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      int val = a[0];
      for (int i = 0; i < a.length; i++) {
         if (a[i] < val) {
            val = a[i];
         }
      }
      return val;
   }
    
  
 /**
  * Selects the maximum value from the array a. This method
  * throws IllegalArgumentException if a is null or has zero
  * length. The array a is not changed by this method.
  */
   public static int max(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      int val = a[0];
      for (int i = 0; i < a.length; i++) {
         if (a[i] > val) {
            val = a[i];
         }
      }
      return val; 
   }
 
 
 
 /**
 * Selects the kth minimum value from the array a. This method
 * throws IllegalArgumentException if a is null, has zero length,
 * or if there is no kth minimum value. Not that there is no kth
 * minimum value if k < 1, k > a.length, or if k is larger than
 * the number of distinct values in the array. The array a is not
 * changed by this method.
 */
   public static int kmin(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      if (k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      int[] copyArray = a.clone();
      Arrays.sort(copyArray);
      int count = 0;
      for (int i = 0; i < a.length - 1; i++) {
         if (copyArray[i] == copyArray[i + 1]) {
            count++;
         }
      }
      int specialValues = a.length - count;
      if (k > specialValues) {
         throw new IllegalArgumentException();
      }
      int[] answerArray = Arrays.copyOf(copyArray, a.length);
      int i = 1;
      count = 0;
      while (i < answerArray.length) {
         if (answerArray[i] == answerArray[count]) {
            i++;
         } else {
            count++;
            answerArray[count] = answerArray[i];
            i++;
         }
      }
      return answerArray[k - 1];
   }


/**
* Selects the kth maximum value from the array a. This method
* throws IllegalArgumentException if a is null, has zero length,
* or if there is no kth maximum value. Note that there is no kth
* maximum value if k < 1, k > a.length, or if k is larger than
* the number of distinct values in the array. The array a is not
* changed by this method.
*/
   public static int kmax(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      if (k < 1 || k > a.length) {
         throw new IllegalArgumentException();
      }
      int[] copyArray = a.clone();
      Arrays.sort(copyArray);
      int count = 0;
      for (int i = 0; i < a.length - 1; i++) {
         if (copyArray[i] == copyArray[i + 1]) {
            count++;
         }
      }
      int specialValues = a.length - count;
      if (k > specialValues) {
         throw new IllegalArgumentException();
      }
      int[] answerArray = Arrays.copyOf(copyArray, a.length);
      int i = 1;
      count = 0;
      while (i < answer.array.length) {
         if (answerArray[i] == answerArray[count]) {
            i++;
         } else {
            count++;
            answerArray[count] = answerArray[i];
            i++;
         }
      }
      return answerArray[uniqueValues - k];
   }
            
/**
* Returns an array containing all the values in a in the
* range [low..high]; that is, all the values that are greater
* than or equal to low and less than or equal to high,
* including duplicate values. The length of the returned array
* is the same as the number of values in the range [low..high].
* If there are no qualifying values, this method returns a
* zero-length array. Note that low and high do not have
* to be actual values in a. This method throws an
* IllegalArgumentException if a is null or has zero length.
* The array a is not changed by this method.
*/
   public static int[] range(int[] a, int low, int high) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      int count = 0;
      int[] duplicate = new int[10];
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= low && a[i] <= high) {
            duplicate[count] = a[i];
            count++;
         }
      }
      if (count == 0) {
         int[] zero = new int[0];
         return zero;
      }
      int[] answer = new int[count];
      System.arraycopy(duplicate, 0, answer, 0, count);
      return answer;
   }

/**
* Returns the smallest value in a that is greater than or equal to
* the gven key. This method throws an IllegalArgumentException if
* a is null or has zero length, or if there is no qualifying
* value. Note that key does not have to be an actual valie in a.
* The array a is not changed by this method.
*/
   public static int ceiling(int[] a, int key) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      int[] duplicate = new int[500];
      int count = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] >= key) {
            duplicate[count] = a[i];
            count++;
         }
      }
      if (count == 0) {
         throw new IllegalArgumentException();
      }
      int[] answerArray = new int[count];
      System.arraycopy(duplicate, 0, answerArray, 0, count);
      return min(answerArray);
   }



/**
* Returns the largest value in a that is less than or equal to
* the given key. This method throws an IllegalArgumentException if
* a is null of has zero length, or if there is no qualifying
* value. Note that key does not have to be an actual value in a.
* The array a is not changed by this method.
*/
   public static int floor(int[] a, int key) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      int[] duplicate = new int[500];
      int count = 0;
      for (int i = 0; i < a.length; i++) {
         if (a[i] <= key) {
            duplicate[count] = a[i];
            count++;
         }
      }
      if (count == 0) {
         throw new IllegalArgumentException();
      }
      int[] answerArray = new int[count];
      System.arraycopy(duplicate, 0, answerArray, 0, count);
      return max(answerArray);
   }
}
