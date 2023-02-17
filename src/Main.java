import lists.MyIntegerList;

import java.util.Random;

import static testMetods.TestMetods.quickSort;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100_000];
        Random random = new Random();
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt();
        }
        long start5 = System.currentTimeMillis();
        int begin = 0;
        int end = arr.length - 1;
        quickSort(arr, begin, end);
        System.out.println(System.currentTimeMillis() - start5 + " рекурсивная сортировка");
        System.out.println("");
    //    System.out.println(Arrays.toString(arr));

        MyIntegerList myIntegerList = new MyIntegerList(10);
//        MyIntegerList myIntegerList2 = new MyIntegerList(10);
//
        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);
        myIntegerList.add(5);
//        myIntegerList.add(6);
//        myIntegerList.add(7);
//        myIntegerList.add(8);
//        myIntegerList.add(9);
//        myIntegerList.add(10);

        System.out.println(myIntegerList.contains2(3));
//        Random random = new Random();
//        int[] arr = new int[100000];
//        for (int i = 0; i <arr.length; i++) {
//            arr[i] = random.nextInt();
//        }
//        int[] arr2 = Arrays.copyOf(arr, arr.length);
//        int[] arr3 = Arrays.copyOf(arr, arr.length);
// Выбор самого быстрого метода
//        long start = System.currentTimeMillis();
//        sortBubble(arr);
//        System.out.println(System.currentTimeMillis() - start + " Пузырьковая сортировка");
//
//        long start2 = System.currentTimeMillis();
//        sortSelection(arr2);
//        System.out.println(System.currentTimeMillis() - start2 + " Сортировка выбором");

//        long start3 = System.currentTimeMillis();
//        sortInsertion(arr3);
//        System.out.println(System.currentTimeMillis() - start3 + " Сортировка вставкой");

//        myIntegerList2.add(1);
//        myIntegerList2.add(2);
//        myIntegerList2.add(3);
//// Метод 1
//        System.out.println(myIntegerList);
////// Метод 2
//        myIntegerList.add(3, 77);
//        System.out.println(myIntegerList);
//////// Метод 3
//        myIntegerList.set(3, 55);
//        System.out.println(myIntegerList);
//////// Метод 4
//        System.out.println("Метод 4");
//        myIntegerList.remove(4);
//        System.out.println(myIntegerList);
//////// Метод 5
//        myIntegerList.remove(4);
//        System.out.println(myIntegerList);
//////// Метод 6
//        System.out.println("Метод 6");
//        System.out.println(myIntegerList.contains(3));
////// // Метод 7
//        System.out.println(myIntegerList.indexOf(2));
//////// Метод 8
//        System.out.println(myIntegerList.lastIndexOf(2));
//////// Метод 9  get ( int index){
//        System.out.println("Метод 9");
//        System.out.println(myIntegerList.get(2));
////// Метод 10 equals
//        System.out.println(myIntegerList.equals(myIntegerList2));
////// Метод 11 size ()
//        System.out.println(myIntegerList.size());
////// Метод 12 isEmpty
//        System.out.println(myIntegerList.isEmpty());
////// Метод 13 clear
////        myIntegerList.clear();
////        System.out.println(myIntegerList);
//// // Метод 14 Integer[] toArray ()
//          System.out.println(Arrays.toString(myIntegerList.toArray()));
    }
}