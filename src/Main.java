import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        MyStringList myStringList = new MyStringList(5);
        MyStringList myStringList2 = new MyStringList(5);
        myStringList2.add("one");
        myStringList2.add("two");
        myStringList2.add("three");
        myStringList2.add("four");
        myStringList2.add("five");

// Метод 1
        myStringList.add("one");
        myStringList.add("two");
        myStringList.add("three");
        myStringList.add("four");
        myStringList.add("five");
        System.out.println(myStringList);
//// Метод 2
        myStringList.add(3, "try");
        System.out.println(myStringList);
////// Метод 3
        myStringList.set(3, "try2");
        System.out.println(myStringList);
//// Метод 4
        System.out.println("Метод 4");
        myStringList.remove("three");
        System.out.println(myStringList);
//// Метод 5
        myStringList.remove(0);
        System.out.println(myStringList);
//// Метод 6
        System.out.println("Метод 6");
        System.out.println(myStringList.contains("try2"));
// // Метод 7
        System.out.println(myStringList.indexOf("five"));
//// Метод 8
        System.out.println(myStringList.lastIndexOf("five"));
//// Метод 9  get ( int index){
        System.out.println("Метод 9");
        System.out.println(myStringList.get(2));
// Метод 10 equals
        System.out.println(myStringList2.equals(myStringList));
// Метод 11 size ()
        System.out.println(myStringList.size());
// Метод 12 isEmpty
        System.out.println(myStringList.isEmpty());
// Метод 13 clear
//        myStringList.clear();
//        System.out.println(myStringList);
 // Метод 14 String[] toArray ()
        System.out.println(Arrays.toString(myStringList.toArray()));
    }
}