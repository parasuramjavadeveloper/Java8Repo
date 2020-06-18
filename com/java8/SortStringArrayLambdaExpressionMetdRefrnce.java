package com.java8;

import java.util.Arrays;

class StringArraySort{
    public static  int sortMethod(String a,String b){
        return a.compareTo(b);
    }
}
public class SortStringArrayLambdaExpressionMetdRefrnce {
    public static void main(String[] args) {
        String[] stringArray = { "ab", "ef", "cd" };
        System.out.println("1 - Sort StringArray using > reference to static method ");
        System.out.println("2 - Here StringArraySort::sortMethod is a reference to "
                + "> static method sortMethod"
                + "> of class StringArraySort");
         Arrays.sort(stringArray,StringArraySort::sortMethod);
        System.out.print("Display sorted StringArray > ");
        for (String str:stringArray){
            System.out.println(str+ "");
        }


    }

}

/* Output

1 - Sort StringArray using > reference to static method
2 - Here StringArraySort::sortMethod is a reference to > static method sortMethod> of class StringArraySort
Display sorted StringArray > ab cd ef

*/
