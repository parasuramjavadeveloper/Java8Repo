package com.java8;

import java.util.Arrays;

class MySortStrings{
    public int sortStrngs(String a,String b){
       return  a.compareTo(b);
    }
}
public class SortStringArrayLambdaExprReferenceToInstanceMthd {
    public static void main(String[] args) {

        String[] stringArray = { "ab", "ef", "cd" };
        System.out.println("1- Sort StringArray using > "
                + "Reference to an instance method of a particular object");
        MySortStrings mySortStrings = new MySortStrings();
        System.out.println("2 - Here String::sortStrngs is a reference to "
                + "> instance method MySortStrings "
                + "> of class String");
        Arrays.sort(stringArray,mySortStrings::sortStrngs);

        for(String str:stringArray){
            System.out.println(str+"");
        }


    }
}

/* Output

1- Sort StringArray using > Reference to an instance method of a particular object
2 - Here String::stringSortMethod is a reference to > instance method StringSort > of class String
Display sorted StringArray > ab cd ef

*/
