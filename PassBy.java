public class PassBy{
   public static void main(String[]args){
       int[] numbers = {100, 200, 300, 400};
       printArray(numbers);
       int[] newNumbers = copyArray(numbers);
       doubleArrayContent(numbers);
       printArray(numbers);
       //int[] newNumbers = copyArray(numbers);
       printArray(newNumbers);
   }
   public static void printArray(int[] list){
       for(int i=0; i < list.length; i++){
           System.out.print(list[i]+ " ");  
       }
 System.out.println();
      }
   public static void doubleArrayContent(int[] list){
       for (int i=0; i<list.length; i++)
       list[i] = list[i] * 2;
   }
   public static int[] copyArray(int[] list){
       int[] newList = new int[list.length];
       for(int i=0; i<list.length; i++){
       newList[i] = list[i];
       }
       return newList;
      }
}


