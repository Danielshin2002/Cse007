/* arrays
basically matrix*/

public class TestReview{
    public static void main(string[] args){ 
    Scanner scan = new Scanner(System.in);
        double[] myList = new double[10]; // this creates a 1 column, 10 row matrix 
/* datatype[] arrayRef Var
    myList[0] is the first element in the array, 0 is the index
    once an array is created, you can't expand it
    size of array is used thru arrayRefVar.length
    ie : myList.length will return 10
    when created, for numeric rpimiate data type, default value is 0,
    for char types its \u0000, null, and false for boolean types
    indexed varialbe can be used in same way as regular varialbe, such as*/
    myList[2] = myList[1] + myList[2];
    // you can declare, create, and initialize in 1 step 
    //when declared, its not fixed, such as 
    int[] numbers; // declaring, not fixed yet
    numbers = new int[10]; // creating

    double[] myList = {1.9, 2.9, 3.4, 3.5}; /* you can't separate this into two like :
    double[] myList;
    myList = {1.9, 2.9, 3.4, 3.5}; will return syntax error. */

// setting array1 = array2 does not create a copy of the array, only a reference to the same array. both variables point to the same array in memroy, 
// so the changes wil be reflected in the other array

// to copy an array, you can do System.arraycopy method, or creates a new array and copy the elemtns one by one

    int[] myArray1 = new int[] {1, 2, 3};
    int[] myArray2 = new int[myArray1.length];
    System.arraycopy(myArray1, 0, myArray2, 0, myArray1.length);
    //System.arraycopy(source array, source starting position, dest (destination array), destination position, length (number of elements to be copied);
    myArray2[0] = 0;
    System.out.println(myArray1[0]); // Output: 1


//Array Average
Random ran = new Random();
       int[] numz = new int[10];
       int sum = 0;
       int max = 0;
       int maxIndex=0;
       int min = 20; //would it work to start this value at 0? What if we use numz[0] here? 
       int minIndex=0;
       for(int i=0; i<numz.length; i++){
           numz[i] = ran.nextInt(20)+1;
           sum += numz[i];
           if(numz[i]>max){
               max = numz[i];
               maxIndex = i;
           }
           if(numz[i]<min){
               min=numz[i];
               minIndex=i;
           }
       }

       double average = sum/10.0;
       for(int temp:numz){
           System.out.print(temp+" ");
       }
       System.out.println("\nMax Element: "+max+" @ index #"+maxIndex+"; Min Element: "+min+" @ index #"+minIndex);
       System.out.println("The average of all elements is: "+ average);
// Linear Search
   //Linear search compares key sequentialy with each element in array. If match is found, it returns index of element it matched, and if it reaches the end, it returns -1(or dummy variable)
    int list= {22,44,55,33,11,99,77,66,88};
    int key = 55;
    int index=-1; 

    for(int i=0; i<list.length; i++){
        if(list[i]==key){
      index=i;
      break;
    }
    }

    if(index!=-1){
     System.out.println(key + " was found at index="+ index);
    } else {
     System.out.println(key+ " was not found ");
    } // the worst case for a linear search is when its at the very end of an array, or when its not there (max searches) the time complexity is O(n) where n is number of element in list
    // however, binary search can search in O(log n) because it splits in 2 
  
//Binary Search - more efficient, can be sorted in O(log n), REQUIRES arrayu to be sorted
/* we can sort with
import java.util.Arrays
Arrays.sort(arrayName)
binary search works by splitting array in half every time*/

    Arrays.sort(numList); //numList = {2,3,5,7,8,9,13};

    int mid, low, high;
    keyIndex = -1;
    low = 0;
    high = numList.length-1;
    while(high>=low){
    mid = (high+low)/2;
    if (numList[mid]< key){
          low = mid+1;
       } else if(numList[mid]>key){
          high = mid-1;
       } else {
          keyIndex = mid;
          break;
        }
    }

    if(keyIndex!=-1){
   System.out.println(key + " was found at index="+ keyIndex);
    } else {
   System.out.println(key+ " was not found in numList");
    }

//binary search with strings
    String[] womenInTech = {"Bartik, Jean","Borg, Anita", "Hopper, Grace", "Klawe, Maria", "Lovelace, Ada", "Sandberg, Sheryl", "Schneider, Erna"};
    System.out.println("Please enter the name of the computer scientist you want to search");
    String key = input.next();
    boolean found = false;
    int low, mid, high;
    low=0, high=womenInTech.length-1;
    while(high >=low){
      mid = (high+low)/2;
      if(key.compareTo(womenInTech[mid]) < 0){
          //look in first half
          high = mid-1;
      } else if (key.compareTo(womenInTech[mid]) > 0){
          //look in second half of list
          low = mid+1;
      } else{
          found = true;
          break;}
  }

 if(found){
     System.out.println(key +" is in the list");
 } else {
     System.out.println(key +" is not in your friends list");
//Selection Sort
    /* finds the smallest number and swaps it with first element, then does th next smallest etc
    9,1,6,5,2,3
    1,9,6,5,2,3
    1,2,6,5,9,3
    1,2,3,5,9.6
    1,2,3,5,6,9*/
    int[] numbers = { 9 , 1 , 6 , 5 , 2 , 3 };
    for(int i=0; i < numbers.length -1; i++){
        int indexMin = i;
        int min = numbers[i];
        for(int j=i+1; j < numbers.length; j++){
            if(min > numbers[j]){
            min = numbers[j];
            indexMin = j; //swap j with i
        }
  }
  if(indexMin != i){
     numbers[indexMin] = numbers[i];
     numbers[i] = min;
  }
    }

// insertion sort works by insertring a new elemtn into a sorted subset until sorted
    /*int[]numbers = {9,4,3,5}
    9
    9,4 -> 4,9
    4,9,3 -> 4,3,9 -> 3,4,9
    3,4,9,5 -> 3,4,5,9 
    in code it looks like this
    {10,6,-1,50,2}
    10,6
    6,10 -1
    6,-1 10
    -1,6,10,50 etc*/
    int currentElement;
    for(int i=1; i < numbers.length; i++){
   currentElement=numbers[i];
   int j = i-1; 
   for( ; j >= 0 && numbers[j]> currentElement; j--){
      numbers[j+1] = numbers[j];
     }
   numbers[j+1] = currentElement;
   }

//public class CardsMethods {
   public static void main(String[] args) {
       String suitName = "", cardIdentity = "";
       int card = generateCard();
       String suit = findSuit(card);
       String identity = findIdentity(card);
       // Display card identity and suit name
       System.out.println("You picked the " + identity + " of " + suit);
   }

 }

//multidimensional arrays
    /*each bracket represents an extra dimension
     */
    int [][] arrayname = {{1,2,3,4},{5,6,7,8},{9,10,11,12}}; //makes a 3 row 4 column matrix/array 
    dataType[][] referenceVar; //declare the array
    referenceVar = new dataType [10][10] //create and assign variable reference
    dataType[][] refVar = new dataType[10][10] // delcare + create in 1 statement
    dataType refVar [][] = new dataType [10][10] // another way to delcare and create


//Ragged arrays
/*In ragged array, each row in 2d array is an array itself, so the raws can have diff elgnths */
    int[][] raggedMatrix = {{1,2,3,4,5},{1,2,3,4},{1,2,3},{1,2}};
    matrix[0].length = 5
    matrix[1].length = 4
    matrix[2].length = 3


    }


}


