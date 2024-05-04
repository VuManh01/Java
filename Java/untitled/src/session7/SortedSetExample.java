package session7;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void sortedSetDemo(){
        //Khai bao SortedSet
        SortedSet<String> st = new TreeSet<String>();
        //add method to add elements
        st.add("Vinh");
        st.add("Van");
        st.add("Ngoc");
        st.add("Hai");
        st.add("Anh");
        st.add("Hoang");
        System.out.println("Initial TreeSet " + st);
        //Remove the element
        st.remove("Hai");
        st.add("Vinh");
        System.out.println("After remove and add: " + st);
    }

    public static void main(String[] args){
        sortedSetDemo();;
    }
}
