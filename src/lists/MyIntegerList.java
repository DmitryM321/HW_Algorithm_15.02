package lists;

import allinterface.IntegerList;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MyIntegerList implements IntegerList<Integer> {
    private static final int DEFAULT_CAPACITY = 10;
    private Integer[] list;
    private int size;

    public MyIntegerList(int capacity)  {
        if (capacity < 0) {
            throw new IllegalArgumentException("Значение меньше нуля");
        } else if (capacity == 0) {
            list = new Integer[DEFAULT_CAPACITY];
        } else {
            list = new Integer[capacity];
        }
    }
    public MyIntegerList() {
        list = new Integer[DEFAULT_CAPACITY];
    }

    public void examCapacity(int capacity){
    int capacity1 = list.length;
    if(capacity > capacity1){
        int newCapacity = capacity1 * 2;
        list = Arrays.copyOf(list, newCapacity);
    }
    }
    @Override
    public Integer add(Integer item) {
        examCapacity(size + 1);
        if (list[list.length - 1] != null) {
            Integer[] newList = new Integer[list.length * 2];
            arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        return list[size++] = item;
    }
    @Override
    public Integer add(int index, int item) {
        examCapacity(size + 1);
        arraycopy(list, index, list, index + 1, size - index);
        list[index] = item;
        size++;
        return item;
    }
    @Override
    public Integer set(int index, int item) {
        mistakeFind(index);
        Integer integer1 = list[index];
        list[index] = item;
        return integer1;
    }

    @Override
    public Integer remove(Integer item) {
    for (int i = 0; i < list.length; i++) {
        if (list[i] != null && list[i].equals(item)) {
            System.arraycopy(list, i + 1, list, i, list.length - i - 1);
            size--;
        }
    }
        return item;
}
        @Override
        public Integer remove(int index){
        mistakeFind(index);
            Integer integer1 = list[index];
            System.arraycopy(list, index + 1, list, index, list.length - index - 1);
            size--;
            return integer1;
        }

        @Override
        public boolean contains(Integer item){
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(item)){
                    return true;
                }
            }
            return false;
        }
        @Override
        public int indexOf(Integer item){
            for (int i = 0; i < list.length; i++) {
                if (list[i] != null && list[i].equals(item)){
                    return i;
                }
            }
            return - 1;
        }
        @Override
        public int lastIndexOf(Integer item) {
            for (int i = size - 1; i >= 0; i--) {
                if ((list[i].equals(item))) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public Integer get (int index){
            mistakeFind(index);
            return list[index];
        }

    @Override
        public boolean equals (IntegerList otherList) {
            if (otherList == null) {
                throw new NullPointerException("Пустое значение");
            }
            if (otherList.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (!list[i].equals(otherList.get(i))) {
                    return false;
                }
            }
             return true;
          }
        @Override
        public int size () {
            return size;
        }
        @Override
        public boolean isEmpty () {
            return size == 0;
        }
        @Override
        public void clear () {
        list = new Integer[0];
        size = 0;
        }
        @Override
        public Integer[] toArray () {
            return Arrays.copyOf(list, size);
        }

        public static void sortInsertion2(int[] arr) { // Сортировка вставкой
            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                while (j > 0 && arr[j - 1] >= temp) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    public static boolean contains2(int[] arr, int element) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (element == arr[mid]) {
                return true;
            }
            if (element < arr[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return false;
    }
        @Override
        public String toString () {
            return "lists.MyStringList{" +
                    "array=" + Arrays.toString(list) +
                    ", size=" + size +
                    '}';
        }
        private void mistakeFind(int index){
            if (index < 0 || list[index] == null || index >= size) {
                throw new ArrayIndexOutOfBoundsException("Неправильный индекс");
            }
        }
    }


