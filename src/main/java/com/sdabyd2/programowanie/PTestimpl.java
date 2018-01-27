package com.sdabyd2.programowanie;



import java.lang.reflect.Array;
import java.util.*;

public class PTestimpl {

    public static String last(List<String> lista) {


        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        String temp = last(lista);

        return temp;

    }

    public static int length(List<Integer> lista){
        return lista.size();
    }

    public static List<Integer> reverse(List<Integer> lista) {

//        List<Integer> list = new ArrayList<Integer>();
//
//        for (int i=lista.size()-1; i>=0; i--) {
//            list.add(lista.get(i));
//        }

        Collections.reverse(lista);



       return lista;
    }


    public static boolean isPalindrome(List<String> strings) {

        //1 stworzyc liste
        // do tej listy wrzucic odwrocona strings
        // zrobic equals

        ArrayList<String> stringsInv = new ArrayList<>();

        for (int i=strings.size()-1; i>=0; i--) {
            stringsInv.add(strings.get(i));
        }
            return strings.equals(stringsInv);
      //  return Objects.equals(strings) && Objects.equals(stringsInv);

}


//    public static Object[] removeAt(List<String> strings, int k) {
//        List<String> input = new ArrayList<String>(strings);
//        String kth = input.remove(k -1);
//
//        return new Object[]{input, kth};
    }
}
