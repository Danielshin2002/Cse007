import java.util.Arrays;
public class OverloadArray {
    public static void main(String [] args){
        char [] arr1 = {'a','b','c','d'};
        char [] arr2 = {'a','b','c','d','z'};
        char [] combine = join(arr1,arr2);
        System.out.println(Arrays.toString(combine));

    }
    public static boolean equals (int [] list1, int [] list2){
        if(list1.length != list2.length)
             return false;
        else{
            for(int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i])
                   return false;
            }
        }
        return true;
    }
    public static boolean equals (char []list1, char[] list2){
        if(list1.length != list2.length)
            return false;
        else{
            for(int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i])
           return false;
    }
}
return true;
}
//public static int[] join (int [] list1, int [] list2)
public static char[] join (char []list1, char[] list2){
    char [] joinChar = new char[list1.length+list2.length];
    int index = 0;
    for(index = 0; index < list1.length; index++){
        joinChar[index] = list1[index];
    }
    int index2 = index;
    int i = 0;
    for(index2 = index, i = 0; i < list2.length; i++,index2++){
        joinChar[index2] = list2[i];
    }
    return joinChar;

}

}

    
