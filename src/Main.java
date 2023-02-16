import lists.MyIntegerList;
import java.util.Arrays;
import java.util.Random;
import static lists.MyIntegerList.contains2;
import static lists.MyIntegerList.sortInsertion2;
import static testMetods.TestMetods.sortInsertion;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[100000];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt();
        }
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
// Выбор самого быстрого метода
//        long start = System.currentTimeMillis();
//        sortBubble(arr);
//        System.out.println(System.currentTimeMillis() - start + " Пузырьковая сортировка");
//
//        long start2 = System.currentTimeMillis();
//        sortSelection(arr2);
//        System.out.println(System.currentTimeMillis() - start2 + " Сортировка выбором");

        long start3 = System.currentTimeMillis();
        sortInsertion(arr3);
        System.out.println(System.currentTimeMillis() - start3 + " Сортировка вставкой");

       // создание массива
        int[] myIntegerList4 = new int[100000];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = random.nextInt();
        }
        // запуск метода sortInsertion2 нашего класса
        long start4 = System.currentTimeMillis();
        sortInsertion2(myIntegerList4);
        System.out.println(System.currentTimeMillis() - start4 + " Сортировка вставкой");
        // запуск нового метода бинароного поиска contains2
        System.out.println(contains2(myIntegerList4, 33333));


        MyIntegerList myIntegerList = new MyIntegerList(10);
        MyIntegerList myIntegerList2 = new MyIntegerList(10);

        myIntegerList.add(1);
        myIntegerList.add(2);
        myIntegerList.add(3);
        myIntegerList.add(4);
        myIntegerList.add(5);

        myIntegerList2.add(1);
        myIntegerList2.add(2);
        myIntegerList2.add(3);
// Метод 1
        System.out.println(myIntegerList);
//// Метод 2
        myIntegerList.add(3, 77);
        System.out.println(myIntegerList);
////// Метод 3
        myIntegerList.set(3, 55);
        System.out.println(myIntegerList);
////// Метод 4
        System.out.println("Метод 4");
        myIntegerList.remove(4);
        System.out.println(myIntegerList);
////// Метод 5
        myIntegerList.remove(4);
        System.out.println(myIntegerList);
////// Метод 6
        System.out.println("Метод 6");
        System.out.println(myIntegerList.contains(3));
//// // Метод 7
        System.out.println(myIntegerList.indexOf(2));
////// Метод 8
        System.out.println(myIntegerList.lastIndexOf(2));
////// Метод 9  get ( int index){
        System.out.println("Метод 9");
        System.out.println(myIntegerList.get(2));
//// Метод 10 equals
        System.out.println(myIntegerList.equals(myIntegerList2));
//// Метод 11 size ()
        System.out.println(myIntegerList.size());
//// Метод 12 isEmpty
        System.out.println(myIntegerList.isEmpty());
//// Метод 13 clear
//        myIntegerList.clear();
//        System.out.println(myIntegerList);
// // Метод 14 Integer[] toArray ()
          System.out.println(Arrays.toString(myIntegerList.toArray()));
    }
}