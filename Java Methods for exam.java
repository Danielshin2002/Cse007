import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;


public class Exam2{
   public static void main(String[]args){
       Scanner s = new Scanner(System.in);
       Random rand = new Random;
       System.out.println("Enter the dimension of a 1D array");
       int length = getInt(s);
       System.out.println("Enter two dimensions -- row and col for the 2D array");
       int row = getInt(s);
       int col = getInt(s);
       String[] words = new String[length];
       String[][] moreWords = new String[row][col];


       fillArray(words);
       fillArray(moreWords);


       System.out.println("Words: ");
       printArray(words);
       System.out.println("Lots of Words: ");
       printArray(moreWords);


       sortArray(words);
       System.out.println("Sorted Words: ");
       printArray(words);


       searchArray(words, "EXAM2!");
       searchArray(words, words[0]);


       System.out.println("Lots of Words (Again): ");
       printArray(moreWords);


       sortArray(moreWords[0]);
       System.out.println("Lots of Words, Sorted first row: ");
       printArray(moreWords);


       reverseArrays(moreWords);
       System.out.println("Lots of Words Reversed: ");
       printArray(moreWords);


       searchArray(moreWords, "TESTINGSEARCH");
       searchArray(moreWords, moreWords[row-1][col-1]);
       s.close();
   }
   public static int getInt(Scanner keys){
       int num = 0;
       boolean loopControl = true;
       do{
           if(keys.hasNextInt()){
               num = keys.nextInt();
               if(num >=5 && num <=95){
                   loopControl = false;
               } else {
                   System.out.println("Out of range -- 5:95");
               }
           } else {
               System.out.println("not an int");
               scan.nextLine();
           }
       } while (loopControl);
       return num;
   }

   ///return a random character that is in one of these ranges: 0-9, A-Z or a-z

   public static char generateChar(){
    int range = (int) (math.random() *3); //generate int between 0 and 2
    if (range = 0 ){
        return (char) ('0' + (int) (Math.random() * 10)); // 0-9
    }   else if (range = 1) {
        return (char) ('A' + (int) (Math.random() * 26)); // 0-25 added to 'A'
    }   else if (range = 2) {
        return (char) ('a' + (int) (Math.random() * 26)); // 0-25 added to 'a'
        }
    }

    //accept either a one- or two-dimensional array of Strings. Iterate through the appropriate array and fill each element with a String made up of 10 random characters. 
   public static void fillArray(String[] list){ 
        for (int i = 0; i < array.length; i++){
            array[i] = generateString()
        }
    }
   public static void fillArray(String[][]list){ 
    for (int i = 0; i < list.length; i++){
        for (int j = 0; j < list[i].length; j++){
            array[i][j] = generateString()
        }
    }
   }
   private static String generateString() {
  char[] chars = new char[10];
  for (int i = 0; i < chars.length; i++) {
    chars[i] = generateChar();
  }
  return new String(chars);
}
//accept either a one- or two-dimensional array of Strings. 
//Iterate through the appropriate array and display each String element on the same line. Be sure to print new lines between each row of the two-dimensional array. 
   public static void printArray(String[] list){ 
      for (int i = 0; i < array.length; i++) {
    System.out.print(array[i] + " ");
  }
  System.out.println();
    }
   public static void printArray(String[][]list){
      for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      System.out.print(array[i][j] + " ");
    }
    System.out.println();
  }
    }
    //accept a one-dimensional array of Strings. 
//For the one-dimensional array, you must sort the elements in descending order using the sorting algorithm of your choice (insertion or selection).

   public static void sortArray(String[]list){ 
  for (int i = 1; i < array.length; i++) {
    String current = array[i];
    int j = i - 1;
    while (j >= 0 && array[j].compareTo(current) < 0) { // if it was array[j]compareTo(current) > 0 then it would be in ascending order
      array[j + 1] = array[j];
      j--;
    }
    array[j + 1] = current;
  }
   }

   //accept a two-dimensional array of Strings. For each row in the two-dimensional array, you 
   //should reverse the elements in place (i.e. without creating a new array). This method does not return any value.

   public static void reverseArrays(String[][]list){ 
      for (int i = 0; i < array.length; i++) {
    int start = 0;
    int end = array[i].length - 1;
    while (start < end) {
      String temp = array[i][start];
      array[i][start] = array[i][end];
      array[i][end] = temp;
      start++;
      end--;
    }
  }
   }
   public static void searchArray(String[]list, String key){ 
    int low = 0;
  int high = array.length - 1;
  int mid;
  int index = -1;

  // The 1D array must be sorted before using binary search because binary search requires the elements to be sorted in order to determine which half of the array to search in each iteration.
  Arrays.sort(array);

  while (low <= high) {
    mid = (low + high) / 2;
    if (array[mid].compareTo(key) == 0) {
      index = mid;
      break;
    } else if (array[mid].compareTo(key) < 0) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }

  if (index != -1) {
    System.out.println("The key " + key + " was found in the 1D array at index " + index);
  } else {
    System.out.println("The key " + key + " was not found in the 1D array");
  }
    }


// accept a one- or two-dimensional array of Strings, and a String key to search for. These methods should be void, so be sure to print the results of the search in each method.
//For the 1D array: Use binary search to determine if the key you are looking for is in the list or not. 
//For full credit, add a comment explaining why the 1D had to be sorted before using binary search
//For the 2D array: Use linear search to find the key that you are looking for.

   public static void searchArray(String[][]list, String key){  
    int row = -1;
  int col = -1;
  for (int i = 0; i < array.length; i++) {
    for (int j = 0; j < array[i].length; j++) {
      if (array[i][j].equals(key)) {
        row = i;
        col = j;
        break;
      }
    }
    if (row != -1) {
      break;
    }
  }

  if (row != -1) {
    System.out.println("The key " + key + " was found in the 2D array at row " + row + " and column " + col);
  } else {
    System.out.println("The key " + key + " was not found in the 2D array");
  }
    } } 