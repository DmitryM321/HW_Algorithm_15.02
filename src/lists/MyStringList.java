package lists;

import allinterface.StringList;

import java.util.Arrays;
public class MyStringList implements StringList {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] list;
    private int size;

    public MyStringList(int capacity)  {
        if (capacity < 0) {
            throw new IllegalArgumentException("Значение меньше нуля");
        } else if (capacity == 0) {
            list = new String[DEFAULT_CAPACITY];
        } else {
            list = new String[capacity];
        }
    }
    public MyStringList() {
        list = new String[DEFAULT_CAPACITY];
    }

    public void examCapacity(int capacity){
    int capacity1 = list.length;
    if(capacity > capacity1){
        int newCapacity = capacity1 * 2;
        if(newCapacity < capacity){
            newCapacity = capacity;
        }
        list = Arrays.copyOf(list, newCapacity);
    }
    }
    @Override
    public String add(String item) {
        examCapacity(size + 1);
        if (list[list.length - 1] != null) {
            String[] newList = new String[list.length * 2];
            System.arraycopy(list, 0, newList, 0, list.length);
            list = newList;
        }
        return list[size++] = item;
    }

    @Override
    public String add(int index, String item) {
        return null;
    }

       @Override
    public String set(int index, String item) {
        mistakeFind(index);
        String string1 = list[index];
        list[index] = item;
        return string1;
    }
    @Override
    public String remove(String item) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] != null && list[i].equals(item)) {
                System.arraycopy(list, i + 1, list, i, list.length - i - 1);
                size--;
            }
        }
        return item;
    }
        @Override
        public String remove ( int index){
        mistakeFind(index);
            String string1 = list[index];
            System.arraycopy(list, index + 1, list, index, list.length - index - 1);
            size--;
            return string1;
        }
        @Override
        public boolean contains (String item){
            for (int i = 0; i < list.length; i++) {
                if (list[i].trim().equals(item.trim())){
                    return true;
                }
            }
            return false;
        }
        @Override
        public int indexOf (String item){
            for (int i = 0; i < list.length; i++) {
                if (list[i] != null && list[i].equals(item)){
                    return i;
                }
            }
            return - 1;
        }
        @Override
        public int lastIndexOf (String item) {
            for (int i = size - 1; i >= 0; i--) {
                if ((list[i].trim().equals(item.trim()))) {
                    return i;
                }
            }
            return -1;
        }

        @Override
        public String get ( int index){
            mistakeFind(index);
            return list[index];
        }

        @Override
        public boolean equals (StringList otherList) {
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
        list = new String[0];
        size = 0;
        }
        @Override
        public String[] toArray () {
            return Arrays.copyOf(list, size);
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


